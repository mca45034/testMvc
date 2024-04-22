package com.rays.form;

import org.hibernate.validator.constraints.NotEmpty;

public class StudentForm {
	private long id;
	
	private Long[] ids;
	
	@NotEmpty
	private String fName;
	@NotEmpty
	private String lName;
	@NotEmpty
	private String course;
	@NotEmpty
	private String duration;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Long[] getIds() {
		return ids;
	}
	public void setIds(Long[] ids) {
		this.ids = ids;
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
