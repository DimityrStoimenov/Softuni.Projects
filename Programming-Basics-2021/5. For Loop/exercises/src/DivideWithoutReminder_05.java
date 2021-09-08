import java.util.Scanner;

public class DivideWithoutReminder_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= Integer.parseInt(scan.nextLine());
        double p1;
        double p2;
        double p3;
        int count1=0;
        int count2=0;
        int count3=0;
        int count=0;
        for (int i = 0; i <n ; i++) {
            int currentNumber= Integer.parseInt(scan.nextLine());
            count++;
            if(currentNumber %2 ==0) {
                count1++;
            }
            if(currentNumber % 3 == 0) {
                count2++;
            }
            if(currentNumber % 4 == 0) {
                count3++;
            }

        }
        p1 = (count1 *1.0 /count) *100;
        p2 = (count2 *1.0 /count) *100;
        p3 = (count3 *1.0 /count) *100;

        System.out.printf("%.2f%%%n",p1);
        System.out.printf("%.2f%%%n",p2);
        System.out.printf("%.2f%%",p3);
    }
}
