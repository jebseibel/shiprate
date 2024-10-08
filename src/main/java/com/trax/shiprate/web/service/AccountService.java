package com.trax.shiprate.web.service;

import com.trax.shiprate.database.db.entity.Account;
import com.trax.shiprate.database.exceptions.DatabaseRetrievalFailureException;
import com.trax.shiprate.database.service.AccountDbService;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    AccountDbService accountDbService;

    public AccountService(AccountDbService accountDbService) {
        this.accountDbService = accountDbService;
    }

    public Account getAccountByid(int id) {
        Account account;
        try {
            account = accountDbService.findById(id);
        } catch (DatabaseRetrievalFailureException e) {
            return null;
        }
        return account;
    }

    public Account getAccountExtid(String extid) {
        Account account;
        try {
            account = accountDbService.findByExtid(extid);
        } catch (DatabaseRetrievalFailureException e) {
            return null;
        }
        return account;
    }
}
