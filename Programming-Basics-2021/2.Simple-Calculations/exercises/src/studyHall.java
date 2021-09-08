import java.util.Scanner;

public class studyHall {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double length = Double.parseDouble(scan.nextLine());
        double b = Double.parseDouble(scan.nextLine());
        double width = b - 1.00;
        double widthOfDesks = Math.floor(width /0.7);
        double rows = Math.floor(length /1.20);
        double desks = (widthOfDesks * rows) -3;
        System.out.println(desks);
    }
}
