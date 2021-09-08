import java.util.Scanner;

public class ReverseStrings_SecondDecision_01_lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        while (!input.equals("end")) {
            String text = input;
            StringBuilder build = new StringBuilder(text);
            build.reverse();
            System.out.printf("%s = %s%n", text, build);

            input = scan.nextLine();
        }
    }
}
