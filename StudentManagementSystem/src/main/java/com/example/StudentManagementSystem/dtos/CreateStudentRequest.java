package com.example.StudentManagementSystem.dtos;

import com.example.StudentManagementSystem.models.Department;
import com.example.StudentManagementSystem.models.Student;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateStudentRequest
{
    @NotBlank
    private String name;
    @NotBlank
    private String contact;

    @Enumerated(value = EnumType.ORDINAL)
    private Department department;
    @NotBlank
    private String address;
    @NotNull
    private int year;
    @NotNull
    private int semester;
    public Student to()
    {
        return Student.builder()
                .name(this.name)
                .contact(this.contact)
                .year(this.year)
                .semester(this.semester)
                .address(this.address)
                .department(this.department)
                .build();
    }

}
