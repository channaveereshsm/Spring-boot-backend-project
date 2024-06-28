package com.channaveeresh.spring.data.pa.project.repository;

import com.channaveeresh.spring.data.pa.project.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class StudentRepositoryTest {
    @Autowired
      private StudentRepository studentRepository;
    @Test
      public void saveStudent()
      {
          Student student= Student.builder().emailId("channa2@gmail.com").firstName("channa1").lastName("malaguddapanavar")
                  .guardianName("subhash")
                  .guardianMobile("8197017630")
                  .quardianEmail("subhash@gmail1.com")
                  .build();
          studentRepository.save(student);
      }
      @Test
    public void printAllStudent()
      {
          long l=4;
          Optional<Student> s=studentRepository.findById(l);
          System.out.println(s);
      }
      @Test
      public void findStudentbyFirstName()
      {
          List<Student> s=studentRepository.findByFirstName("channa1");
          System.out.println(s);
      }
      @Test
    public void findStudenByLastName()
      {
          List<Student> s=studentRepository.findByLastName("malaguddappanavar");
          System.out.println(s);
      }
      @Test
    public void printStudentNameByEmailId()
      {
          String s= studentRepository.getStudentFirstNameByEmalId("channa2@gmail.com");
          System.out.println(s);

      }
      @Test
    public void getStudentByEmailNative()
      {
          Student s=studentRepository.getStudentByEmailNative("channa2@gmail.com");
          System.out.println(s);
      }
      @Test
    public void getStudentDetailsByNameAndEmail()
      {
          List<Student> s=studentRepository.getStudentDetailsByNameAndEmail("channa2@gmail.com","channa1");
          System.out.println(s);
          
      }
      @Test
      public void updatedateFirstNameByEmailId()
      {
        studentRepository.updatedateFirstNameByEmailId("channa2@gmail.com","channaveeresh");
      }

}