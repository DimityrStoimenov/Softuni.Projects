import java.util.Scanner;

public class SpiceMustFlow_09_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int startingYield = Integer.parseInt(scan.nextLine());
        int exTractSpice = startingYield;
        int consumption = 0;
        int countDays = 0;
       while (exTractSpice >= 100) {
           exTractSpice -= 10;
           startingYield -= 26;
           consumption += startingYield;
           startingYield = exTractSpice;
           countDays++;
       }
      if (consumption > 0) {
            consumption -= 26;
      }

        System.out.printf("%d%n", countDays);
        System.out.printf("%d",consumption);
    }
}
