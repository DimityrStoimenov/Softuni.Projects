import java.util.Scanner;

public class Renovation_04_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int heightOfWall = Integer.parseInt(scan.nextLine());
        int widthOfWall = Integer.parseInt(scan.nextLine());
        double percentOfTotalAreNotPainted = Double.parseDouble(scan.nextLine());
        int totalArea = heightOfWall * widthOfWall * 4;
        double paintedWalls = Math.ceil(totalArea - (totalArea * (percentOfTotalAreNotPainted / 100)));
        String input = scan.nextLine();
        while (!input.equals("Tired!")) {
            int liters = Integer.parseInt(input);
            paintedWalls -= liters;
            if (paintedWalls <= 0) {
                break;
            }

            input = scan.nextLine();
        }
        if (paintedWalls > 0) {
            System.out.printf("%.0f quadratic m left.", paintedWalls);
        } else if (paintedWalls == 0) {
            System.out.println("All walls are painted! Great job, Pesho!");
        } else {
            double leftPaint = Math.abs(paintedWalls);
            System.out.printf("All walls are painted and you have %.0f l paint left!", Math.abs(leftPaint));
        }
    }
}
