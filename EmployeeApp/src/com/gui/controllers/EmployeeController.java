/**
 *
 */
package com.gui.controllers;

/**
 * @author lisbethb
 *
 */
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import com.ejb.services.EmployeeService;
import com.jpa.entities.Employee;

@ManagedBean(name = "employeecontroller")
@SessionScoped
public class EmployeeController {

	@ManagedProperty(value="#{employee}") private Employee employee = new Employee();

	@EJB
	private EmployeeService service;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public void saveEmployee(Employee emp) {
		service.addEmployee(emp);
	}

}
