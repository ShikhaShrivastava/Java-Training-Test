package com.techment.Test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListDivision {

	public static void main(String[] args) {
		System.out.println("Enter the size of ArrayList:");
		Scanner scan= new Scanner(System.in);
		int size= scan.nextInt();
		List<Integer>list= new ArrayList<>(size);
		for(int i=1; i<=size; i++)
		{
			list.add(i);
		}
		List<Integer>firstlist=list.subList(0, size/2);
		List<Integer>secondlist=list.subList(size/2, size);
		
		System.out.println(list);
		System.out.println(firstlist);
		System.out.println(secondlist);
		int maxfirst= Collections.max(firstlist);
		int maxsecond= Collections.max(secondlist);
		System.out.println(maxfirst);
		System.out.println(maxsecond);

	}

}
