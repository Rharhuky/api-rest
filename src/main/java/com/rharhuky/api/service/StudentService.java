package com.rharhuky.api.service;

import com.rharhuky.api.domain.dto.CreateStudentRequest;
import com.rharhuky.api.domain.dto.StudentResponse;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.UUID;

public interface StudentService {

    StudentResponse get(UUID id);

    List<StudentResponse> get(Pageable pageable);

    StudentResponse create(CreateStudentRequest createStudentRequest);

}
