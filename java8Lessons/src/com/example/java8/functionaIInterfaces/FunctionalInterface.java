package com.example.java8.functionaIInterfaces;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FunctionalInterface {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
		
		
		Predicate<Integer> evenPredicate 		= x->x%2==0;
		Function<Integer, Integer> squareMapper = x-> x*x;
		Consumer<Integer> print 				= x->System.out.println(x);
		Supplier<Integer> randonNoSupplier		= ()-> new Double(Math.random()).intValue();
		BinaryOperator<Integer> sum				= (x,y) -> x+y;
		UnaryOperator<Integer>  add10			= x->x+10;
		
		evenPredicate.test(10);
		squareMapper.apply(10);
		print.accept(10);
		randonNoSupplier.get();
		sum.apply(10, 10);
		add10.apply(10);

		
		Collector<Integer, ?, List<Integer>> list = Collectors.toList();
		List<Integer> squares = numbers.stream().filter(evenPredicate).map(squareMapper).collect(list);
		System.out.println("Original "+numbers + " Squared "+squares);
		
		numbers.stream().filter(evenPredicate).map(squareMapper).forEach(print);
		
		
		Predicate<Integer> evenPredicateC= new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return t%2==0;
			}
			
		}; 
		
		Function<Integer, Double> squareMapperC = new Function<Integer, Double>() {
			
			@Override
			public Double apply(Integer t) {
				return new Double(t*t);
			}
		};
		
		Consumer<Number> printC = new Consumer<Number>() {
			
			@Override
			public void accept(Number t) {
				System.out.println(t);
			}
		};
		
		numbers.stream().filter(evenPredicateC).map(squareMapperC).forEach(printC);
		
		BinaryOperator<Integer> fn	= new BinaryOperator<Integer>() {
			
			@Override
			public Integer apply(Integer t, Integer u) {
				return t+u;
			}
		};
		System.out.println(numbers.stream().filter(evenPredicateC).reduce(0,fn));

	}
	
	

}
