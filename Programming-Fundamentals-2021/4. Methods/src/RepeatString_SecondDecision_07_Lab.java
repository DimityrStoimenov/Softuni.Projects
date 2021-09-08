import java.util.Scanner;

public class RepeatString_SecondDecision_07_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        int counter = Integer.parseInt(scan.nextLine());
        String stringCounter = stringCounterOfWord(string,counter);
        System.out.print(stringCounter);
    }

    private static String stringCounterOfWord(String string, int counter) {
        return String.valueOf(string).repeat(Math.max(0, counter));
    }
}

