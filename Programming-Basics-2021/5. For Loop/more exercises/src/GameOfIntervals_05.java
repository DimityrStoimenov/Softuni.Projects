import java.util.Scanner;

public class GameOfIntervals_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int movesOfTheGame = Integer.parseInt(scan.nextLine());
        int countOne=0;
        int countTwo=0;
        int countThree=0;
        int countFour=0;
        int countFive=0;
        int countSix=0;
        double sum=0;
        int count=0;

        for (int i = 0; i <movesOfTheGame; i++) {
            int digit = Integer.parseInt(scan.nextLine());
            count++;
            if(digit >= 0 && digit <= 9) {
                countOne++;
                sum += digit * 0.2;
            } else if(digit >= 10 && digit <= 19) {
                countTwo++;
                sum+= digit * 0.3;
            } else if ( digit >= 20 && digit <= 29) {
                countThree++;
                sum += digit * 0.4;
            } else if (digit >= 30 && digit <= 39) {
                countFour++;
                sum+= 50;
            } else if(digit >= 40 && digit<=50) {
                countFive++;
                sum+= 100;
            } else {
                countSix++;
                sum = sum /2;
            }


        }
        System.out.printf("%.2f%n", sum);
        double first = (countOne * 1.0 /count) *100;
        System.out.printf("From 0 to 9: %.2f%%%n",first);
        double second = ( countTwo * 1.0 / count) * 100;
        System.out.printf("From 10 to 19: %.2f%%%n", second);
        double third = (countThree *1.0 /count) * 100;
        System.out.printf("From 20 to 29: %.2f%%%n", third);
        double fourth = (countFour * 1.0 /count) * 100;
        System.out.printf("From 30 to 39: %.2f%%%n", fourth);
        double five = ( countFive * 1.0 / count) * 100;
        System.out.printf("From 40 to 50: %.2f%%%n", five);
        double six = (countSix * 1.0 / count) * 100;
        System.out.printf("Invalid numbers: %.2f%%", six);

    }
}
