package com.trax.shiprate.web.controller;

import com.trax.shiprate.database.db.entity.Account;
import com.trax.shiprate.web.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/{id}")
    public Account getAccountById(@PathVariable int id) {
        log.info("here");
        return accountService.getAccountByid(id);
    }

    @GetMapping("/extid/{id}")
    public Account getAccountByExtid(@PathVariable String extid) {
        log.info("here");
        return accountService.getAccountExtid(extid);
    }
}
