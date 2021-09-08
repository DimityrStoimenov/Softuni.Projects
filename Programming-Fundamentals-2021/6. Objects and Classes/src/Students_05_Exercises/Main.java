package Students_05_Exercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Student> listOfStudents = new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            String [] studentDataBase = scan.nextLine().split("\\s+");
            String firstName = studentDataBase[0];
            String lastName = studentDataBase[1];
            double grade = Double.parseDouble(studentDataBase[2]);
            Student student = new Student(firstName,lastName,grade);
            listOfStudents.add(student);
        }
        listOfStudents.stream().sorted(Comparator.comparing(Student::getGrade).reversed())
        .forEach(e -> System.out.printf("%s %s: %.2f%n",e.getFirstName(), e.getLastName(), e.getGrade()));

    }
}
