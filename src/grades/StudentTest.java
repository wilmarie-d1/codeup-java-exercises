package grades;

public class StudentTest {

    public static void main(String[] args) {

        Student wilmarie = new Student("wilmarie");


        wilmarie.addGrade(89);
        wilmarie.addGrade(100);
        wilmarie.addGrade(50);
        System.out.println(wilmarie.getName());
        System.out.println(wilmarie.getGradeAverage());
    }
}
