import java.util.Scanner;

public class ActivationKeys_SecondDecision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String key = scan.nextLine();
        String input = scan.nextLine();
        while (!input.equals("Generate")) {
            String [] tokens = input.split(">>>");
            String command = tokens[0];
            switch(command) {
                case "Contains":
                    String substring = tokens[1];
                    if (key.contains(substring)) {
                        System.out.printf("%s contains %s%n", key, substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    int startIndex = Integer.parseInt(tokens[2]);
                    int endIndex = Integer.parseInt(tokens[3]);
                    StringBuilder builder = new StringBuilder(key);
                    String keySubstring = key.substring(startIndex,endIndex);
                    if (tokens[1].equals("Upper")) {
                        keySubstring = keySubstring.toUpperCase();
                        builder.replace(startIndex,endIndex,keySubstring);
                    } else if (tokens[1].equals("Lower")) {
                        keySubstring = keySubstring.toLowerCase();
                        builder.replace(startIndex,endIndex,keySubstring);
                    }
                    key = builder.toString();
                    System.out.println(key);
                    break;
                case "Slice":
                    int begin = Integer.parseInt(tokens[1]);
                    int end = Integer.parseInt(tokens[2]);
                    StringBuilder build = new StringBuilder(key);
                    build.delete(begin,end);
                    key = build.toString();
                    System.out.println(key);
                    break;
            }
            input = scan.nextLine();
        }
        System.out.printf("Your activation key is: %s",key);
    }
}
