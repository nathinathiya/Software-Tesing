package org.emp;
//different datatype in arguments
public class Employee {
	public void empId(int age) {
		System.out.println("Employee age: "+age);

		
		System.out.println("Updated by nithu branch");
// lines from Nithu branch
		System.out.println("Emp id is displayed");
		System.out.println("new line updated");


	}
	public void empId(String name) {
		System.out.println("Employee Name: "+name);

	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.empId(50);
		e.empId("Nitthura");
	}

}
