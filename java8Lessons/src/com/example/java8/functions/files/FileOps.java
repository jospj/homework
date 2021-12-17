package com.example.java8.functions.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FileOps {

	public static void main(String[] args) throws IOException {
		//Print words of a file after uppercase and sorting
		Files.lines(Paths.get("src\\com\\example\\java8\\functions\\files\\file.txt"))
		.map(x->x.split(" "))
		.flatMap(Arrays::stream)
		.map(x->x.toUpperCase())
		.sorted()
		.forEach(System.out::println);
		
		Files.list(Paths.get("."))
		.filter(Files::isDirectory)
		.forEach(System.out::println);
	}
}
