package com.kh.hw.employee.controller;

import com.kh.hw.employee.model.vo.Employee;

public class EmployeeController {

	Employee e = new Employee();

	public void add(int empNo, String name, char gender, String phone) {
		e.setEmpNo(empNo);
		e.setName(name);
		e.setGender(gender);
		e.setPhone(phone);
	}

	public void add(int empNo, String name, char gender, String phone, String dept, int salary, double bonus) {
		e.setEmpNo(empNo);
		e.setName(name);
		e.setGender(gender);
		e.setPhone(phone);
		e.setDept(dept);
		e.setSalary(salary);
		e.setBonus(bonus);

	}

	public void modify(String phone) {

	}

	public void modify(int salary) {

	}

	public void modify(double bonus) {

	}

	public Employee remove() {
		return 0;
	}

	public String inform() {
		return "";
	}
}
