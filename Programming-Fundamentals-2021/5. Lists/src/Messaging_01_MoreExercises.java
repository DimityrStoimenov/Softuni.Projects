import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Messaging_01_MoreExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> listOfIntegers = Arrays.stream(scan.nextLine().split("\\s++")).map(Integer::parseInt)
                .collect(Collectors.toList());
        String message = scan.nextLine();
        for (int i = 0; i <= listOfIntegers.size() - 1; i++) {
            int currentElement = listOfIntegers.get(i);
            int index = CalculateElement(currentElement);
            char CurrentChar = GetCharFromMessage(index,message);
            System.out.print(CurrentChar);
            int indexForRemove = CalculateIndexForRemove(index, message);
            StringBuilder newMessage = new StringBuilder(message);
            newMessage.deleteCharAt(indexForRemove);
            message = newMessage.toString();

        }
    }

    private static int CalculateIndexForRemove(int index, String message) {
        int countIndex = 0;
        for (int i = 0; i < index ; i++) {
            countIndex++;
            if ( countIndex == message.length()) {
                countIndex = 0;
            }
        }
        return countIndex;
    }

    private static char GetCharFromMessage(int index, String message) {
        int countIndex = 0;
        for (int i = 0; i < index; i++) {
            countIndex++;
            if(countIndex == message.length()) {
                countIndex = 0;
            }
        }
        char CurrentChar = message.charAt(countIndex);
        return CurrentChar;
    }

    private static int CalculateElement(int currentElement) {
        int index = 0;
        while (currentElement > 0) {
            int digit = currentElement % 10;
            index += digit;
            currentElement = currentElement / 10;
        }
        return index;
    }


}
