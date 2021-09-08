import java.util.Scanner;

public class MaxNumber_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= Integer.parseInt(scan.nextLine());
        int max= Integer.MIN_VALUE;
        int number= 1;
        while (number <= n){
            int currentNumber= scan.nextInt();
            if(currentNumber > max) {
                max= currentNumber;
            }
            number++;
        }
        System.out.println(max);


    }
}
