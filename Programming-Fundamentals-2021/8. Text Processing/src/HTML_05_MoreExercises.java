import java.util.Scanner;

public class HTML_05_MoreExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String title = scan.nextLine();
        String openTagTitle = "<h1>";
        String closedTagTitle = "</h1>";
        System.out.printf("%s%n", openTagTitle);
        System.out.printf("    %s%n", title);
        System.out.printf("%s%n", closedTagTitle);
        String contentOfArticle = scan.nextLine();
        String openTagOfContent = "<article>";
        String closeTagOfContent = "</article>";
        System.out.printf("%s%n", openTagOfContent);
        System.out.printf("    %s%n", contentOfArticle);
        System.out.printf("%s%n", closeTagOfContent);
        String input = scan.nextLine();
        while (!input.equals("end of comments")) {
            String comment = input;
            String openTag = "<div>";
            String closeTag = "</div>";
            System.out.printf("%s%n", openTag);
            System.out.printf("    %s%n", comment);
            System.out.printf("%s%n", closeTag);
            input = scan.nextLine();

        }
    }
}
