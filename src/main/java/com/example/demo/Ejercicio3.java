package com.example.demo;

import java.util.List;

import com.example.demo.models.Producto;

public class Ejercicio3 {

	public static void main(String[] args) {
		List<Producto> listaProductos = List.of
				(new Producto("ropa", 15.9),
				new Producto("Pan", 1.5),
				new Producto("Queso", 3.59),
				new Producto("Coca Cola", 1.89),
				new Producto("Whiskey", 19.9));
		
		Double suma =  listaProductos
				.stream()
				.mapToDouble(s -> s.getPrecio())
				.sum();
		
		System.out.println(suma);
	}

}
