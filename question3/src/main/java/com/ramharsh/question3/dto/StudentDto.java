package com.ramharsh.question3.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class StudentDto {

    @NotBlank(message = "Name must not be blank")
    private String name;

    @NotNull(message = "Age must not be null")
    @Min(value = 18, message = "Age must be 18 or above")
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
