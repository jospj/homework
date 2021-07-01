package com.example.java8.functionaIInterfaces;

import java.util.function.BiFunction;

public class BiFunctionalInterfaces {

	public static void main(String[] args) {
		biFunction();
	}

	private static void biFunction() {
		BiFunction<Integer, String, String> concatinate1	= (x,y)-> x + " Appending " +y;
		System.out.println(concatinate1.apply(10,"Ten"));

		BiFunction<Integer, String, String> concatinate	= new BiFunction<Integer, String, String>() {

			@Override
			public String apply(Integer t, String u) {
				return t + " Appending "+u;
			}
		};
		System.out.println(concatinate.apply(10, "Ten"));

	}

}
