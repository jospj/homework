package com.example.java8.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LimitSkip {
	public static void main(String[] args) {
		List<Course> courses = Match.courses;
		limitResult(courses);
	}

	private static void limitResult(List<Course> courses) {
		List<Course> top5Rated = courses
				.stream()
				.sorted(Comparator.comparing(Course::getReviewScore).reversed())
				.limit(5)
				.collect(Collectors.toList());
		System.out.println("Original : "+courses);
		System.out.println("Top5 by ratings"+top5Rated);
		
		List<Course> skipTopmostAndRest5 = courses
				.stream()
				.sorted(Comparator.comparing(Course::getReviewScore).reversed())
				.skip(1)
				.limit(5)
				//.takeWhile(null)
				//.dropWhile(null)
				.collect(Collectors.toList());
		System.out.println("Top5 by ratings excluding the toprated"+skipTopmostAndRest5);
		
		
		
	}

}
