package com.example.java8.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupBy {

	public static void main(String[] args) {
		List<Course> courses = Match.courses;
		groupBy(courses);
	}

	
	private static void groupBy(List<Course> courses) {
		
		Map<String, List<Course>> categoryCourseMap = courses
		.stream()
		.collect(Collectors.groupingBy(Course::getCategory));
		
		System.out.println(categoryCourseMap);
		
		Map<String, Long> categoryCourseCountMap = courses
				.stream()
				.collect(Collectors.groupingBy(Course::getCategory,
						Collectors.counting()));
		System.out.println(categoryCourseCountMap);
		
		Map<String, Optional<Course>> categoryMaxReviewCoursetMap = courses
				.stream()
				.collect(Collectors.groupingBy(Course::getCategory,
						Collectors.maxBy(Comparator.comparing(Course::getReviewScore))));
		System.out.println(categoryMaxReviewCoursetMap);
		
		Map<String, Set<String>> categoryNameMap = courses
		.stream()
		.collect(Collectors.groupingBy(Course::getCategory,
				Collectors.mapping(Course::getName, Collectors.toSet())));
		System.out.println(categoryNameMap);
		
	}

}
