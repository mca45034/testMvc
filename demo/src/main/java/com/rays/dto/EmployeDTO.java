package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "ST_EMP")
public class EmployeDTO {
	@Id
	@GeneratedValue(generator = "ncspk")
	@GenericGenerator(name = "ncspk",strategy = "native")
	@Column(name = "ID",unique = true,nullable = false)
	protected Long id=null;
	
	@Column(name = "NAME",length = 50)
	private String name;
	
	@Column(name = "DEPARTMENT",length = 50)
	private String department;
	
	@Column(name = "LOGIN",length = 50)
	private String login;
	
	@Column(name = "PASSWORD",length = 50)
	private String password ;
	
	@Column(name = "ADDRESS",length = 50)
	private String address;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
