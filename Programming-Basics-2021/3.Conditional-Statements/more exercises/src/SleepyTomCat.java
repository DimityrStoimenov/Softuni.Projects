import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberDaysOff = Integer.parseInt(scan.nextLine()); // брой почивни дни
        int normTomForPlayingPerYear = 30000;
        int numberWorkDays = 365 - numberDaysOff;
        int playInWorkDays = numberWorkDays * 63;
        int playInDaysOff = numberDaysOff * 127;
        int normForPlayingPerYear = playInWorkDays + playInDaysOff;
        if(normTomForPlayingPerYear<normForPlayingPerYear) {
            System.out.println("Tom will run away");
           double difference = normForPlayingPerYear -normTomForPlayingPerYear;
           double hours = Math.floor(difference /60);
           double minutes = Math.floor(difference % 60);
            System.out.printf("%.0f hours and %.0f minutes more for play",hours,minutes);
        }  else if(normTomForPlayingPerYear>normForPlayingPerYear) {
            System.out.println("Tom sleeps well");
            double differenceForSleep = normTomForPlayingPerYear - normForPlayingPerYear;
            double hourForSleep = Math.floor(differenceForSleep /60);
            double minutesForSleep = Math.floor(differenceForSleep % 60);
            System.out.printf("%.0f hours and %.0f minutes less for play",hourForSleep,minutesForSleep);
        }
    }
}
