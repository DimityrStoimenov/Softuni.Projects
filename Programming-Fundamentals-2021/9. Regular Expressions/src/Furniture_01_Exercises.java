import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture_01_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> furniture = new LinkedList<>();
        String regex = ">>(?<name>[A-Za-z]+)<<(?<prize>\\d+\\.?\\d+)!(?<quantity>\\d*)";
        String input = scan.nextLine();
        double totalPrize = 0;
        while (!input.equals("Purchase")) {
            String text = input;
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                String name = matcher.group("name");
                double prize = Double.parseDouble(matcher.group("prize"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                totalPrize += prize * quantity;
                furniture.add(name);
            }
            input= scan.nextLine();
        }
      System.out.println("Bought furniture:");
        for (String s : furniture) {
            System.out.println(s);
        }
        System.out.printf("Total money spend: %.2f",totalPrize);
    }
}
