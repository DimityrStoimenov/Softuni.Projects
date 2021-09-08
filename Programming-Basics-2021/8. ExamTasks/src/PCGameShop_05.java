import java.util.Scanner;

public class PCGameShop_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfGames = Integer.parseInt(scan.nextLine());
        int HCnt = 0;
        int FCnt = 0;
        int OvCnt = 0;
        int otCnt = 0;
        for (int i = 0; i < numberOfGames ; i++) {
            String nameOfGame = scan.nextLine();
            if(nameOfGame.equals("Hearthstone")) {
                HCnt++;
            } else if(nameOfGame.equals("Fornite")) {
                FCnt++;
            } else if(nameOfGame.equals("Overwatch")) {
                OvCnt++;
            } else {
                otCnt++;
            }
        }
        double hearthstone = (HCnt *1.0 / numberOfGames) * 100;
        double fornite = (FCnt * 1.0 / numberOfGames) * 100;
        double overwatch = (OvCnt * 1.0 / numberOfGames) * 100;
        double others = (otCnt * 1.0 /numberOfGames) * 100;
        System.out.printf("Hearthstone - %.2f%%%n", hearthstone);
        System.out.printf("Fornite - %.2f%%%n",fornite);
        System.out.printf("Overwatch - %.2f%%%n",overwatch);
        System.out.printf("Others - %.2f%%",others);
    }
}
