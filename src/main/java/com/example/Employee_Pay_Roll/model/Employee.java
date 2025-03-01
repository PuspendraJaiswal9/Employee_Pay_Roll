package com.example.Employee_Pay_Roll.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.util.Date;

@Entity
@Table(name = "employee_table")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    public Employee() {}

    public Employee(Long id, String name, double salary, String gender, Date startDate, String note, String profilePic, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.startDate = startDate;
        this.note = note;
        this.profilePic = profilePic;
        this.department = department;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public String getGender() { return gender; }
    public Date getStartDate() { return startDate; }
    public String getNote() { return note; }
    public String getProfilePic() { return profilePic; }
    public String getDepartment() { return department; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setSalary(double salary) { this.salary = salary; }
    public void setGender(String gender) { this.gender = gender; }
    public void setStartDate(Date startDate) { this.startDate = startDate; }
    public void setNote(String note) { this.note = note; }
    public void setProfilePic(String profilePic) { this.profilePic = profilePic; }
    public void setDepartment(String department) { this.department = department; }
}
