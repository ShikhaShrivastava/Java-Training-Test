package com.techment.Test1;

import java.util.Scanner;

public class ArrayQuestion1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter no. of age to be entered :");
		int age = scan.nextInt();
		int noOfChild = 0, noOfadult =0, noOfsenior = 0 ;
		int person[] = new int[age];
		
		for(int i=0; i<age; i++) {
			person[i] = scan.nextInt();
			if(person[i] < 18)
				noOfChild++;
			else if(person[i]>=18 && person[i]<=55) {
				noOfadult++;
			}
			else
				noOfsenior++;
		}
		System.out.println("Children " + noOfChild);
		System.out.println("Adult " + noOfadult);
		System.out.println("Senior " + noOfsenior);	
		
	}

}
