package com.example.demo;

import java.util.List;

public class Ejercicio2 {

	public static void main(String[] args) {
		List<Integer> numeros = List.of(18, 6, 4, 15, 78,12, 9,8);
		
		Long count = numeros
				.stream()
				.filter(n -> n > 10)
				.count();
		
		
		System.out.println(count);

	}

}
