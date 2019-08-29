package com.ControlFlowStatements;

public class Main {

    public static void main(String[] args) {
        // SWITCH STATEMENT

        int switchValue = 6;
        // The switch statement is similar to if/else but more efficient
        //Always you need to use the case reserved word and break word after the code you want to execute
        //If you don´t put the break as the example of case 3 you join more case and all of them are executed.
        //Default case is the default behaviour in the switch statement
        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:case 4:case 5:
                System.out.println("was a 3 or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1,2,3, 4 or 5");
                break;
        }

        //Little exercise
        // Create a new switch statement using char instead of int
        // create a new char variable
        // create a switch statement testing for
        // A, B, C, D, or E
        // display a message if any of these are found and then break
        // Add a default which displays a message saying not found

        char charValue = 'G';
        switch(charValue) {
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C': case 'D' : case 'E':
                System.out.println(charValue + " was found");
                break;

            default:
                System.out.println("Could not find A, B, C, D or E");
                break;
        }

        //FOR STATEMENT

        // using the for statement, call the calculateInterest method with
        // the amount of 10000 with an interestRate of 2,3,4,5,6,7, and 8
        // and print the results to the console window.
        for(int i=2; i<9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }

        System.out.println("****************");

        // How would you modify the for loop above to do the same thing as
        // shown but to start from 8% and work back to 2%
        for(int i=8; i>=2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }

        //Little exercise with for statement
        // Create a for statement using any range of numbers
        // Determine if the number is a prime number using the isPrime method
        // if it is a prime number, print it out AND increment a count of the
        // number of prime numbers found
        // if that count is 3 exit the for loop
        // hint:  Use the break; statement to exit

        int count = 0;
        for(int i=10; i<50; i++) {
            if(isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if(count == 10) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }

        //WHILE AND DO WHILE STATEMENT

        int count2 = 6;
        while(count2 != 6) {
            System.out.println("Count value is " + count2);
            count2++;
        }

        for(int i=6; i!= 6; i++) {
            System.out.println("Count value is " + count2);
        }

        count2 = 6;
        do {
            System.out.println("Count value was " + count2);
            count2++;

            if(count2 >100) {
                break;
            }

        } while(count2 != 6);

        int number = 5;
        int finishNumber = 20;
        while(number <= finishNumber) {
            if(!isEvenNumber(number)) {
                number++;
                continue;
            }

            System.out.println("Even number " + number);
            number++;
        }

        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found

        int number2 = 5;
        int finishNumber2 = 20;
        int evenNumbersFound = 0;
        while(number2 <= finishNumber2) {
            if(!isEvenNumber(number2)) {
                number2++;
                continue;
            }

            System.out.println("Even number " + number);
            number++;

            evenNumbersFound++;
            if(evenNumbersFound >=5) {
                break;
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount *(interestRate/100));
    }

    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }
        for(int i=2; i <= n/2; i++) {
            System.out.println("Looping " +i);
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Create a method called isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is
    // an even number or not.
    // return true if an even number, otherwise return false;

    public static boolean isEvenNumber(int number) {
        if((number % 2)  == 0) {
            return true;
        } else {
            return false;
        }
    }
}
