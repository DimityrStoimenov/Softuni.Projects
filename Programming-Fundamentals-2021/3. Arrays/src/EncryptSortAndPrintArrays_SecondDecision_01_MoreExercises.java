
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class EncryptSortAndPrintArrays_SecondDecision_01_MoreExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int multiplier;
        int divider;
        int sum;
        Map<String,Integer> users = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String name = scan.nextLine();
            sum = 0;
            for (int j = 0; j < name.length() ; j++) {
                char currentChar = name.charAt(j);
                if(currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o'
                || currentChar == 'u' || currentChar == 'A' || currentChar == 'E' || currentChar == 'I'
                        || currentChar == 'O' || currentChar == 'U') {
                    multiplier = (int) currentChar * name.length();
                    sum += multiplier;
                } else {
                    divider = (int) currentChar / name.length();
                    sum += divider;
                }
            }
            if(!users.containsKey(name)) {
                users.put(name, sum);
            }
        }
        users
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach( result -> System.out.printf("%d%n", result.getValue()));

    }
}
