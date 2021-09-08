import java.util.Scanner;

public class GreaterOfTwoValues_09_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        switch(input) {
            case "int":
                int numberOne = Integer.parseInt(scan.nextLine());
                int numberTwo = Integer.parseInt(scan.nextLine());
                int maxOfIntegers = getMax(numberOne,numberTwo);
                System.out.print(maxOfIntegers);
                break;
            case "char":
                char firstChar = scan.nextLine().charAt(0);
                char secondChar = scan.nextLine().charAt(0);
                int maxOfChars = getMaxChars(firstChar, secondChar);
                System.out.print((char)maxOfChars);
                break;
            case "string":
                String name1 = scan.nextLine();
                String name2 = scan.nextLine();
               String stringMax = getMaxStrings(name1,name2);
                System.out.print(stringMax);
                break;
        }
    }

    private static String getMaxStrings(String name1, String name2) {
        if(name1.compareTo(name2) >= 0) {
            return name1;
        } else {
            return name2;
        }
    }

    private static int getMaxChars(int x, int y) {
         return Math.max(x, y);
    }

    private static int getMax(int a, int b) {
        return Math.max(a,b);
    }

}
