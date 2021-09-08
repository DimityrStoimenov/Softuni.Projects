import java.util.Scanner;

public class SquareAreaFromBook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("a= ");
        double a = Double.parseDouble(scan.nextLine());
        double area = a * a;
        System.out.print("area= ");
        System.out.println(area);
    }
}
