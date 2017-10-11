package com.deitel.exercicios.Capitulo17.Cap17_11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) throws IllegalArgumentException{
		
		Invoice[] invoices = new Invoice[8];

		addProducts(invoices);
		
		List<Invoice> list = Arrays.asList(invoices);
		
		printHead();
		printProductsByDescription(list);
		
		printHead();
		printProductsByPrice(list);
		
		printHead();
		printProductsGroupByQuantity(list);
		
		printHead();
		printProductsGroupByTheProductPriceByQuantity(list);
	}
	
	
	public static void printHead() {
		System.out.printf("%s%n%-6s%16s%18s%10s%n%s%n", 
				"===================== Produtos =====================",
					"Número", "Descrição", "Quantidade", "Preço",
				"====================================================");
	}

	
	public static void addProducts(Invoice[] invoice) {
		try {
			invoice[0] = new Invoice(83, "Eletric Sander", 7, 57.98);
			invoice[1] = new Invoice(24, "Power Saw", 18, 99.99);
			invoice[2] = new Invoice(07, "Sledge Hammer", 11, 21.50);
			invoice[3] = new Invoice(77, "Hammer",76, 11.99);
			invoice[4] = new Invoice(39, "Lawn Mower", 3, 79.50);
			invoice[5] = new Invoice(68, "Screwdriver", 106, 6.99);
			invoice[6] = new Invoice(56, "Jig Saw", 21, 11.00);
			invoice[7] = new Invoice(03, "Wrench", 34, 7.50);
		}
		catch(IllegalArgumentException e) {
			System.err.println(e);
		}
	}
	
	
	public static void printProductsByDescription(List<Invoice> list) {
		list.stream()
			.sorted(Comparator.comparing(Invoice::getPartDescription))
			.forEach(System.out::println);		
	}
	
	
	public static void printProductsByPrice(List<Invoice> list) {
		list.stream()
			.sorted(Comparator.comparing(Invoice::getPrice))
			.forEach(System.out::println);
	}
	
	public static void printProductsGroupByQuantity(List<Invoice> list) {
		Map<Integer, List<Invoice>> groupedByQuantity = list.stream()
															.collect(Collectors.groupingBy(Invoice::getQuantity));
		
		groupedByQuantity.forEach((quantity, productInQuantity) -> {
			System.out.printf("%d: %n", quantity);
			productInQuantity.stream()
							 .sorted(Comparator.comparing(Invoice::getQuantity))
							 .forEach(product -> {
								 System.out.printf(" %s%n", product);
							 });
		});
	}
	
	public static void printProductsGroupByTheProductPriceByQuantity(List<Invoice> list) {
		Map<Double, List<Invoice>> groupByPriceByQuantity = list.stream()
																.collect(Collectors.groupingBy(valueTotal ->
																		valueTotal.getPrice() * valueTotal.getQuantity()));
		
		groupByPriceByQuantity.forEach((valueTotal, productInValueTotal) -> {
			productInValueTotal.stream()
							   .filter(p -> p.getQuantity() * p.getPrice() > 200 && p.getQuantity() * p.getPrice() > 500)
							   .forEach(product -> {
								   System.out.printf("%-15s%12.2f%n", product.getPartDescription(), valueTotal);
							   });
		});
	}
}
