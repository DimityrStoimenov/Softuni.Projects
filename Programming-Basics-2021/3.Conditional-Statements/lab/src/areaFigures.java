import java.util.Scanner;

public class areaFigures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double area;
        String figure = scan.nextLine();
        if(figure.equals("square")) {
            double side = Double.parseDouble(scan.nextLine());
             area = side * side;
            System.out.printf("%.3f", area);
        } else if ( figure.equals("rectangle")) {
            double a = Double.parseDouble(scan.nextLine());
            double b = Double.parseDouble(scan.nextLine());
            area = a *b;
            System.out.printf("%.3f", area);
        } else if (figure.equals("circle")) {
            double r = Double.parseDouble(scan.nextLine());
            area = r * r * Math.PI;
            System.out.printf("%.3f", area);
        } else if (figure.equals("triangle")) {
            double c = Double.parseDouble(scan.nextLine());
            double d = Double.parseDouble(scan.nextLine());
            area = c * d /2;
            System.out.printf("%.3f", area);
        }
    }
}
