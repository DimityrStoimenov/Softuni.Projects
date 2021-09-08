import java.util.Scanner;

public class ExtractPersonInformation_01_MoreExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n ; i++) {
            String text = scan.nextLine();
            int leftBoundToName = text.indexOf(64);
            int rightBoundToName = text.indexOf(124);
            String extractName = text.substring(leftBoundToName + 1, rightBoundToName);
            int leftBoundToAge = text.indexOf(35);
            int rightBoundToAge = text.indexOf(42);
            String extractAge = text.substring(leftBoundToAge + 1, rightBoundToAge);
            int age = Integer.parseInt(extractAge);
            System.out.printf("%s is %d years old.%n", extractName, age);
        }
    }
}
