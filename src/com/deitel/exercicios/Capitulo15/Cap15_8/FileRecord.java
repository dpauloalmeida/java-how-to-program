package com.deitel.exercicios.Capitulo15.Cap15_8;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileRecord {
	private Formatter output;
	
	public FileRecord() {
		openFile();
		recordFile();
		closeFile();
	}
	
	private void openFile() {
		try {
			output = new Formatter("numbers.txt");
		}
		catch(SecurityException e) {
			System.out.println("Permissão inválida, fechando...");
			System.exit(1);
		}
		catch(FileNotFoundException e) {
			System.out.println("Erro ao abrir o arquivo, fechando...");
			System.exit(1);
		}
	}
	
	private void recordFile() {
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%s%n? ", "Enter to responses:");
		
		while(input.hasNext()) {
			try {
				output.format("%d%n", input.nextInt());
			}
			catch(FormatterClosedException e) {
				System.out.println("Erro ao gravar no arquivo, fechando");
				System.exit(1);
			}
			catch(NoSuchElementException e) {
				System.out.println("Entrada Inválida, tente novamente.");
				input.nextLine();
			}
			
			System.out.print("? ");
		}
	}
	
	private void closeFile() {
		if(output != null) {
			output.close();
		}
	}
}
