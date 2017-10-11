package com.deitel.exercicios.Capitulo23.Cap23_16;

import java.security.SecureRandom;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RandomIntStream {

	public static void main(String[] args) {
		SecureRandom random = new SecureRandom();

		int[] values = random.ints(30_000_000, 1, 7).toArray();

		Instant start = Instant.now();

		System.out.printf("%-6s%s%n", "Face", "Frequency");
		Arrays.stream(values)
				.parallel()
				.boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.forEach((face, frequency) -> System.out.printf("%-6d%d%n", face, frequency));

		Instant finish = Instant.now();

		System.out.println(Duration.between(start, finish).toMillis());

		start = Instant.now();

		System.out.printf("%-6s%s%n", "Face", "Frequency");
		Arrays.stream(values)
				.boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.forEach((face, frequency) -> System.out.printf("%-6d%d%n", face, frequency));

		finish = Instant.now();

		System.out.println(Duration.between(start, finish).toMillis());

	}
}
