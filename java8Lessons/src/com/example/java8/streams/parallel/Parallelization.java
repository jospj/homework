package com.example.java8.streams.parallel;

import java.util.stream.LongStream;

public class Parallelization {

	public static void main(String[] args) {

		long time	= System.currentTimeMillis();

		LongStream.range(0, 100000000).sum();
		System.out.println("Time : "+(System.currentTimeMillis()-time));

		time	= System.currentTimeMillis();
		LongStream.range(0, 100000000).parallel().sum();
		System.out.println("Time : "+(System.currentTimeMillis()-time));

	}

}
