package com.deitel.exercicios.Capitulo23.RelacionshipProducerAndConsumer;

public interface Buffer {
	void blockingPut(int value) throws InterruptedException;

	int blockingGet() throws  InterruptedException;
}
