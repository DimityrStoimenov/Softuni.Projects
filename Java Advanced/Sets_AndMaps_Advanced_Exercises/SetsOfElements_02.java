import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetsOfElements_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashSet<Integer> firstSet = new LinkedHashSet<>();
        LinkedHashSet<Integer> secondSet = new LinkedHashSet<>();
        String  input = scan.nextLine();
        int countFirstSet = Integer.parseInt(input.split("\\s+")[0]);
        int countSecondSet = Integer.parseInt(input.split("\\s+")[1]);
        for (int i = 0; i < countFirstSet ; i++) {
            int number = Integer.parseInt(scan.nextLine());
            firstSet.add(number);
        }
        for (int i = 0; i < countSecondSet ; i++) {
            int number = Integer.parseInt(scan.nextLine());
            secondSet.add(number);
        }

        LinkedHashSet<Integer> duplicatedElements = new LinkedHashSet<>();
        for (Integer digit : firstSet) {
            if(secondSet.contains(digit)) {
                duplicatedElements.add(digit);
            }
        }
        // 2. с retainAll - проверява дали елементите от първия ги има във втория. В първи сет
        // остават само елементите, които се повтарят и във втория ( а другите ги премахва от първия.
        // Във втория сет си остават всички елементи, а в първия сет остават само тези, които се повтарят и
        //  във втория сет).
       // firstSet.retainAll(secondSet); Ако използваме retainAll, тогава трябва да
        // отпечатаме елементите само в първия сет.
        for (Integer duplicatedElement : duplicatedElements) {
            System.out.print(duplicatedElement + " ");
        }
    }
}
