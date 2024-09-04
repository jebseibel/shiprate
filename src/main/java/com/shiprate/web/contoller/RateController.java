package com.shiprate.web.contoller;

import com.shiprate.database.db.entity.Account;
import com.shiprate.web.service.RateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
public class RateController {

    RateService rateService;

    public RateController(RateService rateService) {
        this.rateService = rateService;
    }

    @GetMapping("/accounts/{id}")
    public Account getAccountById(@PathVariable int id) {
        log.info("here");
        return rateService.getAccountByid(id);
    }

//    @GetMapping("/find")
//    public Account find() {
//        return rateService.getAccountByid(id);
//    }
}
