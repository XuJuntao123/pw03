package yncrea.pw03.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Work {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long workId;
	
	@Column(name="workname")
	private String workname;
	
	@OneToMany(cascade= {CascadeType.ALL}, mappedBy="work")
	private Course course;
	
	@Column(name="grade")
	private Integer grade;
	

	public Work() {}
	public Work(String workname, Course course, Integer grade) {
		this.workname=workname;
		this.course=course;
		this.grade=grade;
	}
	
	public void setWorkId(long workId) {
		this.workId = workId;
	}

}


