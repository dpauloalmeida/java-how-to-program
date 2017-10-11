package com.deitel.exercicios.Capitulo16.Cap16_21;

import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		Queue<Double> queue = new PriorityQueue<>(new Descending());
		
		queue.offer(3.2);
		queue.offer(9.8);
		queue.offer(5.4);
		
		System.out.print("Polling from queue: ");
		
		while(queue.size() > 0) {
			System.out.printf("%.1f  ", queue.poll());
		}
	}

}
