import java.util.Scanner;

public class EnglishNameOfTheLastDigit_02_MoreExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        int value = num % 10;
        int convert = convertLastDigitToEnglishName(value);
        switch (convert) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
        }
    }

    private static int convertLastDigitToEnglishName(int value) {
        if (value == 0) {
            return 0;
        } else if (value == 1) {
            return 1;
        } else if (value == 2) {
            return 2;
        } else if (value == 3) {
            return 3;
        } else if (value == 4) {
            return 4;
        } else if (value == 5) {
            return 5;
        } else if (value == 6) {
            return 6;
        } else if (value == 7) {
            return 7;
        } else if (value == 8) {
            return 8;
        } else {
            return 9;
        }
    }
}
