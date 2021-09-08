import java.util.Scanner;

public class AverageNumber_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= Integer.parseInt(scan.nextLine());
        int sum=0;
        int count= 0;
        double average=0.0;
        for (int i = 0; i <n; i++) {
            int currentNumber= Integer.parseInt(scan.nextLine());
            sum+=currentNumber;
            count++;


        }
        average = sum *1.0 / count;
        System.out.printf("%.2f", average);
    }
}
