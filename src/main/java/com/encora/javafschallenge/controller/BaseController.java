package com.encora.javafschallenge.controller;

import com.encora.javafschallenge.dto.FetchTestDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @GetMapping("/health-check")
    public String healthCheck() {
        return "OK";
    }

    @GetMapping(value = "/fetch-test", produces = MediaType.APPLICATION_JSON_VALUE)
    public FetchTestDTO fetchTest() {
        return FetchTestDTO.builder().message("Test OK!").build();
    }
}
