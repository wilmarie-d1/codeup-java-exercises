import java.net.SocketOption;
import java.util.Scanner;
public class ControlFlowExercises {

            public static void main(String[] args) {
            int i =5;
            while (i <=15) {
                System.out.printf("%s", i);
                i++;
            }

            int count = 0;
            do {
                if (count %2 == 0) {
                    System.out.println(count);
                }count ++;
            } while (count <= 100);


                int count1 = 0;
                do {
                    if (count1 %5 == 0) {
                        System.out.println(count);
                    }count1--;
                } while (count1 >= -10);

                long count2 = 2;
                do {
                    System.out.println(count2);
                       count2 *= count2;
                }while (count2 < 1000000);

                    for (int k = 100; k >= -10; k-=5){
                        System.out.println(k);
                    }
                    for(long l =2; l < 1000000; l*= l) {
                        System.out.println(l);
                    }

                    Scanner steve =new Scanner (System.in);
                    int userInput = 0;
                    String playAgain = "y";

                while (playAgain.equalsIgnoreCase("y")) {
                    System.out.print("What number would you like to go?");
                    userInput = steve.nextInt();
                    System.out.println("Here's Your table! \n");
                    System.out.println("number  |  squared  |  cubed");
                    System.out.println("------  |  ------  |  -----");
                    for (int m = 1; m <= userInput; m ++) {
                        System.out.printf("%s    | %s     |%s   \n", m, m*m, m*m*m);
                    }
                    System.out.println("Would you like to play again?");
                    playAgain = steve.next();

                }

                while (playAgain.equalsIgnoreCase("y")) {
                    System.out.print("What is your number grade?");
                    userInput = steve.nextInt();
                    if (userInput >= 0 && userInput <= 59) {
                        System.out.println("F");
                    } else if (userInput >= 60 && userInput <= 66) {
                        System.out.println("D");
                    } else if (userInput >= 67 && userInput <= 79) {
                        System.out.println("C");

                    } else if (userInput >= 80 && userInput <= 87) {
                        System.out.println("B");
                    } else if (userInput >= 88 && userInput <= 100) {
                        System.out.println("A");
                    }
                    System.out.print("Not on the grading scale");
                }
                System.out.println("Would you like to play again?");
                    playAgain = steve.next();


    }}
