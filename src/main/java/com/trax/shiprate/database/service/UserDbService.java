package com.trax.shiprate.database.service;

import com.trax.shiprate.common.ActiveEnum;
import com.trax.shiprate.database.db.entity.User;
import com.trax.shiprate.database.db.repository.UserRepository;
import com.trax.shiprate.database.exceptions.*;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@Service
public class UserDbService extends BaseDbService {

    private final UserRepository repository;

    public UserDbService(UserRepository repository) {
        super("User");
        this.repository = repository;
    }

    /**
     * Create a record with name and email
     *
     * @param name  - value for name
     * @param email - value for email
     * @return
     * @throws DataIntegrityViolationException
     */
    public User create(@NonNull String email, @NonNull String name) throws DatabaseCreateFailureException, DatabaseAccessException {

        try {
            User record = new User();
            record.setName(name);
            record.setEmail(email);
            record.setCreatedAt(LocalDateTime.now());
            record.setActive(ActiveEnum.ACTIVE.value);
            User saved = repository.save(record);
            log.debug(getCreatedMessage(email));
            return saved;
        } catch (Exception e) {
            switch (e.getClass().getSimpleName()) {
                case "DataIntegrityViolationException":
                    log.info(getCreatedFailureMessage(email));
                    throw new DatabaseCreateFailureException("DataIntegrityViolationException: " + e.getMessage());
                case "ConstraintViolationException ":
                    log.info(getCreatedFailureMessage(email));
                    throw new DatabaseCreateFailureException("ConstraintViolationException: " + e.getMessage());
                default:
                    log.info(getDbAccessMessage(email));
                    throw new DatabaseAccessException("DatabaseAccessException: " + e.getMessage());
            }
        }
    }

    /**
     * Update the User name and email
     *
     * @param name  - value for name
     * @param email - value for email
     * @return
     */
    public User update(@NonNull String email, String name)
            throws DatabaseRetrievalFailureException, DatabaseUpdateFailureException, DatabaseAccessException {

        User record = repository.findByEmail(email).orElseThrow(() -> new DatabaseRetrievalFailureException(getFoundFailureMessage(email)));
        try {
            record.setName(name);
            record.setEmail(email);
            record.setModifiedAt(LocalDateTime.now());
            User saved = repository.save(record);
            log.info(getUpdatedMessage(email));
            return saved;
        } catch (Exception e) {
            switch (e.getClass().getSimpleName()) {
                case "DataIntegrityViolationException", "ConstraintViolationException":
                    log.info(getUpdatedMessage(email));
                    throw new DatabaseUpdateFailureException(getUpdatedMessage(email));
                default:
                    log.info(getDbAccessMessage(email));
                    throw new DatabaseAccessException(getDbAccessMessage(email));
            }
        }
    }

    /**
     * Delete by Extid
     *
     * @param email - to delete
     * @return boolean
     * @throws DatabaseDeleteFailureException
     * @throws DatabaseRetrievalFailureException
     */
    public boolean delete(@NonNull String email) throws DatabaseDeleteFailureException, DatabaseRetrievalFailureException {
        // error if the record isn't there
        User record = repository.findByEmail(email).orElseThrow(() -> new DatabaseRetrievalFailureException(getFoundFailureMessage(email)));

        //update record to show it is deleted
        record.setDeletedAt(LocalDateTime.now());
        record.setActive(ActiveEnum.INACTIVE.value);
        repository.save(record);

        //success
        log.info(getDeletedMessage(email));
        return true;
    }

    /**
     * Find User
     *
     * @param id - to find
     * @return boolean
     */
    public User findById(int id) throws DatabaseRetrievalFailureException {
        String thisId = Integer.toString(id);
        User record = repository.findById(id).orElseThrow(() -> new DatabaseRetrievalFailureException(getFoundFailureMessage(thisId)));
        log.info(getFoundMessage(thisId));
        return record;
    }

    /**
     * Find User
     *
     * @param email - to find
     * @return boolean
     */
    public User findByEmail(@NonNull String email) throws DatabaseRetrievalFailureException {
        User record = repository.findByEmail(email).orElseThrow(() -> new DatabaseRetrievalFailureException(getFoundFailureMessage(email)));
        log.info(getFoundMessage(email));
        return record;
    }

    /**
     * @return
     */
    public List<User> findAll() {
        List<User> records = repository.findAll();
        log.info(getListMessage(records.size()));
        return records;
    }
}
