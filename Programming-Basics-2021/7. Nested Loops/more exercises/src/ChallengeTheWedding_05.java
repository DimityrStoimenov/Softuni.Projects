import java.util.Scanner;

public class ChallengeTheWedding_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int men = Integer.parseInt(scan.nextLine());
        int women = Integer.parseInt(scan.nextLine());
        int numberOfTables = Integer.parseInt(scan.nextLine());
        int count = 0;
        boolean isEndDating = false;
        for (int i = 1; i <= men; i++) {
            for (int j = 1; j <= women; j++) {
                if (i % 2 == 1 && j % 2 == 1 && numberOfTables % 2 == 1 ) {
                } else if (i % 2 == 1 && j % 2 == 1 && numberOfTables % 2 == 0) {
                } else if (i % 2 == 0 && j % 2 == 1 && numberOfTables % 2 == 0 ) {
                } else if (i % 2 == 0 && j % 2 == 1 && numberOfTables % 2 == 1) {

                } else if (i % 2 == 0 && j % 2 == 0 && numberOfTables % 2 == 0) {

                } else if (i % 2 == 0 && j % 2 == 0 && numberOfTables % 2 == 1) {
                } else if(i%2 ==1 && j % 2==0 && numberOfTables %2 ==0) {

                } else if(i%2 ==1 && j % 2==0 && numberOfTables %2 ==1){

                }
                if (numberOfTables <= 0 ) {
                    isEndDating = true;
                    break;
                }
                System.out.printf("(%d <-> %d) ", i, j);
                numberOfTables--;

                if (isEndDating) {
                    break;

                }

            }
        }
    }
}




