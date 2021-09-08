import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector_SecondRegex_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String regexOfDigits = "\\d";
        String regexOfEmoji = "(\\*{2}|:{2})[A-Z][a-z]{2,}\\1";
        List<String> emojis = new ArrayList<>();
        int coolThreshold = 1;
        int emojiCounter= 0;
        int valueOfChars;
        Pattern patternOfDigits = Pattern.compile(regexOfDigits);
        Matcher matcherDigits = patternOfDigits.matcher(text);
        while (matcherDigits.find()) {
            coolThreshold *= Integer.parseInt(matcherDigits.group());
        }
        System.out.printf("Cool threshold: %d%n", coolThreshold);
        Pattern patternOfEmoji = Pattern.compile(regexOfEmoji);
        Matcher matcherOfEmoji = patternOfEmoji.matcher(text);
        while (matcherOfEmoji.find()) {
            String coolEmoji = matcherOfEmoji.group();
            emojis.add(coolEmoji);
            emojiCounter++;
        }
        System.out.printf("%d emojis found in the text. The cool ones are:%n",emojiCounter);
        for (int i = 0; i <= emojis.size() - 1 ; i++) {
            String emoji = emojis.get(i);
            valueOfChars = 0;

            for (int j = 0; j <= emoji.length() - 1 ; j++) {
              char currentChar = emoji.charAt(j);
              if (currentChar != ':' && currentChar != '*') {
                  valueOfChars +=  currentChar;
              }
            }
            if ( valueOfChars >= coolThreshold) {
                System.out.println(emoji);
            }
        }

    }
}
