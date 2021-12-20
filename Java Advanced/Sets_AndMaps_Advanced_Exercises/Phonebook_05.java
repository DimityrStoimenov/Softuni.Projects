import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, String> phones = new LinkedHashMap<>();
        String input = scan.nextLine();
        while (!input.equals("search")) {
            String user = input.split("-")[0];
            String phoneNumber = input.split("-")[1];
            if(!phones.containsKey(user)) {
                phones.put(user,phoneNumber);
            } else {
                phones.put(user,phoneNumber);
            }
            input = scan.nextLine();
        }
        input = scan.nextLine();
        while(!input.equals("stop")) {
            String user = input;
            if(phones.containsKey(user)) {
                System.out.printf("%s -> %s%n", user, phones.get(user));
            } else {
                System.out.printf("Contact %s does not exist.%n", user);
            }
            input = scan.nextLine();
        }
    }
}
