import java.util.Scanner;

public class ValidUsernames_01_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String[] dataBaseOfUserNames = text.split(", ");
        StringBuilder build = new StringBuilder();
        boolean isUserName = true;
        for (int i = 0; i <= dataBaseOfUserNames.length - 1; i++) {
            build.setLength(0);
            String currentUserName = dataBaseOfUserNames[i];
            if (currentUserName.length() >= 3 && currentUserName.length() <= 16) {
                for (int j = 0; j <= currentUserName.length() - 1; j++) {
                    char currentChar = currentUserName.charAt(j);
                    if (Character.isLetter(currentChar)) {
                        build.append(currentChar);
                    } else if (Character.isDigit(currentChar)) {
                        build.append(currentChar);
                    } else if (currentChar == '-') {
                        build.append(currentChar);
                    } else if (currentChar == '_') {
                        build.append(currentChar);
                    } else {
                        isUserName = false;
                        break;
                    }

                }
                if (isUserName) {
                    System.out.println(build);
                }
            }
            isUserName = true;
        }
    }
}



