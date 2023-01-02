import java.sql.SQLOutput;
import java.util.Scanner;
public class MethodsExercises {

public  static int add(int num1, int num2){
    return num1 + num2;
}
    public  static int sub(int num1, int num2){
        return num1 - num2;

    }
    public  static int mult(int num1, int num2){
        return num1 * num2;

    }
    public  static double div(double num1, double num2){
        return num1/num2;

    }
    public  static double mod(double num1, double num2) {
        return num1 % num2;
    }

    public static void getInteger(int min, int max) {
        Scanner clippy = new Scanner(System.in);
        System.out.print("Please enter a number between " +
                min + "-" + max);
            int userInput = clippy.nextInt();
            clippy.nextLine();
        if (userInput >= min && userInput <= max){
            System.out.println("You entered: " + userInput );
            System.out.println("Good job!");

        } else {
            getInteger(min, max);
        }
    }

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



