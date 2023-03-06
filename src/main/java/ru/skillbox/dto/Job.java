package ru.skillbox.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Setter
@Getter
public class Job {
    private LocalDate since;
    private String city;
    private BigDecimal salary;

}
