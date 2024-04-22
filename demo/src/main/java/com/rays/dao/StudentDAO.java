package com.rays.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.rays.dto.StudentDTO;

@Repository
public class StudentDAO {
	@Autowired
	public SessionFactory sessionFactory;
	
	public long add(StudentDTO dto) {
		long pk=(long) sessionFactory.getCurrentSession().save(dto);
		return pk;
	}
	public void update(StudentDTO dto) {
		sessionFactory.getCurrentSession().update(dto);
	}
	public StudentDTO findByPk (long pk) {
		StudentDTO dto=sessionFactory.getCurrentSession().get(StudentDTO.class, pk);
		return dto;
	}
	public StudentDTO delete(long id) {
		StudentDTO dto=findByPk(id);
		sessionFactory.getCurrentSession().delete(dto);
		return dto;
	}
	public List search(StudentDTO dto) {
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(StudentDTO.class);
		List list=criteria.list();
		return list;
		
	}

}
