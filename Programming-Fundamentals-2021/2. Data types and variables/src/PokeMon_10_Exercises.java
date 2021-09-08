import java.util.Scanner;

public class PokeMon_10_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.nextLine());
        int M = Integer.parseInt(scan.nextLine());
        int Y = Integer.parseInt(scan.nextLine());
        int residueOfPower = N;
        int countOfSuccessfulTargets = 0;
        while ( residueOfPower >= M) {
            residueOfPower = residueOfPower - M;
            if ( residueOfPower  == N / 2 && Y != 0) {
                    residueOfPower = residueOfPower / Y;
            }
            countOfSuccessfulTargets++;
        }
        System.out.printf("%d%n", residueOfPower);
        System.out.printf("%d",countOfSuccessfulTargets);

    }
}
