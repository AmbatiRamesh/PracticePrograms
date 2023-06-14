package com.bridgelabz;

public class Static {
    static int staticVariable = 10;
    static {
        staticVariable = 20;
    }
    static void staticMethod() {
        System.out.println("Value of staticVariable: " + staticVariable);
    }
    public static void main(String[] args) {
        System.out.println("Value of staticVariable: " + staticVariable);
        staticMethod();
    }
}
