package com.example.sec.security.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Date;

@RestController
@Slf4j
public class SampleController {

    @GetMapping("/sayHello")
    public String getSample(){
        log.info("Inside Controller Sample");
        return "Hello Time : " + LocalDate.now();

    }


}
