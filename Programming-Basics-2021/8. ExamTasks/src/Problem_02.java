import java.util.Scanner;

public class Problem_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int minutesWalkPerDay= Integer.parseInt(scan.nextLine());
        int numberWalksPerDay= Integer.parseInt(scan.nextLine());
        int takenCaloriesPerDay= Integer.parseInt(scan.nextLine());
        int totalMinutesWalkPerDay=minutesWalkPerDay*numberWalksPerDay;
        int burnedCaloriesPerDay= totalMinutesWalkPerDay * 5;
        if(burnedCaloriesPerDay>=(takenCaloriesPerDay*0.5)){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.",burnedCaloriesPerDay);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.",burnedCaloriesPerDay);
        }


    }
}
