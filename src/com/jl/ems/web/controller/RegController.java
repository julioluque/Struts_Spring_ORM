package com.jl.ems.web.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.context.ConfigurableApplicationContext;

import com.jl.ems.dao.EmployeeDao;
import com.jl.ems.model.Employee;
import com.jl.ems.web.beans.RegForm;

public class RegController extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("Struts controller..........");
		
		RegForm rf = (RegForm) form;
		
		Employee emp = new Employee();
		emp.setName(rf.getName());
		emp.setEmail(rf.getEmail());
		emp.setAddress(rf.getAddress());
		
		ServletContext scxt = request.getSession().getServletContext();
		ConfigurableApplicationContext cap = (ConfigurableApplicationContext) emp;
		EmployeeDao edao = (EmployeeDao)cap.getBean("dao");
		int pk = edao.save(emp);
		request.setAttribute("pk", pk);
		
		return mapping.findForward("success");
	}
	
}
