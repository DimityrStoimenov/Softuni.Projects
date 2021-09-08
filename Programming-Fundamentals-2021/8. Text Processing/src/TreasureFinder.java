import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TreasureFinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        int[] key = Arrays.stream(text.split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String input = scan.nextLine();
        List<String> decryptedMessages = new ArrayList<>();
        int counter = -1;
        boolean isEnd = false;
        while (!input.equals("find")) {
            String cryptText = input;
            StringBuilder build = new StringBuilder();
            for (int i = 0; i < key.length; i++) {
                int currentDigit = key[i];
                counter++;
                if (counter <= cryptText.length() - 1) {
                    for (int j = counter; j <= cryptText.length() - 1; j++) {
                        char charOfCryptText = cryptText.charAt(j);
                        if (i <= key.length - 1) {
                            build.append((char) (charOfCryptText - currentDigit));
                            if (i == key.length - 1) {
                                i = -1;
                            }
                            break;
                        }
                    }
                } else {
                    break;
                }
            }
            decryptedMessages.add(build.toString());
            counter = -1;
            input = scan.nextLine();
        }
        for (int i = 0; i <= decryptedMessages.size() - 1 ; i++) {
         String currentMessage = decryptedMessages.get(i);
            int beginIndexTypeOfTreasure = currentMessage.indexOf("&");
            int endIndexOfTypeOfTreasure = currentMessage.lastIndexOf('&');
            String treasure = currentMessage.substring(beginIndexTypeOfTreasure + 1, endIndexOfTypeOfTreasure);
            int beginIndexOfCoordinate = currentMessage.indexOf("<");
            int endIndexOfCoordinate = currentMessage.indexOf('>');
            String coordinate = currentMessage.substring(beginIndexOfCoordinate + 1, endIndexOfCoordinate);
            System.out.printf("Found %s at %s%n", treasure, coordinate);
        }
    }
}
