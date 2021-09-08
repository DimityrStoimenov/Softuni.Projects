import java.util.Scanner;

public class ReverseStrings_SecondDecision_02_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String [] newText = text.split("\\s+");
        StringBuilder build = new StringBuilder();
        for (String part : newText) {
            build.append(part.repeat(part.length()));
        }
        System.out.print(build);
    }
}

