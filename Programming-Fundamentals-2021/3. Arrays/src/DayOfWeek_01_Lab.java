import java.util.Scanner;

public class DayOfWeek_01_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int indexOfDay = Integer.parseInt(scan.nextLine());
        String [] dayOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (indexOfDay > 0) {
            System.out.print(dayOfWeek[indexOfDay - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
