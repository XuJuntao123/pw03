package yncrea.pw03.dao;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import yncrea.pw03.entity.Student;

@Service
public class StudentService {
	
	    @Inject
	    private StudentDAO studentDAO;	 
	 
		@Transactional

		public List<Student> findByLastname(String lastname){
			return studentDAO.findByLastname(lastname);		    	
		}
		public List<Student> findAll(){
			return studentDAO.findAll();
		}
		public void saveStudent(List<Student> student) {
			studentDAO.save(student);
		}
		
}
