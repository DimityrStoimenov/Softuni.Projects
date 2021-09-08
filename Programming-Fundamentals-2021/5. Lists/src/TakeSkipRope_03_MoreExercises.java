import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TakeSkipRope_03_MoreExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(java.lang.System.in);
        String message = scan.nextLine();
        List<String> nonNumbersList = addAllLeters(message);
        List<Integer> numbersList = addAllNumbers(message);
        List<Integer> evenIndexNumbers = new ArrayList<>();
        List<Integer> oddIndexNumbers = new ArrayList<>();
        for (int i = 0; i <= numbersList.size() - 1; i++) {
            if (i % 2 == 0) {
                evenIndexNumbers.add(numbersList.get(i));
            } else {
                oddIndexNumbers.add(numbersList.get(i));
            }
        }
        List<String> decodeMessage = new ArrayList<>();
        while (!nonNumbersList.isEmpty()) {
            decodeMessage = addAllElementsWithEvenLength(decodeMessage,nonNumbersList,evenIndexNumbers.get(0));
            nonNumbersList = removeTakeAndSkipElements(nonNumbersList,evenIndexNumbers,oddIndexNumbers);
            evenIndexNumbers.remove(0);
            oddIndexNumbers.remove(0);
            if (evenIndexNumbers.isEmpty()) {
                break;
            }
        }
        if(!decodeMessage.isEmpty()) {
            if(decodeMessage.get(decodeMessage.size() - 1).equals(" ")) {
            decodeMessage.remove(decodeMessage.size() - 1);
            }
        }
        System.out.println(String.join("",decodeMessage));

    }


    private static List<String> addAllLeters(String message) {
        List<String> listOfLetters = new ArrayList<>();
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) >= 48 && message.charAt(i) <= 57) {
                continue;
            } else {
                listOfLetters.add(String.valueOf(message.charAt(i)));
            }
        }
        return listOfLetters;
    }

    private static List<Integer> addAllNumbers(String message) {
        List<Integer> listOfIntegers = new ArrayList<>();
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) >= 48 && message.charAt(i) <= 57) {
                listOfIntegers.add(Character.getNumericValue(message.charAt(i)));
            }
        }
        return listOfIntegers;
    }
    private static List<String> addAllElementsWithEvenLength(List<String> decodeMessage, List<String> nonNumbersList,
                                                             Integer numbersLength) {
        int index = 0;
        for (int i = 1; i <= numbersLength ; i++) {
            if (!nonNumbersList.isEmpty() && i <= nonNumbersList.size()) {
                decodeMessage.add(nonNumbersList.get(index++));
            }


        }
        return decodeMessage;
    }
    private static List<String> removeTakeAndSkipElements(List<String> nonNumbersList, List<Integer> evenIndexNumbers,
                                                          List<Integer> oddIndexNumbers) {
        for (int i = 0; i < evenIndexNumbers.get(0); i++) {
            if (!nonNumbersList.isEmpty()) {
                nonNumbersList.remove(0);
            }

        }
        for (int i = 0; i < oddIndexNumbers.get(0) ; i++) {
            if (!nonNumbersList.isEmpty()) {
                nonNumbersList.remove(0);
            }

        }
        return nonNumbersList;
    }

}
