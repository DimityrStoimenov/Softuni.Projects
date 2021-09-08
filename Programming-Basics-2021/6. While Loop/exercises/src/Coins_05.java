import java.util.Scanner;

public class Coins_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //спираме програмата когато Рестото<=0
        // продължаваме цикъла докато Рестото>0
        double changeInSt =  Double.parseDouble(scan.nextLine());// рестото
        double change= Math.round(changeInSt * 100);
        int count = 0; // брой на монетите, които сме върнали
        while (change > 0) {
            // ние ще връщаме ресто
            // можем да връщаме с: 2лв, 1лв, 0.50ст, 0.20ст,0.10ст, 0.05ст,0.02ст, 0.01ст
            if (change >= 200) {
                change -= 200;
                count++;
            } else if (change >= 100) {
                change -= 100;
                count++;
            } else if (change >= 50) {
                change -= 50;
                count++;
            } else if (change >= 20) {
                change -= 20;
                count++;
            } else if (change >= 10) {
                change -= 10;
                count++;
            } else if (change >= 5) {
                change -= 5;
                count++;
            } else if (change >= 2) {
                change -= 2;
                count++;
            } else if (change >= 1) {
                change -= 1;
                count++;
            }
        }
        System.out.println(count);
    }
}
