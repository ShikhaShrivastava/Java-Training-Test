package com.techment.Test2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WWEWrestlerImplementation {

	public static void main(String[] args) {
		ArrayList<WWE> wwe = new ArrayList<WWE>();
		wwe.add(new WWE("Adam","Cole",289));
		wwe.add(new WWE("Bill","Goldberg",192));
		wwe.add(new WWE("Bret","Hart",205));

		Long WrestlerCount=wwe.stream().count();
		System.out.println("a) Number of Wrestlers : "+ WrestlerCount );
		
		Long sumWrestler= wwe.stream().filter(e->e.getWeight()>200).collect(Collectors.summarizingInt(WWE::getWeight)).getSum();
		System.out.println("b) sum of all weight of all wrestlers whose weight is above 200 : "+sumWrestler);
		
		System.out.println("c) First name is: ");
		List<String> first_name = wwe.stream().map(e->e.getFirstName()).collect(Collectors.toList());
        first_name.stream().forEach(System.out::println);

		
		int minWeight = wwe.stream().collect(Collectors.summarizingInt(WWE::getWeight)).getMin();
		System.out.println("d) Minimum weight of Wrestler : "+minWeight);

		
	}
	void printFirstName(List <WWE> list)
	{
		List<String> first_name = list.stream().map(e->e.getFirstName()).collect(Collectors.toList());
        first_name.stream().forEach(System.out::println);

	}

}
