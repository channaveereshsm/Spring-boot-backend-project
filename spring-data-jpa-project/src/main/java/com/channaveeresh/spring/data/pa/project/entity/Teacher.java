package com.channaveeresh.spring.data.pa.project.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
public class Teacher {

    @SequenceGenerator(
            name = "teacher_sequence",
            sequenceName = "teacher_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy= GenerationType.SEQUENCE,
            generator = "teacher_sequence"

    )
    @Id
   private Long teacherId;
   private String firstName;
   private String LastName;
//   @OneToMany(
//           cascade = CascadeType.ALL
//
//   )
//   @JoinColumn(
//           name = "teacher_id",
//           referencedColumnName = "teacherId"
//   )
//   private List<Course> courses;


}
