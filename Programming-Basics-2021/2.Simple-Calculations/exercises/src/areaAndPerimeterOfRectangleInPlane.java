import java.util.Scanner;

public class areaAndPerimeterOfRectangleInPlane {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1 = Double.parseDouble(scan.nextLine());
        double y1 = Double.parseDouble(scan.nextLine());
        double x2 = Double.parseDouble(scan.nextLine());
        double y2 = Double.parseDouble(scan.nextLine());
        double width = Math.abs(x1- x2);
        double height = Math.abs(y1-y2);
        double area = width *height;
        double perimeter = 2* (width +height);
        System.out.printf("%.2f%n", area );
        System.out.printf("%.2f",perimeter);

    }
}
