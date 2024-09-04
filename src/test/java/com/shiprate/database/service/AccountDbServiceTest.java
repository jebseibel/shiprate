package com.shiprate.database.service;

import com.shiprate.database.DomainBuilderDatabase;
import com.shiprate.database.db.entity.Account;
import com.shiprate.database.db.repository.AccountRepository;
import com.shiprate.database.exceptions.DatabaseAccessException;
import com.shiprate.database.exceptions.DatabaseDeleteFailureException;
import com.shiprate.database.exceptions.DatabaseRetrievalFailureException;
import com.shiprate.database.exceptions.DatabaseUpdateFailureException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AccountDbServiceTest {

    @InjectMocks
    AccountDbService service;

    @Mock
    private AccountRepository accountRepository;

    @Nested
    class CreateTests {

        Account item = DomainBuilderDatabase.getAccount();
        String extid = item.getExtid();
        String name = item.getName();
        String description = item.getDescription();

        @Test
        void created() throws Exception {
            // mocks
            when(accountRepository.save(any(Account.class))).thenReturn(item);

            Account result = service.create(extid, name, description);

            // validate
            assertNotNull(result);
            assertEquals(extid, result.getExtid());
            assertEquals(name, result.getName());
            assertEquals(description, result.getDescription());
        }
    }

    @Nested
    class UpdateTests {

        Account item = DomainBuilderDatabase.getAccount();
        Optional<Account> itemOptional = Optional.of(item);


        @Test
        void updated() throws DatabaseUpdateFailureException, DatabaseRetrievalFailureException, DatabaseAccessException {
            String extid = UUID.randomUUID().toString();
            String newName = DomainBuilderDatabase.getNameRandom();
            String newDescription = DomainBuilderDatabase.getNameRandom();

            // mocks
            when(accountRepository.findByExtid(extid)).thenReturn(itemOptional);
            when(accountRepository.save(any(Account.class))).thenReturn(item);

            // execute
            Account result = service.update(extid, newName, newDescription);

            // validate
            assertNotNull(result);
        }


        @Test
        void updatedBadExtid() {
            // setup
            String extidBad = item.getExtid();

            // mocks
            when(accountRepository.findByExtid(extidBad)).thenReturn(Optional.empty());

            // test
            assertThrows(DatabaseRetrievalFailureException.class, () -> service.findByExtid(extidBad));
        }
    }

    @Nested
    class FindMockTests {

        Account item = DomainBuilderDatabase.getAccount();
        Optional<Account> itemOptional = Optional.of(item);
        String extid = item.getExtid();

        @Test
        @DisplayName("FindByExtId - Found")
        void findByExtid() throws DatabaseRetrievalFailureException {
            // mocks
            when(accountRepository.findByExtid(extid)).thenReturn(itemOptional);

            // execute
            Account result = service.findByExtid(extid);

            // validate
            //verify(accountRepository).findByExtid(extid);
            assertNotNull(result);
            assertEquals(result.getExtid(), extid);
        }

        @Test
        @DisplayName("FindByExtId - Not found")
        void findByExtid_Notfound() throws DatabaseRetrievalFailureException {
            // setup
            String extidBad = item.getExtid();

            // mocks
            when(accountRepository.findByExtid(extidBad)).thenReturn(Optional.empty());

            // test
            assertThrows(DatabaseRetrievalFailureException.class, () -> service.findByExtid(extidBad));
        }
    }

    @Nested
    class DeleteTests {

        @Test
        void deleted() throws DatabaseRetrievalFailureException, DatabaseDeleteFailureException {
            Account item = DomainBuilderDatabase.getAccount();
            String extid = item.getExtid();

            //mock
            when(accountRepository.findByExtid(extid)).thenReturn(Optional.of(item));

            //execute
            boolean result = service.delete(extid);

            // validate
            assertTrue(result);
        }

        @Test
        void deleteBadExtid() {
            String badExtid = UUID.randomUUID().toString();
            assertThrows(DatabaseRetrievalFailureException.class, () -> service.delete(badExtid));
        }
    }
}