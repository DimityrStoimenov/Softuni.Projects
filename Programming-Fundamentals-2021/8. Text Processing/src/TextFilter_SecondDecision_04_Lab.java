import java.util.Scanner;

public class TextFilter_SecondDecision_04_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] keys = scan.nextLine().split(", ");
        String text = scan.nextLine();
        for (String key : keys) {
         String replaceKey = replaceKeyInText(key.length(), "*");
         text = text.replace(key, replaceKey);
        }
        System.out.print(text);

    }
    private static String replaceKeyInText(int length, String asterisks) {
        String replaceKey = "";
        for (int i = 0; i <= length - 1 ; i++) {
            replaceKey += asterisks;
        }
        return replaceKey;
    }
}
