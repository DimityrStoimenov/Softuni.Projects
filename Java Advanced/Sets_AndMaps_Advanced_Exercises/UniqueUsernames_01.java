import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueUsernames_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        LinkedHashSet<String> userNames = new LinkedHashSet<>();
        for (int i = 0; i < n ; i++) {
            String userName = scan.nextLine();
            userNames.add(userName);
        }

        userNames.forEach(System.out::println);
    }
}
