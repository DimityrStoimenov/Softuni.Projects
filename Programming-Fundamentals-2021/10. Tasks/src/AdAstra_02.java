import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String regex = "(?<separator>[#|]?)(?<itemName>[a-zA-Z\\s]+)\\1(?<expireDate>\\d{2}" +
                "/\\d{2}/\\d{2})\\1(?<calories>\\d+)\\1";
        List<DaysToSurvive> days = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int sumOfCalories = 0;
        int survivedForDays;
        while (matcher.find()) {
            String itemName = matcher.group("itemName");
            String expireDate = matcher.group("expireDate");
            int calories = Integer.parseInt(matcher.group("calories"));
            DaysToSurvive day = new DaysToSurvive(itemName, expireDate, calories);
            days.add(day);
            sumOfCalories += calories;
        }
        survivedForDays = sumOfCalories / 2000;
          if (days.size() > 0 && survivedForDays > 0)  {
            System.out.printf("You have food to last you for: %d days!%n", survivedForDays);
            days.forEach(entry -> System.out.printf("Item: %s, Best before: %s, Nutrition: %d%n",
                    entry.getItemName(), entry.getExpireDate(), entry.getCalories()));

        } else if (days.isEmpty() && survivedForDays == 0) {
        System.out.printf("You have food to last you for: %d days!%n", survivedForDays);
        }
    }
}
class DaysToSurvive {
    private String itemName;
    private String expireDate;
    private int calories;

    public String getItemName() {
        return itemName;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public int getCalories() {
        return calories;
    }

    public DaysToSurvive (String itemName, String expireDate, int calories) {
        this.itemName = itemName;
        this.expireDate= expireDate;
        this.calories= calories;

    }
}
