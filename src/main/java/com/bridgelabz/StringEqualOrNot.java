package com.bridgelabz;

public class StringEqualOrNot {
    public static void main(String[] args) {
        String string1 = "Ramesh";
        String string2 = "Ramesh";
        System.out.println(string1.equals(string2));
        if(string1.equals(string2))
            System.out.println("Strings are equal");
        else
            System.out.println("Strings are not equal");

    }
}
