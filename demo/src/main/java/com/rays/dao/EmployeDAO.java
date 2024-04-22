package com.rays.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rays.dto.EmployeDTO;

@Repository
public class EmployeDAO {

	@Autowired
	public SessionFactory sessionFactory;
	
	public long add(EmployeDTO dto) {
		long pk=(long) sessionFactory.getCurrentSession().save(dto);
		return pk;
				
	}
	public void update(EmployeDTO dto) {
		sessionFactory.getCurrentSession().update(dto);
	}
	
	public EmployeDTO findByPk(long pk) {
		EmployeDTO dto=null;
		dto=sessionFactory.getCurrentSession().get(EmployeDTO.class, pk);
		return dto;
	}
	public EmployeDTO delete(long id) {
		EmployeDTO dto=findByPk(id);
		sessionFactory.getCurrentSession().delete(dto);
		return dto;
	}
	public List search(EmployeDTO dto) {
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(EmployeDTO.class);
		List list=criteria.list();
		return list;
	}
	
}
