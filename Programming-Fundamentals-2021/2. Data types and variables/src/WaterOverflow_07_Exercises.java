import java.util.Scanner;

public class WaterOverflow_07_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int capacity = 255;
        int waterTank = 0;
        for (int i = 0; i < n; i++) {
            int liters = Integer.parseInt(scan.nextLine());
            if (liters > capacity) {
                System.out.println("Insufficient capacity!");
            } else {
                capacity -= liters;
                waterTank += liters;
            }
        }
        System.out.println(waterTank);
    }
}

