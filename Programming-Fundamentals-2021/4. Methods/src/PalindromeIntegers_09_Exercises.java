import java.util.Scanner;

public class PalindromeIntegers_09_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        while (!command.equals("END")) {
            // число под формата на текст
            System.out.println(isPalindrome(command));

            command = scan.nextLine();
        }
    }
    // метод , който проверява дали числото е палиндром - връща true (ако е палиндром) и false ( ако не е палиндром)
    private static boolean isPalindrome(String number) {
        // дали чилото(или текста) -> е същото като числото(текста) наобратно -> true
        // ако не е -> false
        String reverseNumber = getReverseNumber(number);
        return number.equals(reverseNumber);
    }

    private static String getReverseNumber(String number) {
        // "234" -> "432"
        //обхождаме числото от последния към първия елемент
        String reversed = "";
        for (int i = number.length() - 1; i >= 0 ; i--) {
            char currentIndex = number.charAt(i);
            reversed += currentIndex;

        }
        // след като сме обходили всички елементи
        return reversed;
    }
}
