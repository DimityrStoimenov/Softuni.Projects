import java.util.Scanner;

public class Bills_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int months = Integer.parseInt(scan.nextLine());
        double water = 0;
        double internet = 0;
        double others = 0;
        int count = 0;
        double electro = 0;
        for (int i = 0; i < months; i++) {
            double electricity = Double.parseDouble(scan.nextLine());
            water += 20.00;
            internet += 15.00;
            electro += electricity;
            others = ((water + internet + electro) + ((water + internet + electro) * 0.2));

            count++;
        }
        System.out.printf("Electricity: %.2f lv%n", electro);
        System.out.printf("Water: %.2f lv%n", water);
        System.out.printf("Internet: %.2f lv%n", internet);
        System.out.printf("Other: %.2f lv%n", others);
        double average = (water + electro + internet + others) / count;
        System.out.printf("Average: %.2f lv", average);
    }
}
