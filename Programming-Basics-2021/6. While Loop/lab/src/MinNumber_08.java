import java.util.Scanner;

public class MinNumber_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= Integer.parseInt(scan.nextLine());
        int min= Integer.MAX_VALUE;
        int number= 1;
        while(number <=n) {
            int currentNumber = Integer.parseInt(scan.nextLine());
            if(currentNumber<min) {
                min= currentNumber;
            }
            number++;
        }
        System.out.println(min);


    }
}
