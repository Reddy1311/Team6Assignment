package com.team6.accessingdatamysql;

import java.util.List;

//import org.springframework.data.jpa.repository.JpaRepository;

//import org.springframework.data.repository.CrudRepository;
//
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called studentRepository
// CRUD refers Create, Read, Update, Delete

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
List<Student> findAllByStdid(Integer Stdid);
}