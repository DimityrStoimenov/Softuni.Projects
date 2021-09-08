import java.util.Scanner;

public class RepeatStrings_02_lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String [] partOfText = text.split("\\s+");
        StringBuilder build = new StringBuilder();
        for (int i = 0; i <= partOfText.length - 1 ; i++) {
            String currentPart = partOfText[i];
            for (int j = 0; j <= currentPart.length() -1 ; j++) {
               build.append(currentPart);
            }
        }
        System.out.print(build);
    }
}
