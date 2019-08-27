package com.CharBooleanStringVariables;

public class Main {

    public static void main(String[] args) {
        //Important use single quote for char variables
        char myChar = 'A';
        //Char variable can contain unicode variable
        char myUnicodeChar = '\u00A9';
        System.out.println("unicode value" + myUnicodeChar);

        boolean myTrueBoolean = true;
        boolean mYFalseBoolean = false;

        //Little exercise with char variables
        // 1. Find the code for the registered symbol on the same line as the copyright symbol.
        // 2. Create a variable of type char and assign it the unicode value for that symbol.
        // 3. Display in on screen.

        char registeredSymbol = '\u00AE';
        System.out.println("Registered symbol = " + registeredSymbol);

        //Important use double quote for string variable
        String myString = "This is my string";
        myString = myString + " and more and more";
        System.out.println(myString);

        String myNumberString = "25.85";
        myNumberString = myNumberString + "55.80";
        //even when the string has a number inside is only printing it and not doing calculations
        System.out.println(myNumberString);

        String numberString = "10";
        int myInt = 50;
        numberString = numberString + myInt;
        //If you use the string variable in the left part java convert and add to the end of the string the value
        System.out.println(numberString);


    }
}
