package com.channaveeresh.spring.data.pa.project.repository;

import com.channaveeresh.spring.data.pa.project.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    public List<Student> findByFirstName(String firstName);
    public List<Student> findByLastName(String lastName);
    //jpl
    @Query("select s.firstName from Student s where s.emailId=?1")
    String getStudentFirstNameByEmalId(String emailId);
    /* native query */
    @Query(
            value = "select * from tbl_student s where s.email_address=?1",
            nativeQuery = true
    )
    Student getStudentByEmailNative(String emailId);

    @Query(
            value = "select * from tbl_student s where s.email_address= :emailId AND s.first_name= :firstName",
            nativeQuery = true

    )
    List<Student> getStudentDetailsByNameAndEmail(@Param("emailId") String emailId,@Param("firstName") String firstName);
    @Modifying
    @Transactional
    @Query(
            value = "update tbl_student s set s.first_name=?1 where s.email_address=?1",
            nativeQuery = true
    )
    int updatedateFirstNameByEmailId(String firstName,String emailId);

}
