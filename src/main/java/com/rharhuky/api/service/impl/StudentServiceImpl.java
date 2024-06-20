package com.rharhuky.api.service.impl;

import com.rharhuky.api.domain.Student;
import com.rharhuky.api.domain.dto.CreateStudentRequest;
import com.rharhuky.api.domain.dto.StudentResponse;
import com.rharhuky.api.repository.StudentRepository;
import com.rharhuky.api.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public StudentResponse get(UUID id) {
        return mapToStudentResponse(studentRepository.findById(id).orElseThrow(RuntimeException::new));
    }

    @Override
    public List<StudentResponse> get(Pageable pageable) {
        return null;
    }

    @Override
    @Transactional
    public StudentResponse create(CreateStudentRequest createStudentRequest) {
        var newStudent = studentRepository.save(mapToStudent(createStudentRequest));
        return mapToStudentResponse(newStudent);
    }

    private Student mapToStudent(CreateStudentRequest createStudentRequest){
        var student = new Student();
        student.setBirthday(createStudentRequest.getBirthday());
        student.setName(createStudentRequest.getName());
        return student;
    }

    private StudentResponse mapToStudentResponse(Student student){
        var studentResponse = new StudentResponse();
        studentResponse.setName(student.getName());
        studentResponse.setBirthday(student.getBirthday());
        studentResponse.setCreationDate(student.getCreationDate());
        return studentResponse;
    }

}