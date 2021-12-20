import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails_SecondDecision_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, String> emails = new LinkedHashMap<>();
        String command = scan.nextLine();
        while(!command.equals("stop")) {
            String userName = command;
            String email = scan.nextLine();
            String domain = email.substring(email.indexOf('@') + 1);

            if( !domain.contains("us") && (!domain.contains("uk")) && (!domain.contains("com"))) {
              emails.put(userName, email);
           }
            command = scan.nextLine();

        }
        for (Map.Entry<String, String> entry : emails.entrySet()) {
            System.out.printf("%s -> %s%n", entry.getKey(),entry.getValue());
        }
    }
}
