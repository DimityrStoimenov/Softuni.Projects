import java.util.Scanner;

public class Snowballs_11_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfSnowballs = Integer.parseInt(scan.nextLine());
      double maxSnowballSize = Double.MIN_VALUE;
       double sizeOfSnowball;

        int snowBallWinner = 0;
        int timeWinner = 0;
        int qualityWinner = 0;

        for (int i = 0; i < numberOfSnowballs ; i++) {
              int snowballSize = Integer.parseInt(scan.nextLine());
              int snowballTime = Integer.parseInt(scan.nextLine());
             int snowballQuality = Integer.parseInt(scan.nextLine());
            sizeOfSnowball = Math.pow((snowballSize * 1.0 / snowballTime), snowballQuality);


            if ( sizeOfSnowball > maxSnowballSize) {
                snowBallWinner = snowballSize;
                timeWinner = snowballTime;
                qualityWinner = snowballQuality;
                maxSnowballSize = sizeOfSnowball;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", snowBallWinner,timeWinner,maxSnowballSize,qualityWinner);
    }
}
