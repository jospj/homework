package com.example.java8.streams;

import java.util.List;
import java.util.function.Predicate;

public class Match {
	
	static List<Course> courses = List.of(
			new Course("Spring", "Framework",98,1000),
			new Course("Spring Boot", "Framework",90,100),
			new Course("Microservices", "Framework",98,1000),
			new Course("Restful", "Framework",98,1000),
			new Course("Struts", "Framework",40,50),
			new Course("Azure", "Cloud",75,7000),
			new Course("AWS", "Cloud",80, 8000),
			new Course("Docker", "Java",98,5000),
			new Course("K8s", "Cloud",92,4000),
			new Course("React", "UI",77,2000)
			);
	public static void main(String[] args) {

		
		matchCourse(courses);

	}


	private static void matchCourse(List<Course> courses) {
		Predicate<Course> reviewScore80	= x->x.getReviewScore()>80;
		System.out.println("AllMatch ReviewScore > 80 - "+ courses.stream().allMatch(reviewScore80));
		System.out.println("noneMatch ReviewScore > 80 - "+ courses.stream().noneMatch(reviewScore80));
		System.out.println("noneMatch ReviewScore > 80 - "+ courses.stream().anyMatch(reviewScore80));

	}
}


class Course{
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudentsRegistered;

	public Course(String name, String category, int reviewScore, int noOfStudentsRegistered) {
		super();
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfStudentsRegistered = noOfStudentsRegistered;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", category=" + category + ", reviewScore=" + reviewScore
				+ ", noOfStudentsRegistered=" + noOfStudentsRegistered + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}

	public int getNoOfStudentsRegistered() {
		return noOfStudentsRegistered;
	}

	public void setNoOfStudentsRegistered(int noOfStudentsRegistered) {
		this.noOfStudentsRegistered = noOfStudentsRegistered;
	}



}