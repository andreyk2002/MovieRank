package com.test.test.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/mock")
public class MockController {

    @GetMapping("/")
    public String getMock() {
        return UUID.randomUUID().toString();
    }
}
