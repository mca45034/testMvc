package com.rays.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rays.dao.StudentDAO;
import com.rays.dto.StudentDTO;

@Service
@Transactional
public class StudentService {
	@Autowired
	public StudentDAO studentDao;
	
	@Transactional(propagation = Propagation.REQUIRED)
	public long add(StudentDTO dto) {
		long i=studentDao.add(dto);
		return i;
	}
	@Transactional(propagation = Propagation.REQUIRED)
	public void update(StudentDTO dto) {
		studentDao.update(dto);
	}
	@Transactional(propagation = Propagation.REQUIRED)
	public long save(StudentDTO dto) {
		long id=dto.getId();
		if(dto.getId() !=null && dto.getId()>0) {
			update(dto);
		}else {
			save(dto);
		}
		return id;
	}
	
	
	@Transactional(propagation = Propagation.REQUIRED)
	public StudentDTO delete(long id) {
		StudentDTO dtoDelete=studentDao.delete(id);
		return dtoDelete;
		
	}
	@Transactional(readOnly = true)
	public StudentDTO findByPk(long pk) {
		StudentDTO dto=studentDao.findByPk(pk);
		return dto;
	}
	
	@Transactional(readOnly = true)
	public List search(StudentDTO dto) {
		List list=studentDao.search(dto);
		return list;
		
	}
}
