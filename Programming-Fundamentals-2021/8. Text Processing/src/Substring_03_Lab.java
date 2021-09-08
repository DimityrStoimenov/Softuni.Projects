import java.util.Scanner;

public class Substring_03_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String key = scan.nextLine();
        String text = scan.nextLine();
       int indexOfText = text.indexOf(key);
       while (indexOfText != -1) {
           text = text.replace(key, "");
           indexOfText = text.indexOf(key);
       }
        System.out.print(text);
    }
}
