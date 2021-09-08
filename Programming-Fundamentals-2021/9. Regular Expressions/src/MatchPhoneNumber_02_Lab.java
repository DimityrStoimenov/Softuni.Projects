import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber_02_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String phoneNumbers = scan.nextLine();
        String regex = "\\+359([ -])2\\1\\d{3}\\1\\d{4}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumbers);
        List<String> extractPhoneNumbers = new ArrayList<>();
        while (matcher.find()) {
            extractPhoneNumbers.add(matcher.group());
        }
        System.out.println(String.join(", ", extractPhoneNumbers));
    }
}
