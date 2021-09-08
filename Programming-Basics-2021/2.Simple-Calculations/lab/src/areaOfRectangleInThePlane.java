import java.util.Scanner;

public class areaOfRectangleInThePlane {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1 = Double.parseDouble(scan.nextLine());
        double y1 = Double.parseDouble(scan.nextLine());
        double x2 = Double.parseDouble(scan.nextLine());
        double y2 = Double.parseDouble(scan.nextLine());
       double length = Math.abs(x1-x2);
       double height = Math.abs(y1-y2);
       double area = length * height;
       double perimeter= 2*(length + height);
        System.out.printf("%.2f%n", area);
        System.out.printf("%.2f", perimeter);
    }
}
