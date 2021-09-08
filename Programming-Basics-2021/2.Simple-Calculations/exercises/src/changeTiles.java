import java.util.Scanner;

public class changeTiles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int landing = Integer.parseInt(scan.nextLine());
        double tilesWidth = Double.parseDouble(scan.nextLine());
        double tilesLength = Double.parseDouble(scan.nextLine());
        int benchWidth = Integer.parseInt(scan.nextLine());
        int benchLength = Integer.parseInt(scan.nextLine());

        double areaLanding = landing * landing;
        double areaBench = benchWidth * benchLength;
        double netoArea = areaLanding - areaBench;
        double tile = tilesWidth * tilesLength;
        double totalTiles = netoArea / tile;
        double insertionTime = totalTiles * 0.2;
        System.out.println(totalTiles);
        System.out.println(insertionTime);
    }
}
