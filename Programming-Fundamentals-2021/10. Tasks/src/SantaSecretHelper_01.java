import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SantaSecretHelper_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int key = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        List<String> decryptedTexts = new ArrayList<>();
        while (!input.equals("end")) {
            String text = input;
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i <= text.length() - 1 ; i++) {
               int value = text.charAt(i) - key;
               builder.append((char) value);

            }
            decryptedTexts.add(builder.toString());
            input = scan.nextLine();
        }
        List<String> goodChildren = new ArrayList<>();
        String regex = "@(?<childName>[A-Za-z]+)[^-:>!@]*!(?<childBehaviour>[GN])!";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i <= decryptedTexts.size() - 1 ; i++) {
            String text = decryptedTexts.get(i);
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                String childName = matcher.group("childName");
                String childBehaviour = matcher.group("childBehaviour");
                if (childBehaviour.equals("G")) {
                    goodChildren.add(childName);
                }
            }
        }
        for (String goodChild : goodChildren) {
            System.out.println(goodChild);
        }
    }
}
