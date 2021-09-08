import java.util.Scanner;

public class Darts_04_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nameOfPlayer = scan.nextLine();
        int initialShots= 301;
        int successfulShots= 0;
        int unSuccessfulShots =0;
        int shot=0;
        int result=0;

        String command= "";
        while(!"Retire".equals(command= scan.nextLine())) {
            switch ( command) {
                case "Single":
                    int points= Integer.parseInt(scan.nextLine());
                    shot = points;
                    break;
                case "Double":
                     points= Integer.parseInt(scan.nextLine());
                    shot= points *2;
                    break;
                case "Triple":
                     points= Integer.parseInt(scan.nextLine());
                      shot= points * 3;
                    break;
                default:
            }
            if(shot > initialShots) {
                unSuccessfulShots++;
                result= initialShots;
                initialShots= result;

            }
            if(initialShots>= shot) {
                successfulShots++;
                initialShots-=shot;
            }
            if( initialShots == 0) {
                break;
            }

        }

        if(initialShots == 0) {
            System.out.printf("%s won the leg with %d shots.",nameOfPlayer,successfulShots);
        } else {
            System.out.printf("%s retired after %d unsuccessful shots.",nameOfPlayer,unSuccessfulShots);
        }

    }
}
