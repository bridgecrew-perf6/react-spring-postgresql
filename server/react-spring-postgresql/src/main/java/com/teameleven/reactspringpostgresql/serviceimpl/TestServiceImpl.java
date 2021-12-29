package com.teameleven.reactspringpostgresql.serviceimpl;

import com.teameleven.reactspringpostgresql.domain.Test;
import com.teameleven.reactspringpostgresql.dto.test.CreateTestDto;
import com.teameleven.reactspringpostgresql.dto.test.UpdateTestDto;
import com.teameleven.reactspringpostgresql.service.TestService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class TestServiceImpl implements TestService {
    //private final TestRepository testRepository;

    //public TestServiceImpl(TestRepository testRepository) {
    //    this.testRepository = testRepository;
    //}
    public TestServiceImpl() {
    }

    @Override
    public Test create(CreateTestDto createTestDto) throws Exception {
        return null;
    }

    @Override
    public Collection<Test> findAll() {
        var tests = new ArrayList<Test>();

        tests.add(new Test(1L, "test1", false));
        tests.add(new Test(2L, "test2", false));

        return tests;
    }

    @Override
    public Test findOneById(Long id) {
        return null;
    }

    @Override
    public Test findOneByName(String name) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Test update(UpdateTestDto updateTestDto) throws Exception {
        return null;
    }
}
