import java.util.Scanner;

public class GameNumberWars_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nameOfFirstPlayer = scan.nextLine();
        String nameOfSecondPlayer= scan.nextLine();
        String command= "";
        int pointsFirstPlayer =0;
        int pointsSecondPlayer= 0;
        while( !"End of game". equals(command = scan.nextLine())) {
            int cardOfFirstPlayer = Integer.parseInt(command);
            int cardOfSecondPlayer = Integer.parseInt(scan.nextLine());
            if(cardOfFirstPlayer > cardOfSecondPlayer) {
               pointsFirstPlayer += cardOfFirstPlayer - cardOfSecondPlayer;
            } else if(cardOfFirstPlayer < cardOfSecondPlayer) {
                pointsSecondPlayer += cardOfSecondPlayer - cardOfFirstPlayer;
            }
            if( cardOfFirstPlayer == cardOfSecondPlayer) {
                cardOfFirstPlayer= Integer.parseInt(scan.nextLine());
                cardOfSecondPlayer= Integer.parseInt(scan.nextLine());
                System.out.println("Number wars!");
                if( cardOfFirstPlayer > cardOfSecondPlayer) {
                    System.out.printf("%s is winner with %d points", nameOfFirstPlayer,pointsFirstPlayer);
                } else if(cardOfFirstPlayer<cardOfSecondPlayer) {
                    System.out.printf("%s is winner with %d points",nameOfSecondPlayer,pointsSecondPlayer);
                }
                return;
            }

        }
        System.out.printf("%s has %d points%n",nameOfFirstPlayer,pointsFirstPlayer);
        System.out.printf("%s has %d points",nameOfSecondPlayer,pointsSecondPlayer);
    }
}
