package com.rharhuky.api.domain.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
public class StudentResponse {

    private String name;

    private LocalDate birthday;

    private LocalDate creationDate;

}
