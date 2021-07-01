package com.example.java8.functions;

import java.util.List;

public class MapFunction {

	public static void main(String[] args) {
		squareOfEvenNos();
		noOfCharctersInCourse();

	}

	private static void noOfCharctersInCourse() {
		List.of("Spring","SpringBoot","Hibernate","Solace","Docker","Azure")
		.stream()
		.map(course->course.length())
		.forEach(System.out::println);

	}

	private static void squareOfEvenNos() {
		List.of(1,2,3,4,5,6,7,8,9,10)
		.stream()
		.filter(n->n%2==1)
		.map(number -> number*number)
		.forEach(System.out::println);
	}

}
