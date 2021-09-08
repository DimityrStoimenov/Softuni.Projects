import java.util.Scanner;

public class SumOfChars_04_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfLines = Integer.parseInt(scan.nextLine());
        int sum = 0;
        for (int i = 0; i < numberOfLines ; i++) {
            char currentChar = scan.nextLine().charAt(0);
                sum +=  currentChar;

        }
        System.out.printf("The sum equals: %d", sum);
    }
}
