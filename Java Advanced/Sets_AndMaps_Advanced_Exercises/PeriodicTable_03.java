import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class PeriodicTable_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeSet<String> chemicalElements = new TreeSet<>();
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {

            String input = scan.nextLine();

            String[] inputChemicalElements = input.split("\\s+");

            chemicalElements.addAll(Arrays.asList(inputChemicalElements));
        }

        System.out.println(String.join(" ",chemicalElements));
    }
}

