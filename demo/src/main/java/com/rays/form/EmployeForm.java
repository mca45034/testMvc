package com.rays.form;

import javax.persistence.Column;

import org.hibernate.validator.constraints.NotEmpty;

public class EmployeForm {
	private long id;
	
	private Long[] ids;
	

	@NotEmpty
	private String name;
	
	@NotEmpty
	private String department;
	
	@NotEmpty
	private String login;
	
	@NotEmpty
	private String password ;
	
	@NotEmpty
	private String address;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public Long[] getIds() {
		return ids;
	}

	public void setIds(Long[] ids) {
		this.ids = ids;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

}

