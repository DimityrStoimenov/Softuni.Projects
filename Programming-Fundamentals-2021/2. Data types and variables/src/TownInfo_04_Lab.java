import java.util.Scanner;

public class TownInfo_04_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String town = scan.nextLine();
        int population = Integer.parseInt(scan.nextLine());
        int square = Integer.parseInt(scan.nextLine());
        System.out.printf("Town %s has population of %d and area %d square km.", town,population,square);

    }
}
