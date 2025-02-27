package com.example.Employee_Pay_Roll.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {
    private Long id;

    @NotBlank(message = "Name should not be empty")
    @Size(min = 2)
    private String name;

    @Min(value = 10000, message = "Salary should be greater than 10000")
    @Max(value = 50000, message = "Salary should be less than 50000")
    private double salary;
}
