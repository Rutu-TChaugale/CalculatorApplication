package com.rutu.controller;

public class CalculatorApplication {

    public static double addition(int a, int b) {
        return a + b;
    }

    public static double subtraction(int a, int b) {
        return a - b;
    }

    public static double multiplication(int a, int b) {
        return a * b;
    }

    public static double division(int a, int b) {
        return (double) a / b;
    }

    public static int modulus(int a, int b) {
        return a % b;
    }

    public static double power(double a, double b) {
        return Math.pow(a, b);
    }

    public static double squareRoot(double a) {
        return Math.sqrt(a);
    }
    
    public static long factorial(int a) {
        long fact = 1;
        for (int i = 1; i <= a; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int square(int a) {
        return a * a;
    }

    public static int cube(int a) {
        return a * a * a;
    }
    
    public static double percentage(int total, int part) {
        return ( (double) total/part ) * 100;
    }
}
