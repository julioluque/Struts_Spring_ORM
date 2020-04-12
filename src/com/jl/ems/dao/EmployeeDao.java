package com.jl.ems.dao;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.jl.ems.model.Employee;

public class EmployeeDao {

	private HibernateTemplate ht;
	
	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}
	
	public int save(Employee emp) {
		int pk = (Integer) ht.save(emp);
		
		System.out.println("DAO SAVE METHOD EXCECUTING...");
		
		return pk;
		
	}
}
