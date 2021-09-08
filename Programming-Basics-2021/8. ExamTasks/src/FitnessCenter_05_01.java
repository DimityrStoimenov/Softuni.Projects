import java.util.Scanner;

public class FitnessCenter_05_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfVisitors = Integer.parseInt(scan.nextLine());
        int backCnt=0;
        int chestCnt=0;
        int legsCnt=0;
        int absCnt=0;
        int proteinShakeCnt=0;
        int proteinBarCnt=0;
        for (int i = 1; i <= numberOfVisitors; i++) {
            String command = scan.nextLine(); // ("Back", "Chest", "Legs", "Abs", "Protein shake" или "Protein bar")
            switch(command) {
                case "Back":
                    backCnt++;
                    break;
                case "Chest":
                    chestCnt++;
                    break;
                case "Legs":
                    legsCnt++;
                    break;
                case "Abs":
                    absCnt++;
                    break;
                case "Protein shake":
                  proteinShakeCnt++;
                    break;
                case "Protein bar":
                    proteinBarCnt++;
                    break;
            }

        }
        System.out.printf("%d - back%n",backCnt);
        System.out.printf("%d - chest%n",chestCnt);
        System.out.printf("%d - legs%n",legsCnt);
        System.out.printf("%d - abs%n",absCnt);
        System.out.printf("%d - protein shake%n",proteinShakeCnt);
        System.out.printf("%d - protein bar%n",proteinBarCnt);
        double percentageOfPeopleComeToTrain = ((backCnt + chestCnt + legsCnt + absCnt)*1.0 /numberOfVisitors) * 100;
        System.out.printf("%.2f%% - work out%n",percentageOfPeopleComeToTrain);
        double percentageComeToBuyProtein = ((proteinShakeCnt + proteinBarCnt) * 1.0 /numberOfVisitors) * 100;
        System.out.printf("%.2f%% - protein",percentageComeToBuyProtein);
    }
}
