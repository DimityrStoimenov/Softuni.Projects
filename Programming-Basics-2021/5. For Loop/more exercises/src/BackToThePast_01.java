import java.util.Scanner;

public class BackToThePast_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double inheritedMoney= Double.parseDouble(scan.nextLine());
        int theYearWhichHeMustBeLiveInclusive= Integer.parseInt(scan.nextLine());
        int count= 18;
        double sum= 0;
        for (int i = 1800; i <= theYearWhichHeMustBeLiveInclusive ; i++) {
            if(i % 2 ==0) {
                sum+=12000;

            } else {
                sum+= 12000 + (50 * count);
            }
            count++;

        }
        if(sum<=inheritedMoney) {
            double leftMoney= inheritedMoney-sum;
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", leftMoney);

        } else {
            double neededMoney= sum - inheritedMoney;
            System.out.printf("He will need %.2f dollars to survive.", neededMoney);
        }
    }
}
