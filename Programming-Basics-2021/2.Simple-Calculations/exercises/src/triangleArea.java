import java.util.Scanner;

public class triangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());
        double area = (a * h) / 2.0;
        System.out.printf("%.2f", area);
    }
}
