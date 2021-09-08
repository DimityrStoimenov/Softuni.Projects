import java.util.Scanner;
public class EasterDecoration_06_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfClients = Integer.parseInt(scan.nextLine());
        int count;
       double sum;
       double discount;
      double oddSum=0;
      double evenSum=0;
        for (int i = 1; i <= numberOfClients; i++) {
            String purchase= scan.nextLine(); //  ("basket", "wreath" или "chocolate bunny")
            sum =0;
            count=0;
            while(!"Finish".equals(purchase)) {
                switch(purchase) {
                    case "basket":
                        sum += 1.50;
                        break;
                    case "wreath":
                        sum += 3.80;
                        break;
                    case "chocolate bunny":
                        sum += 7;
                        break;
                }
                count++;
                purchase= scan.nextLine();
            }
            if (count % 2 == 0) {
                discount = sum - (sum * 0.2);
                System.out.printf("You purchased %d items for %.2f leva.%n",count,discount);
                evenSum+= discount;
            } else {
                System.out.printf("You purchased %d items for %.2f leva.%n",count,sum);
                oddSum+=sum;
            }

        }
        double average = (evenSum + oddSum) / numberOfClients;
        System.out.printf("Average bill per client is: %.2f leva.", average);
    }
}
