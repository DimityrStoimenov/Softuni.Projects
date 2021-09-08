import java.util.Scanner;

public class calculateAreaAndPerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // read input x1,y1,x2,y,2
        //calculate width = x1-x2
        // calculate  length = y1-y2
        // calculate area = width* height
        // calculate perimeter= 2*(width+length)
        // print
        double x1= Double.parseDouble(scan.nextLine());
        double y1= Double.parseDouble(scan.nextLine());
        double x2= Double.parseDouble(scan.nextLine());
        double y2= Double.parseDouble(scan.nextLine());
        double width = Math.abs(x1-x2);
        double length =Math.abs(y1-y2);
        double area= width*length;
        double perimeter= 2*(width+length);
        System.out.printf("%.2f%n",area);
        System.out.printf("%.2f",perimeter);

    }
}
