package com.rharhuky.api.controller;

import com.rharhuky.api.domain.dto.CreateStudentRequest;
import com.rharhuky.api.domain.dto.StudentResponse;
import com.rharhuky.api.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping(value = "api/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping
    public ResponseEntity<StudentResponse> create(@RequestBody CreateStudentRequest createStudentRequest){
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.create(createStudentRequest));
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<StudentResponse> get(@RequestParam UUID id){
        return ResponseEntity.status(HttpStatus.OK).body(studentService.get(id));
    }

}

