package yncrea.pw03.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long courseId;
	
	@Column(name="validated")
	private boolean validated;
	
	@ManyToOne
	private Student student;
	
	@OneToMany(cascade= {CascadeType.ALL}, mappedBy="course")
	private List<Work> works;
	

	

	public Course() {}
	public Course(Student student) {
		this.student=student;
	}
	
	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

}
