package com.deitel.exercicios.Capitulo23.RelacionshipProducerAndConsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SharedBufferTest {
	public static void main(String[] args) throws InterruptedException {
		ExecutorService service = Executors.newCachedThreadPool();

		Buffer sharedLocation = new BlockingBuffer();

		service.execute(new Producer(sharedLocation));
		service.execute(new Consumer(sharedLocation));

		service.shutdown();
		service.awaitTermination(1, TimeUnit.MINUTES);
	}
}
