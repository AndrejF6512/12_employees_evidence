package com.employees.evidence.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.employees.evidence.model.Employee;
import com.employees.evidence.service.EmployeeService;

@Named
@ViewScoped
public class EmployeeCreateManageBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EmployeeService employeeService;
	
	private Employee employee;
	
	public EmployeeCreateManageBean() {
		
	}

	public Employee getEmployee() {

		return this.employee;
	}

	public void onLoad() {
		employee = new Employee();	
	}
	
	public String submit() {
		
		employeeService.addEmployee(employee);
		
		return "employee-list";
	}

}
