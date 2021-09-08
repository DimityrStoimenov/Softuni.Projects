package StudentsDataBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Student> studentDatabase = new ArrayList<>();
        String input = scan.nextLine();
        while (!input.equals("end")) {
            String [] dataBaseOfEachStudent = input.split("\\s+");
            String firstName = dataBaseOfEachStudent[0];
            String lastName = dataBaseOfEachStudent[1];
            int age = Integer.parseInt(dataBaseOfEachStudent[2]);
            String birthTown = dataBaseOfEachStudent[3];
            Student student = new Student(firstName,lastName,age,birthTown);
            studentDatabase.add(student);

            input = scan.nextLine();
        }
        String city = scan.nextLine();
        List<Student> filterBirthTown = studentDatabase.stream().filter(e -> e.getBirthTown().equals(city))
                .collect(Collectors.toList());
        for (Student student : filterBirthTown) {
            System.out.printf("%s %s is %d years old%n", student.getFirstName(),student.getLastName(),student.getAge());
        }
    }
}
