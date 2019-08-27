package com.Operators;

public class Main {

    public static void main(String[] args) {
        //First operator is "=" and is used for assign values to variables
        //Second one is "+" used for doing arithmetical operations
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        //More operators for doing arithmetical operations
        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now: " + result);
        //The operator "++ and --" is for increment or decrement the value in 1
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);
        //The operator "+=" is used for abbreviate the sentence result = result + 2
        //The same for the other ones with the arithmetical operators
        result += 2;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result -= 10;
        System.out.println("Result is now " + result);
        result /= 10;
        System.out.println("Result is now " + result);


        boolean isAlien = false;
        //The operator "==" validate if the operation is correct
        //In this case is not correct and the print is not executed
        if (isAlien == true)
            System.out.println("It is not an alien!");
        //The operator "<" validate if the operation is correct
        //In this case if topScore is less than 100
        int topScore = 80;
        if (topScore < 100)
            System.out.println("You got the high score!");
        //The operator "&&" is used test two conditions inside on if conditional
        //If both of conditions are not true the message is not displayed
        //Java validate the first condition and if this fails the second one is not validate
        //This can help for improve the performance
        int secondTopScore = 81;
        if (topScore > secondTopScore && topScore < 100)
            System.out.println("Greater than second top score and less then 100");
        //The operator "||" is used test two conditions inside on if conditional
        //If one of conditions are true the message is displayed
        if((topScore >90) || (secondTopScore <=90))
            System.out.println("One of these tests is true");

        int newValue = 50;
        if(newValue == 50)
            System.out.println("This is true");

        boolean isCar = false;
        if(isCar == true)
            System.out.println("This is not supposed to happen");

        isCar = true;
        //The operator "? : " is a way to write a if conditional called ternaries conditional
        //is the same of the regular if/else statement
        //In this case if the condition is true, true is the value assigned to wasCar
        //In case the condition is false, the false value is assigned.
        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("wasCar is true");

        //Little exercise with operators
        // 1. Create a double variable with the value 20
        // 2. Create a second variable of type double with the value 80
        // 3. Add both numbers up and multiply by 25
        // 4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
        // 5. Write an "if" statement that displays a message "Total was over the limit"
        //    if the remaining total (#4) is equal to 20 or less.
        double myFirstValue = 20d;
        double mySecondValue = 80;
        double myTotal = (myFirstValue + mySecondValue) * 25;
        System.out.println("myTotal = " + myTotal);
        double theRemainder = myTotal % 40;
        System.out.println("Remainder is " + theRemainder);
        if(theRemainder <=20)
            System.out.println("Total was over the limit");
    }
}
