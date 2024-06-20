package com.rharhuky.api.domain.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
public class CreateStudentRequest {

    @JsonAlias(value = "student_name")
    private String name;

    @JsonAlias(value = "student_birthday")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE, pattern = "yyyy/MM/dd")
    private LocalDate birthday;

}
