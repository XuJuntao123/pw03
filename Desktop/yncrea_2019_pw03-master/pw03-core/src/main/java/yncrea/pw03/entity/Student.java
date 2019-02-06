package yncrea.pw03.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long studentId;
	
	@Column(name="firstname")
	private String lastname;
	
	@Column(name="lastname", nullable=false)
	private String firstname;
	
	@OneToMany(cascade= {CascadeType.ALL}, mappedBy="student")
	private List<Course> courses;
	
	//List<Course> courses = new ArrayList<Course>();

	

	public Student() {}
	public Student(long studentId, String lastname,String firstname) {
		this.studentId=studentId;
		this.lastname=lastname;
		this.firstname=firstname;
	}
	
	
	

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

}
