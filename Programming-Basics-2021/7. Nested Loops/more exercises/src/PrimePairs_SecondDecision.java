import java.util.Scanner;

public class PrimePairs_SecondDecision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstPair= Integer.parseInt(scan.nextLine());
        int secondPair= Integer.parseInt(scan.nextLine());
        int firstDiff= Integer.parseInt(scan.nextLine());
        int secondDiff= Integer.parseInt(scan.nextLine());
        for (int i = firstPair; i <= firstPair+firstDiff; i++) {
            for (int j = secondPair; j <=secondPair+secondDiff; j++) {
                int firstSqrt= (int)Math.floor(Math.sqrt(i));
                int doubleSqrt= (int)Math.floor(Math.sqrt(j));
                boolean isPrimeOne= true;
                boolean isPrimeTwo= true;
                for(int firstPrime = 2; firstPrime <= firstSqrt; firstPrime++) {
                    if(i % firstPrime ==0 ) {
                        isPrimeOne= false;
                    }
                }
                for(int secondPrime =2 ; secondPrime <= doubleSqrt; secondPrime++){
                    if(j % secondPrime ==0) {
                        isPrimeTwo=false;
                    }
                }
                if(isPrimeOne && isPrimeTwo) {
                    System.out.printf("%d%d%n", i,j);
                }

            }

        }
    }
}
