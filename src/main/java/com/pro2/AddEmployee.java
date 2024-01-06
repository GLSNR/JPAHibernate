package com.pro2;

import org.springframework.beans.factory.annotation.Autowired;

public class AddEmployee {
	
	@Autowired
	EmpRepository er;
	
	
	public void addEmp() throws InterruptedException
	{

		Employee s1 = new Employee(30, "Ram", "ram@gmail.com", "Dev", "Raju", "Praveen", "Saahoo", "Hyd", "Vij", "active");
		er.save(s1);
		System.out.println("User Added");
		
	}

}
