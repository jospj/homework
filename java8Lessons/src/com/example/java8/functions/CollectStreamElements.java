package com.example.java8.functions;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectStreamElements {

	public static void main(String[] args) {
	collect();

	}

	private static void collect() {
		List<String> courses = List.of("Spring","SpringBoot","Hibernate","Solace","Docker","Azure");
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
		List<Integer> doubledList = numbers.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println("Original "+numbers + " Doubled "+doubledList);
		
	}

}
