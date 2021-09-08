import java.util.Scanner;

public class ReplaceRepeatingChars_DecisionDesi_06_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        StringBuilder builder = new StringBuilder();
        //1. добавяме първата буква към новия текст
        // 2. взимам всички букви
        // -> проверявам дали новата буква е различна от последната добавена в новия текст
        // ако е различна,я добавяме
        char firstLetter = text.charAt(0);
        builder.append(firstLetter);
        for (int i = 1; i < text.length(); i++) {
            char currentSymbol = text.charAt(i);
            char lastAddedSymbolInBuilder = builder.charAt(builder.length() - 1); 
            if (currentSymbol !=  lastAddedSymbolInBuilder) {
                builder.append(currentSymbol);
            }
            
        }
        System.out.println(builder);
    }
}
