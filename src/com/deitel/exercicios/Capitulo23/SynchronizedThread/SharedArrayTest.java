package com.deitel.exercicios.Capitulo23.SynchronizedThread;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SharedArrayTest {
    public static void main(String[] args) {
        SimpleArray simpleArray = new SimpleArray(6);

        ArrayWriter writer1 = new ArrayWriter(1, simpleArray);
        ArrayWriter writer2 = new ArrayWriter(11, simpleArray);

        ExecutorService service = Executors.newCachedThreadPool();

        service.execute(writer1);
        service.execute(writer2);

        service.shutdown();

        try {
            boolean tasksEnded = service.awaitTermination(1, TimeUnit.MINUTES);

            if (tasksEnded) {
                System.out.printf("%nContents SimpleArray: %n%s%n", simpleArray);
            }
            else {
                System.out.println("Timed out while waiting for tasks to finish.");
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
