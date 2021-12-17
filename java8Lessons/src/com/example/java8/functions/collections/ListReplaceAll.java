package com.example.java8.functions.collections;

import java.util.ArrayList;
import java.util.List;

public class ListReplaceAll {

	public static void main(String[] args) {
		List<String> courses = List.of("Spring","SpringBoot","Hibernate","Solace","Docker","Azure","AWS","API");
		//courses.replaceAll(String::toUpperCase);//java.lang.UnsupportedOperationException as List.of returns Unmodifyable list
		List<String> modCourses	= new ArrayList<>(courses);
		modCourses.replaceAll(String::toUpperCase);
		System.out.println(modCourses);
		
		modCourses.removeIf(x->x.startsWith("SPRING"));
		System.out.println(modCourses);
	}
}
