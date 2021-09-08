import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WinningTicket_01_MoreExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] tickets =  scan.nextLine().trim().split("\\s*,\\s*");
        String regex = "(?=.{20}).*?(?=(?<ch>[@#$^]))(?<match>\\k<ch>{6,}).*(?<=.{10})\\k<match>.*";
        Pattern pattern = Pattern.compile(regex);
        for (String ticket : tickets) {
            if (ticket.length() != 20) {
                System.out.println("invalid ticket");
            } else {
                Matcher matcher = pattern.matcher(ticket);
                if (matcher.matches()){
                String winTicket = matcher.group("match");
                System.out.printf("ticket \"%s\" - %d%s%s%n",
                        ticket, winTicket.length(), winTicket.charAt(0),
                        (winTicket.length() == 10) ? " Jackpot!" : "");
                } else {
                    System.out.printf("ticket \"%s\" - no match%n", ticket);
                }
            }
        }
    }
}
