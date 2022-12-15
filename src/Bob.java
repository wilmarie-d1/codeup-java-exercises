import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
     
            String input;

                System.out.println("What would you like to ask Bob?");
                 input = sc.nextLine();
                
                if(input.equals("?")) {
                    System.out.println("Sure");
                } else if (input.endsWith("!")) {
                    System.out.println("Whoa, chill out!");
                } else if (input.isEmpty()) {
                    System.out.println("Fine. Be that way!");
                    
                } else {
                    System.out.println("Whatever.");
                }

    }}
