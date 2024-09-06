package com.shiprate.database.db.repository;

import com.shiprate.database.DomainBuilderDatabase;
import com.shiprate.database.db.entity.User;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataIntegrityViolationException;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private UserRepository repository;

    @Nested
    class SuiteCrud {

        @Test
        void create() {
            User item = DomainBuilderDatabase.getUser();
            assertNull(item.getId());
            User result = repository.save(item);

            //test
            assertAll("Creation tests",
                    () -> assertNotNull(result, "result is not null"),
                    () -> assertTrue(result.getId() != 0, "err"),
                    () -> assertNotNull(item.getCreatedAt())
            );
        }

        @Test
        void createUniqueName() {
            String name = "notUnique_" + DomainBuilderDatabase.randomString();
            User item1 = DomainBuilderDatabase.getUser(name);
            User item2 = DomainBuilderDatabase.getUser(name);

            repository.save(item1);
            assertThrows(DataIntegrityViolationException.class, () -> repository.save(item2));
        }

        @Test
        void update() {
            User item = DomainBuilderDatabase.getUser();
            assertNull(item.getId());
            assertNull(item.getModifiedAt());
            User record = repository.save(item);

            //now update
            String changedName = "description_update";
            record.setName(changedName);
            record.setModifiedAt(LocalDateTime.now());
            User resultUpdate = repository.save(record);

            //test
            assertNotNull(resultUpdate);
            assertEquals(resultUpdate.getName(), changedName);
            assertNotNull(resultUpdate.getModifiedAt());
        }

        @Test
        void delete() {
            User item = DomainBuilderDatabase.getUser();
            assertNull(item.getId());
            assertNull(item.getDeletedAt());
            User record = repository.save(item);

            //now update
            record.setDeletedAt(LocalDateTime.now());
            User resultUpdate = repository.save(record);

            //test
            assertNotNull(resultUpdate);
            assertNotNull(resultUpdate.getDeletedAt());
        }
    }

    @Nested
    class SuiteFind {

        @Test
        void findById() {
            String name = "name" + DomainBuilderDatabase.randomString();
            User record = DomainBuilderDatabase.getUser(name);
            User item = repository.save(record);
            User result = repository.findById(item.getId()).get();

            //test
            assertNotNull(result);
            assertEquals(result.getName(), name);
        }

        @Test
        void findByEmail() {
            String email = DomainBuilderDatabase.getEmailRandom();
            User record = DomainBuilderDatabase.getUser();
            record.setName(email);

            repository.save(record);
            User result = repository.findByName(email).get();

            //test
            assertNotNull(result);
            assertEquals(result.getEmail(), email);
        }

        @Test
        void findByName() {
            String name = "name" + DomainBuilderDatabase.randomString();
            User record = DomainBuilderDatabase.getUser(name);

            repository.save(record);
            User result = repository.findByName(name).get();

            //test
            assertNotNull(result);
            assertEquals(result.getName(), name);
        }

        @Test
        void findAll() {
            String name = "name" + DomainBuilderDatabase.randomString();
            User record = DomainBuilderDatabase.getUser(name);

            repository.save(record);
            List<User> result = repository.findAll();

            //test
            assertNotNull(result);
        }
    }
}