package com.example.java8.functions;

import java.util.List;

public class SimpleLamda {

	public static void main(String[] args) {
		printOdd();
		printCourses();
	}

	private static void printCourses() {
		//Print one at a time individually
		System.out.println("**Print one at a time individually >>");
		List.of("Spring","SpringBoot","Hibernate","Solace","Docker","Azure").stream().forEach(System.out::println);
		//Courses containing the work Spring
		System.out.println("**Courses containing the word Spring >> ");
		List.of("Spring","SpringBoot","Hibernate","Solace","Docker","Azure").stream().filter(s->s.contains("Spring")).forEach(System.out::println);
		System.out.println("**Length atleast 8");
		List.of("Spring","SpringBoot","Hibernate","Solace","Docker","Azure").stream().filter(s->s.length()>=8).forEach(System.out::println);
		
	}

	private static void printOdd() {
		List.of(1,2,3,4,5,6,7,8,9,0,12,13,14,15)
		.stream().filter(x->x%2==1).forEach(System.out::println);
		
	}
}
