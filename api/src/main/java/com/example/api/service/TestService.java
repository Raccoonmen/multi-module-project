package com.example.api.service;

import com.example.api.model.TestInput;
import org.springframework.stereotype.Service;

@Service
public interface TestService {
    boolean toSaveData(TestInput parameter);

}
