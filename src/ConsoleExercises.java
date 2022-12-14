import java.util.Scanner;
public class ConsoleExercises {

    public static void main(String[] args) {

//        Copy this code into your main method:
double pi = 3.14159;
////Write some Java code that uses the variable pi to output the following:
////The value of pi is approximately 3.14.
////Don't change the value of the variable; instead, reference one of the links above and use System.out.format to accomplish this.
//System.out.format("The value of pi is approximately " + "%.2f%n", pi);
////        Explore the Scanner Class.
////        Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
Scanner scanner = new Scanner(System.in); //scanner object
    System.out.print("Enter an integer please: ");
    int userInput = scanner.nextInt();
    System.out.println("You entered: " + userInput );

//        What happens if you input something that is not an integer?
       // It does not accept it

//        Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
        System.out.println("Enter three words: ");
        String userInput1 = scanner.next();
        String userInput2 = scanner.next();
        String userInput3 = scanner.next();
        System.out.printf("You entered: %s%n %s%n %s%n", userInput1, userInput2, userInput3);
////
//                What happens if you enter less than 3 words?
//                What happens if you enter more than 3 words?

//                Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
//        System.out.println("Enter a sentence: ");
//        String inputStr = scanner.nextLine();
//        System.out.printf("You wrote: %s ", inputStr);

//        do you capture all the words?
//                Rewrite the above example using the nextLine method.

//Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).
//
//Use the nextLine method each time you need to get user input. In this case, we need it twice, once to get the user input for the length and again to get the user input for the width. Parse the resulting strings to a numeric type.
//
//Assume that the rooms are perfect rectangles.
//Assume that the user will enter valid numeric data for length and width.
//Display the area and perimeter of that classroom.
//
//The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.
        Scanner scanner1 = new Scanner(System.in); //scanner object

        System.out.print("What is the width of the classroom?");
            String userWidth = scanner1.nextLine();
            int width = Integer.parseInt(userWidth);
            System.out.print("What is the length of the classroom?");
            String userLength = scanner1.nextLine();
            int length = Integer.parseInt(userLength);
            int area = (length * width);
            int perimeter = 2 * (length + width);
            System.out.println("The area of the classroom is: " + area);
            System.out.println("The perimeter of the classroom is " + perimeter);

        //BONUSSSS
        System.out.println("Enter the length and  width of the room: ");
        String widthInput = scanner1.nextLine();
        scanner1.useDelimiter("");
        float userBonusLength = scanner.nextFloat();




}}
