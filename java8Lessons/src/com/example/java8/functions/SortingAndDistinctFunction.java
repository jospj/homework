package com.example.java8.functions;

import java.util.Comparator;
import java.util.List;

public class SortingAndDistinctFunction {

	public static void main(String[] args) {
		sortNumbers();
		distinctNumbers();
	}

	private static void distinctNumbers() {
		List<Integer> numbers	= List.of(1,2,3,3,5,2,4,66,11,33,99,1,0);
		System.out.print("Distinct Of "+numbers + " :");
		numbers.stream().distinct().forEach(System.out::println);
		
		
	}

	private static void sortNumbers() {
		
		List<Integer> numbers	= List.of(1,2,3,3,5,2,4,66,11,33,99,1,0);
		System.out.println("Sorting "+numbers);
		numbers.stream().sorted().forEach(System.out::println);
		System.out.println("Sorting using compare "+numbers);
		numbers.stream().sorted(Integer::compare).forEach(System.out::println);
		System.out.println("Sorting in naturalOrder"+numbers);
		numbers.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
		System.out.println("Sorting reverse"+numbers);
		numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println("Sorting reverse with compareTo"+numbers);
		numbers.stream().sorted((x,y)->y.compareTo(x)).forEach(System.out::println);
		numbers.stream().sorted(Comparator.comparing((x)->10-x)).forEach(System.out::println);
		
		
		List<String> courses = List.of("Spring","SpringBoot","Hibernate","Solace","Docker","Azure");
		courses.stream().sorted().forEach(System.out::println);
		
		
	}
}
