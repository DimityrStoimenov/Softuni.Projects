
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine(); // Hello Java
        String pattern = "[A-Za-z]+";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(text);
        String resultOne = matcher.replaceFirst("Hi");
        String resultTwo = matcher.replaceAll("Hi");
        System.out.println(resultOne);
        System.out.println(resultTwo);
        String textOfDigits = "1      2      3      4    5  6        7";
        String patternOfDigits = "\\s+";
        String [] tokens = textOfDigits.split(patternOfDigits);
        System.out.println(Arrays.toString(tokens).replaceAll("[\\[\\]]", "").replaceAll(",", "")
                .replaceAll("\\s+", " "));
    }
}
