import java.util.Scanner;

public class CommonElements_02_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] arrayOne = scan.nextLine().split("\\s+");
        String [] arrayTWo = scan.nextLine().split("\\s+");
        for (String elementTwo : arrayTWo) {
            for (String elementOne : arrayOne) {
              if( elementTwo .equals(elementOne)) {
                  System.out.print(elementTwo + " ");
              }
            }
        }
    }
}
