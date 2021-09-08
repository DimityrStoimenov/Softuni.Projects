import java.util.Arrays;
import java.util.Scanner;

public class TreasureFinder_03_MoreExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] key = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String input = scan.nextLine();
        StringBuilder builder = new StringBuilder();
        int decrypted;
        char decryptedChar = ' ';
        int counter = 0;
        boolean isEndText = false;
        while (!input.equals("find")) {
            String text = input;
            for (int i = 0; i <= key.length - 1; i++) {
                int digit = key[i];
                for (int j = counter; j <= text.length() - 1; j++) {
                    char currentChar = text.charAt(j);
                    if ( j == text.length() - 1) {
                        decrypted = (int) currentChar - digit;
                        decryptedChar = (char) decrypted;
                        builder.append(decryptedChar);
                        isEndText = true;
                        break;
                    }
                    if (i < key.length - 1) {
                        decrypted = (int) currentChar - digit;
                        decryptedChar = (char) decrypted;
                        builder.append(decryptedChar);
                        counter++;
                        break;
                    } else if (i == key.length - 1) {
                        decrypted = (int) currentChar - digit;
                        decryptedChar = (char) decrypted;
                        i = -1;
                        counter++;
                        builder.append(decryptedChar);
                        break;
                    }

                }
                if (isEndText) {
                    int leftBoundOfTreasureType = builder.indexOf("&");
                    int  rightBoundOfTreasureType = builder.lastIndexOf("&");
                    String treasureType = builder.substring(leftBoundOfTreasureType + 1, rightBoundOfTreasureType);
                    int leftBoundOfCoordinates = builder.indexOf("<");
                    int rightBoundOfCoordinates = builder.indexOf(">");
                    String coordinates = builder.substring(leftBoundOfCoordinates + 1, rightBoundOfCoordinates);
                    System.out.printf("Found %s at %s%n", treasureType,coordinates);
                    isEndText = true;
                    break;
                }

            }
             builder.setLength(0);
            counter = 0;
            isEndText = false;
            input = scan.nextLine();

        }
    }
}
