
import java.util.Scanner;

public class FromLeftToTheRight_02_MoreExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n  = scan.nextLong();
        long one;
        long two;
        long sum;
        for (int i = 0; i < n; i++) {
            one = scan.nextLong();
            two = scan.nextLong();
            if( one > two) {
                sum=0;
                while ( one != 0){
                    sum += one % 10;
                    one = one /10;
                }
                System.out.println(Math.abs(sum));
            } else {
                sum =0;
                while ( two != 0){
                    sum += two % 10;
                    two = two /10;
                }
                System.out.println(Math.abs(sum));
            }
        }
    }
}
