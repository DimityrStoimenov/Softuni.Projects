import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName_01_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String regex = "\\b(?<name>\\b[A-Z][a-z]+) (?<family>[A-Z][a-z]+)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
           String name = matcher.group("name");
           String family = matcher.group("family");
            System.out.printf("%s %s ", name,family);

        }
    }
}
