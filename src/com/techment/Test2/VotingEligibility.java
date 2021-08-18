package com.techment.Test2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class VotingEligibility {

	public static void main(String[] args) {
		
		Map<Integer,Integer> addVoter =new HashMap();
		addVoter.put(1, 25);
		addVoter.put(2, 55);
		addVoter.put(3, 40);
		addVoter.put(4, 13);
		addVoter.put(5, 6);
		addVoter.put(6, 54);
		addVoter.put(7, 96);
		addVoter.put(8, 11);
		addVoter.put(9, 39);
		addVoter.put(10, 2);
		
		List<Integer> listOfVoters = voterList(addVoter);
		
	  System.out.println("Valid Voters Id are : ");
		for(Integer voterId : listOfVoters)
		{
			System.out.println(voterId);
		}
		
	}

	private static List<Integer> voterList(Map<Integer, Integer> addVoter) {
		List<Integer> validVoter = new ArrayList<Integer>();
		for(Entry<Integer, Integer> entry : addVoter.entrySet()) {
			if(entry.getValue() > 18) 	
			   validVoter.add(entry.getKey());
			}

		return validVoter;
	}

}
