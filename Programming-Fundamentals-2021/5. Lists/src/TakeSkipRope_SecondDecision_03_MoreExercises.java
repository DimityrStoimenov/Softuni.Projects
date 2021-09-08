import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TakeSkipRope_SecondDecision_03_MoreExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        List<Character> numbers = new ArrayList<>();
        List<Character> letters = new ArrayList<>();
        for (int i = 0; i < message.length() ; i++) {
            if(message.charAt(i) >= 48 && message.charAt(i) <= 57){
                numbers.add(message.charAt(i));
            } else {
                letters.add(message.charAt(i));
            }
        }
        List<Integer> takeList = new ArrayList<>();
        List<Integer> skipList = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            int currentNumber = Character.getNumericValue(numbers.get(i));
            if (i % 2 == 0) {
                takeList.add(currentNumber);
            } else {
                skipList.add(currentNumber);
            }
        }
        String nonNumbersList = letters.toString().substring(1, 3 * letters.size() - 1).replaceAll(", ", "");
        buildNewMessage(nonNumbersList,takeList,skipList);

    }

    private static void buildNewMessage(String nonNumbersList, List<Integer> takeList, List<Integer> skipList) {
        StringBuilder newMessage = new StringBuilder();
        for (int i = 0; i < takeList.size() ; i++) {
        int currentCharacter = takeList.get(i);
            for (int j = 0; j < currentCharacter; j++) {
                if (nonNumbersList.length() == 0) {
                    break;
                }
                newMessage.append(nonNumbersList.charAt(0));
                nonNumbersList = nonNumbersList.substring(1);
            }
            for (int k = 0; k < skipList.get(i); k++) {
                if(nonNumbersList.length() == 0) {
                    break;
                }
                nonNumbersList = nonNumbersList.substring(1);
            }
        }
        System.out.println(newMessage);
    }

}
