import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking_05_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, String> users =new LinkedHashMap<>();
        int numberOfInputs = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < numberOfInputs ; i++) {
            String [] dataBaseOfUsers = scan.nextLine().split("\\s+");
            String command = dataBaseOfUsers[0];
            String userName = dataBaseOfUsers[1];
            if (command.equals("register")) {
                String licensePlateNumber = dataBaseOfUsers[2];
                if (!users.containsKey(userName)) {
                    users.put(userName,licensePlateNumber);
                    System.out.printf("%s registered %s successfully%n", userName,licensePlateNumber);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", licensePlateNumber);
                }
            } else if (command.equals("unregister")) {
                if (!users.containsKey(userName)) {
                    System.out.printf("ERROR: user %s not found%n", userName);
                } else {
                    users.remove(userName);
                    System.out.printf("%s unregistered successfully%n", userName);
                }
            }
        }
        for (Map.Entry<String, String> entry : users.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(),entry.getValue());
        }
    }
}
