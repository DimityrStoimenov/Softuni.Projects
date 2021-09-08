import java.util.Scanner;

public class Profit_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfCoinsOfBGNOne= Integer.parseInt(scan.nextLine());
        int numberOfCoinsOfBGNTwo= Integer.parseInt(scan.nextLine());
        int numberOfCoinsOfBGNFive= Integer.parseInt(scan.nextLine());
        int sum= Integer.parseInt(scan.nextLine());
        for (int i = 0; i <= numberOfCoinsOfBGNOne ; i++) {
            for (int j = 0; j <= numberOfCoinsOfBGNTwo ; j++) {
                for (int k = 0; k <=numberOfCoinsOfBGNFive ; k++) {
                    if( i * 1 + j * 2 + k*5 == sum) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", i,j, k, sum);
                    }

                }
                
            }

        }
    }
}
