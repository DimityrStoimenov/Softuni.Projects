import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());

        if(num1 %2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}