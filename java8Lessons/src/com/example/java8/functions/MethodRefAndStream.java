package com.example.java8.functions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MethodRefAndStream {

	public static void main(String[] args) {
		List<Integer> list = List.of(1,2,4,5,8,9,12,45,67,32);
		printListTraditional(list);
		printFunctional(list);
		printEvenNos(list);
		upper();
		constructorReference();
		StreamOfPrimitie();
	}

	private static void StreamOfPrimitie() {
		//Use an array
		int [] numbers	= {1,2,3,4,5,6,7};
		//java.util.stream.IntPipeline$Head@6e8dacdf Intpiplene where the primitve type is retained
		System.out.println(Arrays.stream(numbers));
		List nos	= List.of(1,2,3,4,5,6,7);
		//java.util.stream.ReferencePipeline$Head@7a79be86 int is comverted to Integer bu boxing and ops will trigger unboxing
		System.out.println(Stream.of(nos)); 
		System.out.println("Peekkkkkkkkk");
		IntStream.range(1, 100).peek(System.out::println).sum();
		IntStream.rangeClosed(1, 100).peek(System.out::println).sum();
		System.out.println("After Peek");

		
	}

	private static void constructorReference() {
		Supplier sup	= String::new;
		System.out.println(sup.get());
	}

	private static void upper() {
		List<String> courses = List.of("Spring","SpringBoot","Hibernate","Solace","Docker","Azure");	
		System.out.println("Upper Course");
		courses.stream().map(x->x.toUpperCase()).forEach(System.out::println);
		courses.stream().map(String::toUpperCase).forEach(System.out::println);
	}

	private static void printEvenNos(List<Integer> list) {
		list.stream()
		.filter(x->x%2==0) //Lambda Expression
		.forEach(System.out::println);
		
	}

	private static void printFunctional(List<Integer> list) {
		/*
		 * Focus on what to do ?
		 */
		System.out.println("Functional***");
		list.stream().forEach(System.out::println);
		
	}

	private static void printListTraditional(List<Integer> list) {
		/*
		 * Traditional approach is to focus on HOW??
		 * How to loop numbers
		 * Traditional or Enhanced for oop ?
		 * 
		 */
		System.out.println("Traditional***");
		for (Integer number : list) {
			System.out.println(number);
		}
		
	}
}
