package com.employees.evidence.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.employees.evidence.model.Employee;
import com.employees.evidence.service.EmployeeService;

@Named 
@RequestScoped
public class EmployeeDetailsManageBean {

	@Inject
	private EmployeeService employeeService;

	private int id;

	private Employee employee;


	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public Employee getEmployee() {
		return this.employee;
	}
	
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public void onLoad()
	{
		this.employee = employeeService.getEmployee(id);
	}
}
