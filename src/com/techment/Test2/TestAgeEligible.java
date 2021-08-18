package com.techment.Test2;

import java.util.Scanner;
class InvalidAgeException extends Exception
{
	public String getMessage()
	{
		return "Your Age is Less than 15";
	}
}
class Person
{
	int id;
	String name;
	int age;
	void input()
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the name:");
		name=scan.next();
		System.out.println("Enter the Age:");
		age=scan.nextInt();
	}
	void compare() throws InvalidAgeException
	{
		int len=name.length();
		if(age>15 && len>3)
		{
			System.out.println("You are Eligible");
		}
		else if(age<=15 && len<3)
		{
			InvalidAgeException iae= new InvalidAgeException();
			System.out.println(iae.getMessage());
		}
	}

}
class Eligible
{
	void process()
	{
		Person person =new Person();
		person.input();
		try {
			person.compare();
		} 
		catch (InvalidAgeException iae) {
			System.out.println(iae.getMessage());
		}
	}
}
public class TestAgeEligible {

	public static void main(String[] args) throws InvalidAgeException{
		
		Eligible eg= new Eligible();
		eg.process();	 

	}

}
