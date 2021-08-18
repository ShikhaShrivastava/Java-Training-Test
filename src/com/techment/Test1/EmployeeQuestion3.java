package com.techment.Test1;

class WeekLengthException extends Exception{
	public WeekLengthException(String msg) {
		super(msg);
	}
}
class Employee1{
	private String firstName;
	private String lastName;
	public Employee1(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void validation() throws WeekLengthException {
		if(firstName != null && lastName != null) {
			if(firstName.length() <3 && lastName.length() < 3) {
				throw new WeekLengthException("please enter valid name");
			}
			else			
			System.out.println("Employee firstName=" + firstName + ", lastName=" + lastName);
		}
		
		else
			throw new NullPointerException("Invalid entry");
	}
	
}

public class EmployeeQuestion3 {

	public static void main(String[] args) {
		Employee1 emp1 = new Employee1("shikha", "shrivastava");
		Employee1 emp3 = new Employee1("sh", "sh");
		Employee1 emp2 = new Employee1(null, null);
		try {
			emp1.validation();
			emp2.validation();
			emp3.validation();
		} 
		catch(NullPointerException e) {
			System.out.println("invalid entry");
		}
		catch (WeekLengthException e) {
			// TODO Auto-generated catch block
		System.out.println("small name");
		}
	}

}
