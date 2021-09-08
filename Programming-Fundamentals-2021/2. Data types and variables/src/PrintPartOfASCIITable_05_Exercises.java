import java.util.Scanner;

public class PrintPartOfASCIITable_05_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstCharIndex = Integer.parseInt(scan.nextLine());
        int lastCharIndex = Integer.parseInt(scan.nextLine());
        for (int i = firstCharIndex; i <= lastCharIndex ; i++) {
            if ( i >= 32 && i <= 127) {
                System.out.print( (char) i + " ");
            }
        }
    }
}
