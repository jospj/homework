package com.example.java8.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class TopMaxMinOptional {

	public static void main(String[] args) {
		List<Course> courses = Match.courses;
		topRated(courses);
	}

	private static void topRated(List<Course> courses) {
		Optional<Course> maxRatedCourse = courses
				.stream()
				.max(Comparator.comparing(Course::getReviewScore));
		System.out.println(maxRatedCourse.get());

		Optional<Course> minRatedCourse = courses
				.stream()
				.min(Comparator.comparing(Course::getReviewScore));
		System.out.println(minRatedCourse.get());

		Optional<Course> empty = courses
				.stream()
				.filter(course->course.getReviewScore()==100)
				.min(Comparator.comparing(Course::getReviewScore));
		System.out.println(empty);

		Course orElse = courses
		.stream()
		.filter(course->course.getReviewScore()==100)
		.min(Comparator.comparing(Course::getReviewScore))
		.orElse(courses.get(0));
		System.out.println(orElse);

	}

}
