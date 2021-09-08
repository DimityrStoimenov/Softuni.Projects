import java.util.Scanner;

public class ZigZagArrays_03_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfArrays = Integer.parseInt(scan.nextLine());
        String [] arrayOne = new String[numberOfArrays];
        String [] arrayTwo = new String[numberOfArrays];
        for (int i = 0; i < numberOfArrays ; i++) {
            String [] array = scan.nextLine().split("\\s+");
            String elementOne = array[0];
            String elementTwo = array[1];
            if ( i % 2 == 0) {
                arrayOne[i] = elementOne;
                arrayTwo[i] = elementTwo;
            } else {
                arrayOne[i] = elementTwo;
                arrayTwo[i] = elementOne;
            }

        }
        for (String one : arrayOne) {
            System.out.print(one + " ");
        }
        System.out.println();
        for (String two : arrayTwo) {
            System.out.print(two + " ");
        }
    }
}
