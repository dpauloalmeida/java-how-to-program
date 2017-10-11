package com.deitel.exercicios.Capitulo15.Cap15_8;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileRead {
	private Scanner input;
	private int[] frequency = new int[6]; // array de contadores
	
	public FileRead() {
		openFile();
		distributeFrequencyInArray();
		closeFile();
	}

	public int[] getFrequency() {
		return frequency;
	}

	public void setFrequency(int[] frequency) {
		this.frequency = frequency;
	}

	private void openFile() {
		try {
			input = new Scanner(Paths.get("numbers.txt"));
		}
		catch(IOException e) {
			System.err.println("Erro ao abrir o arquivo, fechando...");
			System.exit(1);
		}
	}
	
	private void distributeFrequencyInArray() {
		try {
			while(input.hasNext()) {
				try {
					++frequency[input.nextInt()];
				}
				catch(ArrayIndexOutOfBoundsException e) {
					System.out.println(e);
				}
			}
		}
		catch(NoSuchElementException e) {
			System.err.println("Arquivo em formato diferente, fechando...");
			System.exit(1);
		}
		catch(IllegalStateException e) {
			System.err.println("Erro ao ler o arquivo, fechando...");
			System.exit(1);
		}
	}
	
	private void closeFile() {
		if(input != null) {
			input.close();
		}
	}

}
