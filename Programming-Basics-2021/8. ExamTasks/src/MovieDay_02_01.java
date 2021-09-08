import java.util.Scanner;

public class MovieDay_02_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int timeFilming= Integer.parseInt(scan.nextLine());
        int numberOfMovieScenes= Integer.parseInt(scan.nextLine());
        int sceneDuration= Integer.parseInt(scan.nextLine());
        double netTimeFilming= timeFilming - (timeFilming * 0.15);
        double film = numberOfMovieScenes * sceneDuration;
        if(netTimeFilming<film) {
            double requiredTime = film - netTimeFilming;
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.",requiredTime);
        } else if(netTimeFilming>=film) {
            double leftTime= netTimeFilming - film;
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!", leftTime);
        }

    }
}
