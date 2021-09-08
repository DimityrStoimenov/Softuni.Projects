import java.util.Scanner;

public class MultiplyEvensByOdds_10_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // прочитаме чисото
        // взимаме дължината му за лявата сума и за дясната сума
        // умножаваме сумите като използваме Math.abs за да имаме положително число , ако числото ни е отрицателелно
       int number = Math.abs(Integer.parseInt(scan.nextLine()));

       int evenSum = sumEvenNumbers(number);
       int oddSum = sumOddNumbers(number);
       int sum = evenSum * oddSum;
        System.out.print(sum);

    }

    private static int sumOddNumbers(int number) {
        int sumOfOdds = 0;
        while (number > 0) {
            int residue = number % 10;
            if (residue % 2 != 0) {
                sumOfOdds += residue;
            }
            number = number / 10;
        }
        return sumOfOdds;
    }

    private static int sumEvenNumbers(int number) {
        int sumOfEven = 0;
        while (number > 0) {
            int residue = number % 10;
            if( residue % 2 == 0) {
                sumOfEven += residue;
            }
            number = number / 10;
        }
        return sumOfEven;
    }
}
