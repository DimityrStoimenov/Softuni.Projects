import java.util.Scanner;

public class Cinema_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String typeProjection = scan.nextLine();
        int r = Integer.parseInt(scan.nextLine()); // редове
        int c = Integer.parseInt(scan.nextLine()); // колони

        int hall = r * c;
        double income = 0;

        if(typeProjection.equals("Premiere")) {
            income = hall * 12.00;
            System.out.printf("%.2f leva", income);
        }
        if(typeProjection.equals("Normal")) {
            income = hall * 7.50;
            System.out.printf("%.2f leva", income);
        }
        if(typeProjection.equals("Discount")) {
            income = hall * 5.00;
            System.out.printf("%.2f leva", income);
        }
    }
}
