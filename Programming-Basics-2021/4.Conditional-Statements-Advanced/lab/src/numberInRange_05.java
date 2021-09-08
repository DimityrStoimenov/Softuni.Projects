import java.util.Scanner;

public class numberInRange_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        boolean isValid = (number>= -100 && number<=100 && number!=0);
        if(isValid ) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
