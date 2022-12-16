import java.sql.SQLOutput;
import java.util.Scanner;

public class MethodsExercises {
public static void getInteger(int min, int max) {
        Scanner clippy = new Scanner(System.in);
        System.out.print("Please enter a number between " +
                min + "," + max);
            int userInput = clippy.nextInt();
            clippy.nextLine();
        if (userInput >= min && userInput <= max){
            System.out.println("You entered: " + userInput );
            System.out.println("Good job!");

        } else {
            getInteger(min, max);
        }
    }
//    Calculate the factorial of a number.
//
//    Prompt the user to enter an integer from 1 to 10.
//    Display the factorial of the number entered by the user.
//    Ask if the user wants to continue.
//    Use a for loop to calculate the factorial.
//    Assume that the user will enter an integer, but verify it’s between 1 and 10.
//    Use the long type to store the factorial.
//    Continue only if the user agrees to.
//    A factorial is a number multiplied by each of the numbers before it.
//    Factorials are denoted by the exclamation point (n!). Ex:
        public static int factorial(int num){

            long factorial = 1;
            for(int i = 1; i <= num; ++i)
            {
                // factorial = factorial * i;
                factorial *= i;
            }
            System.out.printf("Factorial of %d = %d", num, factorial);
                return num;
}
//    Create an application that simulates dice rolling.
//
//    Ask the user to enter the number of sides for a pair of dice.
//    Prompt the user to roll the dice.
//"Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//            Use static methods to implement the method(s) that generate the random numbers.
//    Use the .random method of the java.lang.Math class to generate random numbers.


        public static void main(String[] args) {
            int x = 5 * 4 % 3;
            System.out.println(x);
        }}



