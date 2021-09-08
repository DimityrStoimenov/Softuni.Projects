import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String decryptedText = scan.nextLine();
        String input = scan.nextLine();
        while (!input.equals("Finish")) {
            String [] tokens = input.split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "Replace":
                    String currentChar = tokens[1];
                    String replaceChar = tokens[2];
                    decryptedText = decryptedText.replace(currentChar,replaceChar);
                    System.out.println(decryptedText);
                    break;
                case "Cut":
                    StringBuilder build = new StringBuilder(decryptedText);
                    int startIndex = Integer.parseInt(tokens[1]);
                    int endIndex = Integer.parseInt(tokens[2]);
                   boolean isValidStartIndex = startIndexISValid(startIndex, decryptedText);
                   boolean isValidEndIndex = endIndexIsValid(endIndex, decryptedText);
                   if(isValidStartIndex && isValidEndIndex) {
                       build.delete(startIndex, endIndex + 1);
                       decryptedText = build.toString();
                       System.out.println(decryptedText);

                   } else {
                       System.out.println("Invalid indices!");
                   }
                    break;
                case "Make":
                    StringBuilder builder = new StringBuilder();
                    if(tokens[1].equals("Upper")) {
                        for (int i = 0; i <= decryptedText.length() - 1 ; i++) {
                            builder.append(decryptedText.toUpperCase().charAt(i));

                        }
                        decryptedText = builder.toString();
                        System.out.println(decryptedText);
                    } else if (tokens[1]. equals("Lower")) {
                        for (int i = 0; i <= decryptedText.length() - 1 ; i++) {
                            builder.append(decryptedText.toLowerCase().charAt(i));

                        }
                        decryptedText = builder.toString();
                        System.out.println(decryptedText);
                    }
                    break;
                case "Check":
                    String substring = tokens[1];
                    if (decryptedText.contains(substring)) {
                        System.out.printf("Message contains %s%n", substring);
                    } else {
                        System.out.printf("Message doesn't contain %s%n", substring);
                    }
                    break;
                case "Sum":
                    int beginIndex = Integer.parseInt(tokens[1]);
                    int end = Integer.parseInt(tokens[2]);
                    if(startIndexISValid(beginIndex, decryptedText) && endIndexIsValid(end, decryptedText)) {
                        String substringOfIndexes = decryptedText.substring(beginIndex, end + 1);
                        int sum = 0;
                        for (int i = 0; i <= substringOfIndexes.length() -1 ; i++) {
                          char value =  substringOfIndexes.charAt(i);
                          sum +=  value;
                        }
                        System.out.println(sum);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;
            }
            input = scan.nextLine();
        }
    }

    private static boolean endIndexIsValid(int index, String text) {
      return index >= 0 && index <= text.length() - 1;
    }

    private static boolean startIndexISValid(int index, String text) {
        return index >= 0 && index <= text.length() - 1;
    }
}
