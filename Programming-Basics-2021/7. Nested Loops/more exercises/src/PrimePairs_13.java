import java.util.Scanner;

public class PrimePairs_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int initialValueOfTheFirstPairOfNumbers = Integer.parseInt(scan.nextLine());
        int initialValueOfTheSecondPairOfNumbers = Integer.parseInt(scan.nextLine());
        int theDifferenceBetweenTheInitialAndFinalValueOfTheFirstPairOfNumbers = Integer.parseInt(scan.nextLine());
        int theDifferenceBetweenTheInitialAndFinalValueOfTheSecondPairOfNumbers = Integer.parseInt(scan.nextLine());
        for (int i = initialValueOfTheFirstPairOfNumbers; i <= initialValueOfTheFirstPairOfNumbers+theDifferenceBetweenTheInitialAndFinalValueOfTheFirstPairOfNumbers ; i++) {
            for (int j = initialValueOfTheSecondPairOfNumbers; j <=initialValueOfTheSecondPairOfNumbers+theDifferenceBetweenTheInitialAndFinalValueOfTheSecondPairOfNumbers; j++) {
                if((i % 2 !=0 && i % 3!=0 && i % 5 !=0 && i % 7 !=0) && (j % 2 !=0 && j % 3!=0 && j % 5 !=0 && j % 7 !=0)) {
                    System.out.printf("%d%d%n", i,j);
                }
            }
        }

    }
}
