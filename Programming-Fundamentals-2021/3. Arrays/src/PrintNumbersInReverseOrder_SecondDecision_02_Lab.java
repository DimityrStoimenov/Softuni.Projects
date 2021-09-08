import java.util.Scanner;

public class PrintNumbersInReverseOrder_SecondDecision_02_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int [] numbers = new int [n];
        for (int i = 0; i < n ; i++) {
            numbers[i] = Integer.parseInt(scan.nextLine());
        }
        for (int i = 0; i < numbers.length / 2  ; i++) {
            int swapIndex = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i -1 ] = swapIndex;

        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
