package com.channaveeresh.spring.data.pa.project.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="tbl_student",
uniqueConstraints = @UniqueConstraint(
        name="email_unique",
        columnNames = "email_address"
))
public class Student {
    @Id
    @SequenceGenerator(
            name="student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long studentId;
    private String firstName;
    private String lastName;
    @Column(name="email_address",
    nullable = false,
    length = 100)
    private String emailId;
    private String guardianName;
    private String quardianEmail;
    private String guardianMobile;
}
