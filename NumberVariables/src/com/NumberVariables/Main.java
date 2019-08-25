package com.NumberVariables;

public class Main {

    public static void main(String[] args) {
	    //You can use underscore for easy reading in literal numbers
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;

        int myTotal = (myMinValue/2);
        System.out.println("myTotal: "+ myTotal);

        byte myMinByteValue = -128;
        byte myMaxByteValue = 127;
        //IMPORTANT java does automatically the conversion of expressions to int, for these reason we need to use a cast
        byte MyByteTotal = (byte)(myMinByteValue/2);
        System.out.println("MyByteTotal: "+ MyByteTotal);

        short myMinShortValue = -32767;
        short myMaxShortValue = 32767;

        //using capital L for difference
        long myMinLongValue = -9_223_372_036_854_775_808L;
        long myMaxLongValue = 9_223_372_036_854_775_807L;

        //Little exercise for playing with the number variables
        // 1. Create a byte variable and set it to any valid byte number.
        // 2. Create a short variable and set it to any valid short number.
        // 3. Create a int variable and set it to any valid in number.
        // 4. Create a variable of type long, and make it equal to
        //    50000 + 10 times the sum of the byte, plus the short plus the int

        byte exerciseByteNumber = 10;
        short exerciseShortNumber = 100;
        int exerciseIntNumber = 1000;
        long exerciseLongTotalNumber = 50000L + (10L * (exerciseByteNumber+exerciseShortNumber+exerciseIntNumber));
        System.out.println("Result of exercise: " + exerciseLongTotalNumber);

        //As before Double is the default type for Java and it´s not needed put the d or D
        //By convention the D it´s not put in Double numbers
        double myDoubleNumber = 10d;
        double myDouble2Number = 10.25;

        //For say to Java this is a float you need to put the F or f
        //By convention is better to put the F and not use the cast
        float myFloatNumber = 10F;
        float myFloat2Number = 10.09F;
        float myFloat3Number = (float)10.25;

        System.out.println("MyFloatNumber: " + myFloatNumber);
        System.out.println("MyFloat2Number: " + myFloat2Number);

        //Difference between int, double and float in divisions

        System.out.println("int division " + (5/3));
        System.out.println("double division " + (5d/3d));
        System.out.println("float division " + (5f/3f));

        // Little exercise with double and float
        // Convert a given number of pounds to kilograms
        // 1. Create a variable to store the number of pounds
        // 2. Calculate the number of Kilograms for the number above and store in a variable.
        // 3. Print out the result.
        //
        // NOTES: 1 pound is equal to 0.45359237 kilograms.

        double numPounds = 200d;
        double convertedKilograms = numPounds * 0.45359237d;
        System.out.println("Kilograms = " + convertedKilograms);
        // 90.7185
        double pi = 3_000_000.1415927d;
    }
}
