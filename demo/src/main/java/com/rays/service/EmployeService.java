package com.rays.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rays.dao.EmployeDAO;
import com.rays.dto.EmployeDTO;

@Service
@Transactional
public class EmployeService {
	
	@Autowired
	public EmployeDAO dao;
	
	@Transactional(propagation = Propagation.REQUIRED)
	public long add(EmployeDTO dto) {
		long i=dao.add(dto);
		return i;
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void update(EmployeDTO dto) {
		dao.update(dto);
	}
	@Transactional(propagation = Propagation.REQUIRED)
	public long save(EmployeDTO dto) {
		long id=dto.getId();
		if(dto.getId() !=null && dto.getId()>0) {
			update(dto);
		}else {
			save(dto);
		}
		return id;
	}
	@Transactional(propagation = Propagation.REQUIRED)
	public EmployeDTO delete(long id) {
		EmployeDTO deletedto=	dao.delete(id);
		return deletedto;
	}
	@Transactional(readOnly = true)
	public EmployeDTO findBypk(long pk) {
		EmployeDTO dto=dao.findByPk(pk);
		return dto;
	}
	public List search(EmployeDTO dto) {
		List list=dao.search(dto);
		return list;
	}

}
