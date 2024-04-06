package com.example.StudentManagementSystem.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.util.Date;
@Getter
@Setter
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Student
{
    @Id//setting as primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)//database will generate the id
    private int id;
    @NotBlank
    private String name;
    private String contact;
    @Enumerated(value = EnumType.ORDINAL)
    private Department department;
    private String address;
    private int year;
    private int semester;
    @CreationTimestamp//automatically add creation date
    private Date createdOn;
    @UpdateTimestamp//automatically add update time
    private Date updatedOn;
    public Student to(){
        return Student.builder()
                .id(this.id)
                .name(this.name)
                .contact(this.contact)
                .address(this.address)
                .department(this.department)
                .updatedOn(this.updatedOn)
                .createdOn(this.createdOn)
                .year(this.year)
                .semester(this.semester)
                .build();
    }

}
