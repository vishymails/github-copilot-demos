package org.example;

//Create a java program that extends the Thread class and prints out the numbers 1-10.
//Each number should be printed by a separate thread, and the threads should run concurrently.

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread 1: " + i);
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread 2: " + i);
            }
        });
        Thread thread3 = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread 3: " + i);
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
    }

}


//create MyThread implements Runnable interface and prints parameterized numbers

class MyThread implements Runnable{
    private int parameter;

    public MyThread(int parameter){
        this.parameter = parameter;
    }

    @Override
    public void run() {
        System.out.println(parameter);
    }
}


class ThreadDemo2 {
    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Thread thread = new Thread(new MyThread(i));
            threads.add(thread);
            thread.start();
        }
    }

}