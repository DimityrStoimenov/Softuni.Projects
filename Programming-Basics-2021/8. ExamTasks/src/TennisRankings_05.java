import java.util.Scanner;

public class TennisRankings_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfTournaments = Integer.parseInt(scan.nextLine());
        int initialNumberOfPointsInRankings = Integer.parseInt(scan.nextLine());
        int tournaments = 0;
        int first = 0;
        int second = 0;
        int third = 0;
        int winGames=0;
        for (int tournament = 0; tournament < numberOfTournaments; tournament++) {
            String sageOfTheTournament = scan.nextLine();
            tournaments++;
            switch (sageOfTheTournament) {
                case "W":
                    first += 2000;
                    initialNumberOfPointsInRankings += 2000;
                    winGames++;
                    break;
                case "F":
                    second += 1200;
                    initialNumberOfPointsInRankings += 1200;
                    break;
                case "SF":
                    third += 720;
                    initialNumberOfPointsInRankings += 720;
                    break;
            }
        }
        System.out.printf("Final points: %d%n", initialNumberOfPointsInRankings);
        int average= (first + second + third) / tournaments;
        System.out.printf("Average points: %d%n", average);
        double percent= (winGames * 1.0 / tournaments)*100;
        System.out.printf("%.2f%%", percent);
    }
}
