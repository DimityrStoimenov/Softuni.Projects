import java.util.Scanner;

public class EasterEggsBattle_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfEggsOfPlayerOne= Integer.parseInt(scan.nextLine());
        int numberOfEggsOfPlayerTwo= Integer.parseInt(scan.nextLine());
        int playerOne=0;
        int playerTwo=0;
        String command= scan.nextLine();
        while(!"End of battle".equals(command)) {
            if(command.equals("one")) {
            numberOfEggsOfPlayerTwo-=1;
            } else if(command.equals("two")) {
               numberOfEggsOfPlayerOne-=1;
            }
            if(numberOfEggsOfPlayerOne <= 0 || numberOfEggsOfPlayerTwo <= 0) {
                break;
            }
            command = scan.nextLine();
        }
        if(numberOfEggsOfPlayerOne<=0) {
            System.out.printf("Player one is out of eggs. Player two has %d eggs left.",numberOfEggsOfPlayerTwo);
        } else if(numberOfEggsOfPlayerTwo <= 0) {
            System.out.printf("Player two is out of eggs. Player one has %d eggs left.",numberOfEggsOfPlayerOne);
        } else {
            System.out.printf("Player one has %d eggs left.%n",numberOfEggsOfPlayerOne);
            System.out.printf("Player two has %d eggs left.",numberOfEggsOfPlayerTwo);
        }
    }
}
