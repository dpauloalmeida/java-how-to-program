package Cap17_10;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file or directory name: ");	
		Path path = Paths.get(sc.nextLine());

		System.out.println();
		
		if(Files.exists(path)) {
			System.out.printf("%s exists%n", path.getFileName());
			System.out.printf("%s a directory%n", Files.isDirectory(path) ? "Is" : "Is not");
			System.out.printf("%s an absolute path%n", path.isAbsolute() ? "Is" : "Is not");
			System.out.printf("Last modified: %s%n", Files.getLastModifiedTime(path));
			System.out.printf("Size: %s%n", Files.size(path));
			System.out.printf("Path: %s%n", path);
			System.out.printf("Absolute path: %s%n%n", path.toAbsolutePath());
			
			if(Files.isDirectory(path)) {
				
				System.out.println("Directory contents: %n");
				DirectoryStream<Path> directory = Files.newDirectoryStream(path);
				directory.forEach(System.out::println);
			}
		}
		else {
			System.out.printf("%s does not exists%n", path);
		}	
	}

}
