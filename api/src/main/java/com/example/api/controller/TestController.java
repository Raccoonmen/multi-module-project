package com.example.api.controller;

import com.example.api.model.TestInput;
import com.example.api.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @PostMapping("/test")
    public void test(@RequestBody TestInput parameter) {

        testService.toSaveData(parameter);
    }
}
