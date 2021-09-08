import java.util.Scanner;

public class FootballTournament_05_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nameOfTeam = scan.nextLine();
        int points =0;
        int wCnt =0;
        int dCnt =0;
        int lCnt =0;
        int numberOfMatches = Integer.parseInt(scan.nextLine());
        for (int i = 0; i <numberOfMatches; i++) {
            char symbol = scan.nextLine().charAt(0);
           switch(symbol) {
               case 'W':
                   points +=3;
                   wCnt++;
                   break;
               case 'D':
                   points+=1;
                   dCnt++;
                   break;
               case 'L':
                   points+=0;
                   lCnt++;
                   break;
           }
        }
        if(numberOfMatches ==0) {
            System.out.printf("%s hasn't played any games during this season.",nameOfTeam);
        } else if( numberOfMatches > 0) {
            System.out.printf("%s has won %d points during this season.%n",nameOfTeam,points);
            System.out.println("Total stats:");
            System.out.printf("## W: %d%n",wCnt);
            System.out.printf("## D: %d%n",dCnt);
            System.out.printf("## L: %d%n",lCnt);
            double percentWinGames = (wCnt *1.0 /numberOfMatches) *100;
            System.out.printf("Win rate: %.2f%%",percentWinGames);
        }
    }
}
