package com.example.java8.functions;

import java.util.List;

public class ReduceFunction {

	public static void main(String[] args) {
		addAllNumbers();
		addAllNumbersWithSum();
		addAllNumbersWithMySum();
		findLowestNumber();
		findSumOfSquares();

	}

	private static void findSumOfSquares() {
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
		Integer sumOfSquares = numbers.stream().map(n->n*n).reduce(0,Integer::sum);
		System.out.println("Sum of Squares of "+numbers+" is : "+sumOfSquares);
	}

	private static void findLowestNumber() {
		List<Integer> numbers = List.of(11,2,39,-4,0,6,700,-899,999,100);
		Integer lowest = numbers
				.stream()
				.reduce(Integer.MAX_VALUE, (x,y)-> x>y?y:x);
		System.out.println("Lowest of "+numbers+" is : "+lowest);
		
	}

	private static void addAllNumbersWithMySum() {
		Integer sum = List.of(1,2,3,4,5,6,7,8,9,10)
				.stream()
				.reduce(100, ReduceFunction::sum);
		System.out.println("sum is +"+sum);
		
	}

	private static void addAllNumbers() {
		Integer sum	=  List.of(1,2,3,4,5,6,7,8,9,10)
				.stream()
				.reduce(0, (a,b) -> a+b);//returns 55
		System.out.println("sum is +"+sum);

		sum	=  List.of(1,2,3,4,5,6,7,8,9,10)
				.stream()
				.reduce(0, (a,b) -> a);//reduces to 0
		System.out.println("sum of (a,b) -> a +"+sum);
		sum	=  List.of(1,2,3,4,5,6,7,8,9,10)
				.stream()
				.reduce(0, (a,b) -> b);//reduces to 10
		System.out.println("sum of (a,b) -> b +"+sum);

		sum	=  List.of(1,2,3,4,5,6,7,8,9,10)
				.stream()
				.reduce(0, (a,b) ->5);//reduces to 5
		System.out.println("sum of (a,b) ->5 +"+sum);

	}

	private static void addAllNumbersWithSum() {
		Integer sum = List.of(1,2,3,4,5,6,7,8,9,10)
				.stream()
				.reduce(0, Integer::sum);
		System.out.println("sum is +"+sum);

	}

	private static Integer sum(Integer a, Integer b) {
		System.out.println("a="+a + " , b="+b);
		return a+b;
	}


}
;