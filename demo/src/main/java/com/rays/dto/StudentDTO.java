package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "ST_STUDENT")
public class StudentDTO {
	@Id
	@GeneratedValue(generator = "ncspk")
	@GenericGenerator(name = "ncspk",strategy = "native")
	@Column(name = "ID" ,unique = true,nullable = false)
	protected Long id;
	
	@Column(name = "F_NAME",length = 50)
	private String fName;
	
	@Column(name = "L_NAME",length = 50)
	private String lName;
	
	@Column(name = "COURSE",length = 50)
	private String course;
	
	@Column(name = "DURATION",length = 50)
	private String duration;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	
	
	

}
