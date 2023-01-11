import java.util.Arrays;

public class runner {
    public static void main(String[] args) {
        // Create a class named runner. This will be where your main method resides for you to test the following exercises.
        //
    }
    //Create a public static method called ascending that takes in an array and that returns an array. Return the array that was made in ascending order.
    public static String[] ascending(String[] arr) {
        Arrays.sort(arr);
        return arr;
    }
    //
    //Create a public static method called countWords that takes in a string and returns how many words are inside that string
    public static int countWords(String str) {
        String[] words = str.split("\\s+");
        return words.length;
    }
}



    //
    //Create a public static method called Calculator that takes in two numbers and a mathematical operator + - / * and will perform a calculation with the given numbers
    //
    //Create a public static method called cardHidden that takes a credit card number as a string and only displays the last four characters. The rest of the card number must be replaced by ************.
    //
    //Create a public static method called reverseOdd that given a string, reverse all the words which have odd length. The even length words are not changed
    //
    //Create a package called bigDinner. Inside bigDinner create a class called dinnerApp where your main method will be in order to test the following questions
    //
    //Inside bigDinner create a new class called Dinner. Make instance fields that can't be accessed outside Dinner. These fields should be of type String named appetizer, drink, side, meal, and dessert. Create a constructor that sets the appetizer, drink, side, meal, and dessert. Write getters and setters for each property.
    //
    //Create an interface named Sentence inside bigDinner
    //
    //Specify an instance method named myDinner that accepts no arguments and returns a String.
    //Change your Dinner class so that it implements the Sentence interface.
    //
    //The implementation of the myDinner method on Dinner class should return the following message:
    //
    //WOW! You have appetizer, meal, side, drink, and a dessert to top it off? That's one big dinner!
    //Remember to replace the instance properties of appetizer, drink, side, meal, and dessert to display the assigned values.
    //
    //Inside dinnerApp create a new instance of Dinner and make your new instance of Dinner use the Sentence interface# Oberon-Java-Asessment-Prep-Day2
