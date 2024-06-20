package com.rharhuky.api.domain.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
public class CreateStudentRequest {

    @JsonAlias(value = "student_name")
    private String name;

    @JsonAlias(value = "student_birthday")
    private LocalDate birthday;

}
