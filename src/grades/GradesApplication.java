package grades;

import util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void studentInformation(HashMap<String, Student> students) {
        System.out.println("Welcome <insert teacher name here>! \nHere are our current student's GitHub usernames: ");
        System.out.print("| ");
        for (String username : students.keySet()) {
            System.out.print(username + " | ");
        }
        String answer;
        do {
            System.out.println("\nWhat student would you like to see more information on?");
            String studentRequest = Input.getString();
            if (students.containsKey(studentRequest)) {
                System.out.println("Name: " + students.get(studentRequest).getName() + " | GitHub: " + studentRequest + " | Grade Average: " + students.get(studentRequest).getGradeAverage());
            } else {
                System.out.printf("Sorry, no student found with the github username %s.", studentRequest);
            }
            System.out.println("Would you like to search for another student? (y/n)");
            Scanner scanner = new Scanner(System.in);
            answer = scanner.nextLine();
        } while (answer.equals("y"));
        System.out.println("Have a nice day.");
    }


    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student wilmarie = new Student("wilmarie");
        wilmarie.addGrade(89);
        wilmarie.addGrade(100);
        wilmarie.addGrade(50);
        students.put("wilmarie-d", wilmarie);

        Student matt = new Student("matt");
        matt.addGrade(98);
        matt.addGrade(72);
        matt.addGrade(83);
        students.put("matthew", matt);

        Student jimmy = new Student("jimmy");
        jimmy.addGrade(54);
        jimmy.addGrade(105);
        jimmy.addGrade(79);
        students.put("jimdog", jimmy);

        Student nova = new Student("nova");
        nova.addGrade(100);
        nova.addGrade(99);
        nova.addGrade(97);
        students.put("nova-star", nova);

        studentInformation(students);
    }
}
