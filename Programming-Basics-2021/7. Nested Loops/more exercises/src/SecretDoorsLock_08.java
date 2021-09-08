import java.util.Scanner;

public class SecretDoorsLock_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int boundOfHundreds= Integer.parseInt(scan.nextLine());
        int boundOfTens= Integer.parseInt(scan.nextLine());
        int boundOfOnes= Integer.parseInt(scan.nextLine());
        for (int i = 1; i <=boundOfHundreds; i++) {
            for (int j = 1; j <= boundOfTens ; j++) {
                for (int k = 1; k <= boundOfOnes; k++) {
                    if( i %2 ==0 && (j ==2 || j==3 || j==5 || j==7) && k %2 ==0) {
                        System.out.printf("%d %d %d%n", i,j,k);
                    }

                }

            }

        }
    }
}
