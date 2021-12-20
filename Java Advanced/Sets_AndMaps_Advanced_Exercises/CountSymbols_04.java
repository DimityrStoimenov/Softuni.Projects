import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        TreeMap<Character, Integer> symbolsCounter = new TreeMap<>();
        for (int i = 0; i < text.length() ; i++) {
            char currentSymbol = text.charAt(i);
            // символът да сме го срещали
            if(!symbolsCounter.containsKey(currentSymbol)) {
                symbolsCounter.put(currentSymbol, 1);
            } else {
                int currentCount = symbolsCounter.get(currentSymbol);
                symbolsCounter.put(currentSymbol, currentCount + 1);
            }

            // сумволът не сме го срещнали
        }
        symbolsCounter.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " +
                entry.getValue() + " time/s"));
    }
}
