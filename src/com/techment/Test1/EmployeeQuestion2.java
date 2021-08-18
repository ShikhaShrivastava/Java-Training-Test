package com.techment.Test1;

class Employee{
	private String firstName;
	private String lastName;
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
		
		@Override
		public String toString() 
		{
			return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
		}
	}
public class EmployeeQuestion2 {
	public static void main(String[] args) {
		Employee emp = new Employee("Shikha", "Shrivastava");
		Employee emp1 = new Employee("Raina", "Verma");
		Employee emp2 = new Employee("Anup", "Dutta");
		System.out.println(emp.toString());
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
	}

}
