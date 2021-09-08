import java.util.Scanner;

public class MiddleCharacters_06_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        printMiddleCharacter (text);

    }
    private static void printMiddleCharacter(String text) {
        // дължината на текста да е нечетна
        if(text.length() % 2 != 0) {
            //изчисляваме позицията на средния символ -> text.length / 2
            int textMiddleCharacter = text.length() / 2;
            System.out.println(text.charAt(textMiddleCharacter));
        }
        // дължината на текста да е четна
        else {
            // първи елемент e на позиция -> text.length / 2 - 1
            // втори елемент на позиция -> text.length / 2
            int indexFirstMiddleCharacter = text.length() / 2 - 1;
            int indexSecondMiddleCharacter = text.length() / 2;
            System.out.printf("%c%c", text.charAt(indexFirstMiddleCharacter),text.charAt(indexSecondMiddleCharacter));
        }
    }
}
