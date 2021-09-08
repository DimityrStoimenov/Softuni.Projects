import java.util.Scanner;

public class BasketballTournament_06_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nameOfTournament = scan.nextLine();
        int resultByOurTeam =0;
        int resultByOppositeTeam =0;
        int ourPointsCnt = 0;
        int oppositePointsCnt = 0;
        int matches =0;
        int count =0;

        while(!"End of tournaments".equals(nameOfTournament)) {
            int numberOfMatches = Integer.parseInt(scan.nextLine());
            matches += numberOfMatches;
            for (int i = 1; i <=numberOfMatches; i++) {
                int pointsScoredByOurTeam = Integer.parseInt(scan.nextLine());
                int pointsScoredByOpposingTeam = Integer.parseInt(scan.nextLine());
                count++;
                if( pointsScoredByOurTeam > pointsScoredByOpposingTeam) {
                    resultByOurTeam = pointsScoredByOurTeam - pointsScoredByOpposingTeam;
                    ourPointsCnt++;
                    System.out.printf("Game %d of tournament %s: win with %d points.%n",count,nameOfTournament,resultByOurTeam);

                } else {
                    resultByOppositeTeam = pointsScoredByOpposingTeam - pointsScoredByOurTeam;
                    oppositePointsCnt++;
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n",count,nameOfTournament,resultByOppositeTeam);
                }

            }

            count =0;
            nameOfTournament = scan.nextLine();
        }
        double averageOurTeam = (ourPointsCnt * 1.0 / matches) * 100;
        System.out.printf("%.2f%% matches win%n",averageOurTeam);
        double averageOppositeTeam = (oppositePointsCnt * 1.0 / matches) * 100;
        System.out.printf("%.2f%% matches lost", averageOppositeTeam);

    }
}
