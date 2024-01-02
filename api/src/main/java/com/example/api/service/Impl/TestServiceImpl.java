package com.example.api.service.Impl;

import com.example.api.model.TestInput;
import com.example.api.service.TestService;
import com.example.database.domain.Test;
import com.example.database.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {

    private final TestRepository testRepository;

    @Override
    public boolean toSaveData(TestInput parameter) {
        Test test = new Test();
        test.setUserKey(parameter.getUser_key());
        test.setPassword(parameter.getPassword());
        testRepository.save(test);

        return true;
    }
}
