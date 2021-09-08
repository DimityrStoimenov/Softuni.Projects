import java.util.Scanner;

public class TournamentOfChristmas_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.nextLine());
        int winCnt = 0;
        int loseCnt = 0;
        double income = 0;
        double winMoneyForAllDays=0;
        int countWin=0;
        int countLose=0;
        for (int i = 0; i < N; i++) {
            String sport = scan.nextLine();
            while (!"Finish".equals(sport)) {
                String result = scan.nextLine();
                switch (result) {
                    case "win":
                        income += 20;
                        winCnt++;
                        countWin++;
                        break;
                    case "lose":
                        loseCnt++;
                        countLose++;
                        break;
                }
                sport=scan.nextLine();
            }
            if(countWin>countLose) {
                income +=income*0.1;
            }
           winMoneyForAllDays+=income;
            income=0;
            countWin=0;
            countLose=0;

        }
        if(winCnt>loseCnt) {
           winMoneyForAllDays+= winMoneyForAllDays*0.2;
        }
        if(winCnt>loseCnt) {
            System.out.printf("You won the tournament! Total raised money: %.2f",winMoneyForAllDays);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f",winMoneyForAllDays);
        }
    }
}
