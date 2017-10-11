package Cap17_9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) throws IOException {
		Pattern pattern = Pattern.compile("");
		
		Map<String, Long> wordCounts = Files.lines(Paths.get("Teste.txt"))
											.map(line -> line.replaceAll(" ", ""))
											.flatMap(line -> pattern.splitAsStream(line))
											.collect(Collectors.groupingBy(String::toLowerCase,
													TreeMap::new, Collectors.counting()));
		
		System.out.println("List to characters frequency:");
		wordCounts.entrySet()
				  .stream()
				  .collect(Collectors.groupingBy(entry -> entry.getKey(),
						  TreeMap::new, Collectors.toList()))
				  .forEach((letter, charList) -> {
					  charList.stream()
					  		  .forEach(chars -> System.out.printf("%s: %d%n",
					  				  chars.getKey(), chars.getValue()));
				  });
				  

	}

}
