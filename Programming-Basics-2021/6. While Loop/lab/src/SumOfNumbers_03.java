import java.util.Scanner;

public class SumOfNumbers_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // input
        // въвеждаме го , докато ! input=Stop
        // сумираме числата от Input и сборътизвеждаме ма конзолата
        int sum = 0;
        String input = scan.nextLine();

        while(!input.equals("Stop")) {
            sum = sum + Integer.parseInt(input);
            input= scan.nextLine();
        }
        System.out.println(sum);
    }
}
