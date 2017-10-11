package com.deitel.exercicios.Capitulo23.RelacionshipProducerAndConsumer;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingBuffer implements Buffer {

	ArrayBlockingQueue<Integer> buffer;

	public BlockingBuffer() {
		buffer = new ArrayBlockingQueue<>(1);
	}

	@Override
	public void blockingPut(int value) throws InterruptedException {
		buffer.put(value);
		System.out.printf("Producer writes\t%2d  Buffer cell occupied: %d%n", value, buffer.size());
	}

	@Override
	public int blockingGet() throws InterruptedException {
		int readValue = buffer.take();

		System.out.printf("Consumer reads\t%2d  Buffer cell occupied: %d%n", readValue, buffer.size());

		return readValue;
	}
}
