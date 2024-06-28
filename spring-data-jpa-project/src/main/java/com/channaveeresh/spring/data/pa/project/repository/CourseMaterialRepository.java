package com.channaveeresh.spring.data.pa.project.repository;

import com.channaveeresh.spring.data.pa.project.entity.CourseMaterial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseMaterialRepository extends JpaRepository<CourseMaterial,Long> {

}
