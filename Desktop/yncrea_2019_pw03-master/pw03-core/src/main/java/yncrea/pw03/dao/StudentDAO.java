package yncrea.pw03.dao;

import java.util.List;

import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import yncrea.pw03.entity.Student;


public interface StudentDAO extends JpaRepository<Student,Long> {
	List<Student> findByLastname(String lastname);
	List<Student> findAll();
	//List<Student> findByLastnameAndStudentId(String lastname,long studentId);
	//@Query("SELECT u FROM User u WHERE u.credentials.login = :login")
	 //Student authenticate(@Param("login")String login);

}

