package com.teameleven.reactspringpostgresql.service;

import com.teameleven.reactspringpostgresql.domain.Test;
import com.teameleven.reactspringpostgresql.dto.test.CreateTestDto;
import com.teameleven.reactspringpostgresql.dto.test.UpdateTestDto;
import com.teameleven.reactspringpostgresql.dto.test.UpdateTestDto;

import javax.validation.Valid;
import java.util.Collection;

public interface TestService {

    Test create(CreateTestDto createTestDto) throws Exception;

    Collection<Test> findAll();

    Test findOneById(Long id);

    Test findOneByName(String name);

    Test update(@Valid UpdateTestDto updateTestDto) throws Exception;

    void delete(Long id);
}
