package com.example.Employee_Pay_Roll.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {
    private Long id;
    //Validation
    @NotBlank(message = "Name should not be empty")
    @Size(min = 2, message = "Name must be at least 2 characters long")
    private String name;

    @Min(value = 10000, message = "Salary should be greater than 10000")
    @Max(value = 50000, message = "Salary should be less than 50000")
    private double salary;

    @NotBlank(message = "Gender should not be empty")
    private String gender;

    @NotNull(message = "Start Date is required")
    private Date startDate;

    private String note;

    private String profilePic;

    @NotBlank(message = "Department should not be empty")
    private String department;
}
