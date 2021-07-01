package com.example.java8.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {

	public static void main(String[] args) {
		List<Course> courses = Match.courses;
		sortCourses(courses);
	}
    @SuppressWarnings(value = "unused")
	private static void sortCourses(List<Course> courses) {
		//Comparator<Course, Course, Integer>  nameSorter = (x,y)->x.getName().compareTo(y.getName());
		Comparator<Course> nameComparator = (x,y)-> x.getName().compareTo(y.getName());
		Comparator<Course> nameComparator2  = Comparator.comparing(Course::getName);
		
		Comparator<Course> noOfStdntsComparator  	= Comparator.comparing(Course::getNoOfStudentsRegistered);
		Comparator<Course> noOfStdntsComparatorRev  = Comparator.comparing(Course::getNoOfStudentsRegistered).reversed();
		Comparator<Course> noOfStdntsComparatorRev2  = Comparator.comparingInt(Course::getNoOfStudentsRegistered).reversed();
		
		List<Course> sortedByName = courses.stream().sorted(nameComparator).collect(Collectors.toList());
		
		System.out.println("OriginalList"+courses + " vs Sorted List"+sortedByName);
		
		List<Course> sortedByStudents = courses.stream().sorted(noOfStdntsComparator).collect(Collectors.toList());
		System.out.println("OriginalList"+courses + " vs Sorted List"+sortedByStudents);
		
		List<Course> sortedByStudentsRev = courses.stream().sorted(noOfStdntsComparatorRev).collect(Collectors.toList());
		System.out.println("OriginalList"+courses + " vs Sorted List"+sortedByStudentsRev);
		

	}
}