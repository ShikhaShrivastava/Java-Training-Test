package com.techment.Test2;

import java.util.Scanner;

public class TrafficLight {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the choice 1.Red 2.Green 3.Yellow");
		String colour=scan.next();
		
		switch(colour)
		{
		case "red" :
			System.out.println("Stop");
			break;
		case "green" :
			System.out.println("Go");
			break;
		case "yellow" :
			System.out.println("Ready");
			break;
		default:
			System.out.println("Follow the Traffic Rules..Be Safe!");
		}
		
	}

}
