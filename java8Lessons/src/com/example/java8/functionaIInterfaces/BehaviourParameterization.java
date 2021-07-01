package com.example.java8.functionaIInterfaces;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BehaviourParameterization {

	public static void main(String[] args) {
		without();
		withParameterization();
	}

	private static void withParameterization() {
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

		List<Integer> even	= numbers
				.stream()
				.filter(x-> x%2==0)
				.collect(Collectors.toList());

		List<Integer> odd	= numbers
				.stream()
				.filter(x-> x%2!=0)
				.collect(Collectors.toList());
		System.out.println("Original : "+numbers + " Even :"+even + " Odd:"+odd);
		
	}

	private static void without() {
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

		List<Integer> even	= behaviousAsParam(numbers, x->x%2==0);
		List<Integer> odd	= behaviousAsParam(numbers, x->x%2!=0);
		System.out.println("Original : "+numbers + " Even :"+even + " Odd:"+odd);
		
	}
	
	private static List<Integer> behaviousAsParam(List<Integer> nos, Predicate<Integer> p){
		return nos.stream().filter(p).collect(Collectors.toList());
	}

}
