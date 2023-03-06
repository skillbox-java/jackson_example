package ru.skillbox.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Person {
    private String name;
    private int age;
    private boolean isMarried;
    private List<String> hobbies;
    private List<String> children;
    private Car car;
    private Job job;
}

