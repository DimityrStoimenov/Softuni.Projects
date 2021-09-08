import java.util.Scanner;

public class Elevator_03_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scan.nextLine());
        int capacityOfTheElevator = Integer.parseInt(scan.nextLine());
        int courses = (int) Math.ceil ((double) numberOfPeople /capacityOfTheElevator);
        System.out.println(courses);
    }
}
