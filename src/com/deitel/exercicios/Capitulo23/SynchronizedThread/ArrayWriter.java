package com.deitel.exercicios.Capitulo23.SynchronizedThread;

public class ArrayWriter implements Runnable {
    private final SimpleArray sharedSimpleArray;
    private final int startValue;

    public ArrayWriter(int startValue, SimpleArray sharedSimpleArray) {
        this.startValue = startValue;
        this.sharedSimpleArray = sharedSimpleArray;
    }

    @Override
    public void run() {
        for (int i = startValue; i < startValue + 3; i++) {
            sharedSimpleArray.add(i);
        }
    }
}
