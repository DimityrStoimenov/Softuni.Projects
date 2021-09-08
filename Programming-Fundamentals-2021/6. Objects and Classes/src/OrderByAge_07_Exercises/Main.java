package OrderByAge_07_Exercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Person> personDatabase = new ArrayList<>();
        String input = scan.nextLine();
        while (!input.equals("End")) {
            String [] database = input.split("\\s+");
            String student = database[0];
            int Id= Integer.parseInt(database[1]);
            int age = Integer.parseInt(database[2]);
            Person person = new Person(student,Id,age);
            personDatabase.add(person);

            input = scan.nextLine();
        }
        personDatabase.sort(Comparator.comparing(Person::getAge));
        for (Person person : personDatabase) {
            System.out.println(person.toString());
        }
    }
}
