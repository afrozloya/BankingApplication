package com.banking.bankingapi.controller;

import com.banking.bankingapi.service.BankingService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
public class BankingController {

    @Autowired
    BankingService bankingService;

    @Operation(summary = "test", description = "test desc")
    @GetMapping("/test")
    public String getTest() {
        return "hello";
    }

}