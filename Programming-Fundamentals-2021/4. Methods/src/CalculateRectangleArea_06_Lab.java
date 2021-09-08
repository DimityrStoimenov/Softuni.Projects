import java.util.Scanner;

public class CalculateRectangleArea_06_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double width = Double.parseDouble(scan.nextLine());
        double length = Double.parseDouble(scan.nextLine());
        double calculateArea = calculateAreaOfRectangle(width,length);
        System.out.printf("%.0f",calculateArea);
    }

    private static double calculateAreaOfRectangle(double a, double b) {
        return a * b;
    }
}
