import java.util.Scanner;

public class TextFilter_04_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String [] keyText = input.split(", ");
        String text = scan.nextLine();
        for (int i = 0; i <= keyText.length - 1; i++) {
        String currentString = keyText[i];
            StringBuilder build = new StringBuilder();
            for (int j = 0; j <= currentString.length() - 1 ; j++) {
                build.append("*");
            }
            int indexOfPartOfText = text.indexOf(currentString);
            while (indexOfPartOfText != -1) {
                text = text.replace(currentString,build);
                indexOfPartOfText= text.indexOf(currentString);
            }
        }
        System.out.print(text);
    }
}
