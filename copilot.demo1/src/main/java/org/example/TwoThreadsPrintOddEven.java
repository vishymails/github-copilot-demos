package org.example;

//Implement a program that demonstrates unter-thread communication using wait() and notify() methods.
//create two threads, one that prints even numbers, and the other that prints odd numbers.
// coordinate their execution using wait() and notify() methods to ensure that they print the numbers alternatively

public class TwoThreadsPrintOddEven {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Thread thread1 = new Thread(() -> {
            try {
                printer.printEven();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread thread2 = new Thread(() -> {
            try {
                printer.printOdd();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread1.start();
        thread2.start();
    }
}

class Printer{
    private int number = 1;
    private final int MAX = 10;

    public synchronized void printEven() throws InterruptedException {
        while(number < MAX){
            if(number % 2 == 0){
                System.out.println("Thread 1: " + number);
                number++;
                notify();
            }else{
                wait();
            }
        }
    }

    public synchronized void printOdd() throws InterruptedException {
        while(number < MAX){
            if(number % 2 != 0){
                System.out.println("Thread 2: " + number);
                number++;
                notify();
            }else{
                wait();
            }
        }
    }
}
