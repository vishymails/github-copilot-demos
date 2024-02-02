package org.example;

public class VariableExample {

    static int staticVariable = 10;

    int instanceVariable = 20;

    public static void main(String[] args) {
        int localVariable = 30;
        System.out.println("localVariable = " + localVariable);
        System.out.println("staticVariable = " + staticVariable);
        VariableExample variableExample = new VariableExample();
        System.out.println("instanceVariable = " + variableExample.instanceVariable);
    }

    public void printVariables() {
        int localVariable = 30;
        System.out.println("localVariable = " + localVariable);
        System.out.println("staticVariable = " + staticVariable);
        System.out.println("instanceVariable = " + instanceVariable);
    }

    // write a method to sum two numbers and return the result
    public int sum(int a, int b) {
        return a + b;
    }

    // write a method to sub two numbers and print the result
    public void sub(int a, int b) {
        System.out.println(a - b);
    }

    // write a method to multiply two numbers and return the result
    public int multiply(int a, int b) {
        return a * b;
    }

    // write a method to divide two numbers and print the result
    public void divide(int a, int b) {
        System.out.println(a / b);
    }

    // write a method to find the remainder of two numbers and return the result
    public int remainder(int a, int b) {
        return a % b;
    }
}
