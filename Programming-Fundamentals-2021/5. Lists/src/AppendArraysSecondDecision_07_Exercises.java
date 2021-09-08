import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArraysSecondDecision_07_Exercises {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();
    List<String> listOfIntegers = Arrays.stream(input.split("\\|"))
            .collect(Collectors.toList());
        Collections.reverse(listOfIntegers);
        // listOfIntegers.toString -> "[  7 8, 4 5 6 , 1 2 3]" -> replace"["-> "  7 8, 4 5 6 , 1 2 3]"
        // -> replace "]" -> "  7 8, 4 5 6 , 1 2 3"
        // -> replace "," "   7 8 4 5 6  1 2 3" -> .trim() -> маха всички интервали в началото и края ->
        // "7 8 4 5 6  1 2 3"
        // replaceAll "\\s+" ( ако видиш повече от един интервал го замени само с един интервал)
        // -> "7 8 4 5 6 1 2 3"
        System.out.println(listOfIntegers.toString().replace("[", "").
                replace("]", "").replace(",", "").trim()
        .replaceAll("\\s+", " "));

    }
}
