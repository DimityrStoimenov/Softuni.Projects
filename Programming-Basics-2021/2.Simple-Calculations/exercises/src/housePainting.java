import java.util.Scanner;

public class housePainting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = Double.parseDouble(scan.nextLine()); // височина на къщата
        double y = Double.parseDouble(scan.nextLine()); // дължина на страничната стена
        double h = Double.parseDouble(scan.nextLine()); // височина на триъгълната стена на покрива

        double frontWallHouse = (x * x) - (1.2 * 2.0);
        double backWallHouse = (x * x);
        double  firstSideWall = (x * y) - (1.5 * 1.5);
        double secondSideWall = (x *y) - (1.5 * 1.5);
        double greenPaintConsumption = (frontWallHouse + backWallHouse + firstSideWall + secondSideWall) /3.4;
        double firstAndSecondLateralSlopeRoof = (2 *(x * y));
        double frontAndBackSideSlopeRoof = (2 * (x * h /2));
        double redPaintConsumption = (firstAndSecondLateralSlopeRoof + frontAndBackSideSlopeRoof) / 4.3;
        System.out.printf("%.2f%n", greenPaintConsumption);
        System.out.printf("%.2f", redPaintConsumption);
    }
}
