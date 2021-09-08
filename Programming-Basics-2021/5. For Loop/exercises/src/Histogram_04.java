import java.util.Scanner;

public class Histogram_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= Integer.parseInt(scan.nextLine());
        double p1;
        double p2;
        double p3;
        double p4;
        double p5;
        int count=0;
        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        int count5=0;


        for (int i = 0; i <n; i++) {
            int currentNumber= Integer.parseInt(scan.nextLine());
            count++;
            if(currentNumber>=0 && currentNumber<200) {
                count1++;
            } else if(currentNumber>=200 && currentNumber<=399) {
                count2++;
            } else if(currentNumber>=400 && currentNumber<=599){
                count3++;
            }else if(currentNumber>=600 && currentNumber<=799) {
                count4++;
            } else if(currentNumber>=800) {
                count5++;
            }

        }
        p1=count1*1.0/count*100;
        p2=count2*1.0/count*100;
        p3=count3*1.0/count*100;
        p4=count4*1.0/count*100;
        p5=count5*1.0/count*100;

        System.out.printf("%.2f%%%n",p1);
        System.out.printf("%.2f%%%n",p2);
        System.out.printf("%.2f%%%n",p3);
        System.out.printf("%.2f%%%n",p4);
        System.out.printf("%.2f%%",p5);

    }
}
