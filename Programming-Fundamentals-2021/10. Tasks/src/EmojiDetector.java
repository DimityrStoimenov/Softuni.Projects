import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String regexOfDigits = "\\d";
        String regexOfEmojis = "(\\*{2}|:{2})([A-Z][a-z]{2,})\\1";
        int coolThreshold = 1;
        List<String> emojis = new ArrayList<>();
        int counterOfEmojis = 0;
        Pattern patternOfDigits = Pattern.compile(regexOfDigits);
        Matcher matcherOfDigits = patternOfDigits.matcher(text);
        while (matcherOfDigits.find()) {
            int currentDigit = Integer.parseInt(matcherOfDigits.group());
            coolThreshold *= currentDigit;
        }
        Pattern patternOfEmojis = Pattern.compile(regexOfEmojis);
        Matcher matcherOfEmojis = patternOfEmojis.matcher(text);
        while (matcherOfEmojis.find()) {
            String emoji = matcherOfEmojis.group();
            emojis.add(emoji);
            counterOfEmojis++;
        }
        List <String> coolEmojis = new ArrayList<>();
        int sumOfChars;
        for (int i = 0; i <= emojis.size() - 1 ; i++) {
            sumOfChars = 0;
            String currentEmoji = emojis.get(i);
            for (int j = 0; j <= currentEmoji.length() - 1 ; j++) {
               char currentChar = currentEmoji.charAt(j);
               if(currentChar != '*' && currentChar != ':') {
                   sumOfChars +=  currentChar;
               }
            }
            if (sumOfChars >= coolThreshold) {
                coolEmojis.add(currentEmoji);
            }
        }
        System.out.printf("Cool threshold: %d%n", coolThreshold);
        System.out.printf("%d emojis found in the text. The cool ones are:%n", counterOfEmojis);
        for (int i = 0; i <= coolEmojis.size() - 1 ; i++) {
            System.out.println(coolEmojis.get(i));
        }

    }
}
