import java.util.Scanner;

public class UniquePINCodes_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstDigit = Integer.parseInt(scan.nextLine());
        int secondDigit = Integer.parseInt(scan.nextLine());
        int thirdDigit = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= firstDigit; i++) {
            for (int j = 1; j <= secondDigit; j++) {
                for (int k = 1; k <= thirdDigit; k++) {

                    if(i %2 ==0 && (j==2|| j==3||j==5||j==7) && k% 2==0) {

                        System.out.println((i) + " " + (j) + " " + (k));
                    }
                }

            }


        }

    }

}
