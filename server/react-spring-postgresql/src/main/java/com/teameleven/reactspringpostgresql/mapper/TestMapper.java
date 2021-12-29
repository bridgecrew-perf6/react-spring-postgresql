package com.teameleven.reactspringpostgresql.mapper;

import com.teameleven.reactspringpostgresql.domain.Test;
import com.teameleven.reactspringpostgresql.dto.test.TestDto;

import java.util.ArrayList;
import java.util.Collection;

public class TestMapper {

    public static TestDto TestToTestDto(Test test) {
        return new TestDto(test.getId(), test.getName());
    }

    public static Collection<TestDto> TestsToTestDtos(Collection<Test> tests) {
        Collection<TestDto> testDtos = new ArrayList<TestDto>();
        for (var test : tests) {
            testDtos.add(TestToTestDto(test));
        }
        return testDtos;
    }
}
