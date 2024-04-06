package com.example.StudentManagementSystem.dtos;

import com.example.StudentManagementSystem.models.Department;
import com.example.StudentManagementSystem.models.Student;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class UpdateStudentRequest
{
    @NotBlank
    private String name;
    @NotBlank
    private String contact;
    private String address;
    private int year;
    private int semester;
    @Enumerated(value = EnumType.ORDINAL)
    private Department department;
    public Student to()
    {
        return Student.builder()
                .name(this.name)
                .year(this.year)
                .department(this.department)
                .contact(this.contact)
                .semester(this.semester)
                .build();
    }

}
