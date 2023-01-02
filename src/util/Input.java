package util;
 import java.util.Scanner;

 public class Input {
    private static Scanner scanner = new Scanner(System.in);
    public static  String getString() {
        return scanner.nextLine();
    }
    public static boolean yesNo(){
        String userInput = scanner.nextLine();
        return userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y");
    }




}
