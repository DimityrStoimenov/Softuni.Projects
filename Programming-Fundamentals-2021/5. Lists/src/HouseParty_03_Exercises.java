import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfCommands = Integer.parseInt(scan.nextLine());
        List<String> list = new ArrayList<>();
        for (int i = 0; i < numberOfCommands ; i++) {
            String [] message = scan.nextLine().split("\\s+", 2);
            String person = message[0];
            if("is going!".equals(message[1])) {
                if (!list.contains(person)) {
                  list.add(person);
                } else {
                    System.out.printf("%s is already in the list!%n", person);
                }
            } else if ("is not going!".equals(message[1])) {
                if(!list.contains(person)) {
                    System.out.printf("%s is not in the list!%n",person);
                } else {
                    list.remove(person);
                }
            }
        }
        list.stream().forEach(e -> System.out.println(e));
    }
}
