package OpinionPoll_03_Exercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Person> information = new ArrayList<>();
        for (int i = 0; i < n ; i++) {
           String [] personDatabase = scan.nextLine().split("\\s+");
           String man = personDatabase[0];
           int age = Integer.parseInt(personDatabase[1]);
           Person person = new Person(man, age);
           information.add(person);
        }
        information.stream().filter(e -> e.getAge() > 30).sorted(Comparator.comparing(Person::getPerson))
                .forEach(e -> System.out.printf("%s - %d%n", e.getPerson(),e.getAge()));
    }
}
