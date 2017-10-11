package com.deitel.exercicios.Capitulo23.FramewordExecutorThread;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class TaskExecutor {
    public static void main(String[] args) {
        PrintTask task1 = new PrintTask("Task1");
        PrintTask task2 = new PrintTask("Task2");
        PrintTask task3 = new PrintTask("Task3");

        ExecutorService service = Executors.newCachedThreadPool();

        service.execute(task1);
        service.execute(task2);
        service.execute(task3);

        service.shutdown();

        System.out.printf("Tasks started, main ends.%n%n");
    }
}
