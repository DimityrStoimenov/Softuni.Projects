import java.util.LinkedHashMap;
import java.util.Scanner;

public class FixEmails_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String,String> emailsData = new LinkedHashMap<>();
        String name = scan.nextLine();
        while (!name.equals("stop")) {
            String email = scan.nextLine();
            if((!email.endsWith("us")) &&(!email.endsWith("uk")) && (!email.endsWith("com"))) {
               emailsData.put(name, email);
            }
            name = scan.nextLine();
        }
        emailsData.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
