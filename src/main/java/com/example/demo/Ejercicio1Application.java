package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejercicio1Application {

	public static void main(String[] args) {
		List<String> lenguajes = Arrays.asList("Java", "C", "C++", "JavaScript", "Python");

		List<String> stream = lenguajes
				.stream()
				.filter(l -> l.startsWith("J"))
				.map(l -> l.toUpperCase())
				.collect(Collectors.toList());

		System.out.println(stream);
		
		Stream<String> personas = Stream.of("Fran", "Pepe", "Rocio");
		personas
		.forEach(e -> System.out.println(e));

	}

}
