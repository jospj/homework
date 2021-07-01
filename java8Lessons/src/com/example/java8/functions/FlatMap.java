package com.example.java8.functions;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {


	public static void main(String[] args) {
		List<String> courses = List.of("Spring","SpringBoot","Hibernate","Solace","Docker","Azure","AWS","API");
		List<String> courses2 = List.of("Spring","SpringBoot","Hibernate","Solace","Docker","Azure","AWS","API");
		
		concatinateStrings(courses);
		flatenArray(courses);
		makeTuples(courses, courses2);
		
		
	}

	private static void makeTuples(List<String> courses, List<String> courses2) {
		List<List<String>> tuples = courses
		.stream()
		.flatMap(course-> courses2.stream()
				.filter(course2->!course2.equals(course))
				.filter(course2->course2.length()==course.length())
				.map(course2->List.of(course,course2)))
		.collect(Collectors.toList());
		System.out.println("tuples"+tuples);
	}

	private static void flatenArray(List<String> courses) {
		List<String[]> collect = courses
		.stream()
		.map(str->str.split(""))
		.collect(Collectors.toList());
		System.out.println("before flatmap "+collect);
		
		List<String> flattened = courses
		.stream()
		.map(str->str.split(""))
		.flatMap(Arrays::stream)
		.collect(Collectors.toList());
		System.out.println("After flatmap "+flattened);
		
	}

	private static void concatinateStrings(List<String> courses) {
		String concatinated = courses
				.stream()
				.collect(Collectors.joining(","));
				System.out.println(concatinated);
		
	}
}
