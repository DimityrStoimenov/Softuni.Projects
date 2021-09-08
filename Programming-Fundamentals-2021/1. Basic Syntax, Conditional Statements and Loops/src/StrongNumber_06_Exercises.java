import java.util.Scanner;

public class StrongNumber_06_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       int number = Integer.parseInt(scan.nextLine());
       int num = number;
       int digit;
       int product = 1;
       int sum = 0;
       while ( num > 0 ) {
           digit = num % 10;
               for (int i = 1; i <= digit; i++) {
                 product *= i;
                   if (i == 0) {
                       sum += i;
                   }
               }
           sum += product;
               product = 1;
           num = num / 10;
       }

       if(sum == number) {
           System.out.println("yes");
       } else {
           System.out.println("no");
       }
    }
}
