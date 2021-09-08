
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome_03_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String databaseOfProducts = "%(?<participant>[A-Z][a-z]+)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|" +
                "(?<count>\\d+)\\|[^|$%.]*?(?<prize>\\d+\\.?\\d+)\\$";
        double income;
        double totalIncome = 0;
        String input = scan.nextLine();
        while (!input.equals("end of shift")) {
            String currentText = input;
            Pattern pattern = Pattern.compile(databaseOfProducts);
            Matcher matcher = pattern.matcher(currentText);
            if (matcher.find()) {
                String participant = matcher.group("participant");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double prize = Double.parseDouble(matcher.group("prize"));
                income = count * prize;
               totalIncome += income;
               System.out.printf("%s: %s - %.2f%n", participant,product,income);
            }
            input = scan.nextLine();
        }
        System.out.printf("Total income: %.2f", totalIncome);

    }
}
