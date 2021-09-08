import java.util.Scanner;

public class EasterCompetition_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfEasters = Integer.parseInt(scan.nextLine());
        int maxRate= Integer.MIN_VALUE;
        int rate = 0;
        String theBestConfectioner = "";
        for (int i = 0; i < numberOfEasters; i++) {
            String nameOfConfectioner= scan.nextLine();
            String command= scan.nextLine();
            while(!"Stop".equals(command)) {
                int rateOfEaster = Integer.parseInt(command);
                rate+= rateOfEaster;
                command= scan.nextLine();
            }
            System.out.printf("%s has %d points.%n",nameOfConfectioner,rate);
            if(rate > maxRate) {
                maxRate= rate;
                theBestConfectioner=nameOfConfectioner;
                System.out.printf("%s is the new number 1!%n",theBestConfectioner);
            }
            rate=0;

        }
        System.out.printf("%s won competition with %d points!",theBestConfectioner,maxRate);
    }
}
