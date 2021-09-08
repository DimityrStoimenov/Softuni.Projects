import java.util.Scanner;

public class timeAfter15Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour= Integer.parseInt(scan.nextLine());
        int minutes= Integer.parseInt(scan.nextLine());
        // calculate hour in minutes = hour * 60 + minutes
        int totalInMinutes = hour * 60 + minutes;
        int totalInMinutesPlus15 = totalInMinutes + 15;

        //calculate endHour =  totalminutesPlus15 / 60;
        //  calculate enddMinute =totalminutesPlus15 % 60;
        int endHour = totalInMinutesPlus15 /60;
        int endMinutes = totalInMinutesPlus15 % 60;
        if(endHour == 24) {
            endHour = 0;
        }
        System.out.printf("%d:%02d", endHour,endMinutes);
    }
}
