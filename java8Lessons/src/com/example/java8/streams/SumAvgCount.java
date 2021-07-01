package com.example.java8.streams;

import java.util.List;

public class SumAvgCount {

	public static void main(String[] args) {
		List<Course> courses = Match.courses;
		sumOfStudents(courses);
	}

	private static void sumOfStudents(List<Course> courses) {
		int totStudents = courses
		.stream()
		//.mapToInt(x->x.getNoOfStudentsRegistered())
		.mapToInt(Course::getNoOfStudentsRegistered)
		.sum();
		System.out.println("totStudents"+totStudents);
	}
}
