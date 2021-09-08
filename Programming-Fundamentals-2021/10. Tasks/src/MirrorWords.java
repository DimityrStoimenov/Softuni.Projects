import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        List<String> mirrorWords = new ArrayList<>();
        String regex = "(?<separator>[#@])(?<word>[A-Za-z]{3,})\\1\\1(?<reverseWord>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int validWordCounter = 0;
        while (matcher.find()) {
            StringBuilder builder = new StringBuilder();
            StringBuilder build = new StringBuilder();
            String word = matcher.group("word");
            String reverseWord = matcher.group("reverseWord");
            builder.append(word).reverse();
            if (builder.toString().equals(reverseWord)) {
               build.append(word).append(" <=> ").append(reverseWord);
               mirrorWords.add(build.toString());
            }
            validWordCounter++;
        }
        if (mirrorWords.size() == 0 && validWordCounter > 0) {
            System.out.printf("%d word pairs found!%n", validWordCounter);
            System.out.println("No mirror words!");
        } else if (mirrorWords.size() > 0 && validWordCounter > 0) {
            System.out.printf("%d word pairs found!%n", validWordCounter);
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", mirrorWords));
        } else if (mirrorWords.size() == 0 && validWordCounter == 0) {
            System.out.println("No word pairs found!");
            System.out.println("No mirror words!");
        }
    }
}
