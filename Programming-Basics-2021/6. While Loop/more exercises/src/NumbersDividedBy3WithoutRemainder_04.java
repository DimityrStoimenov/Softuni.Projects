import java.util.Scanner;

public class NumbersDividedBy3WithoutRemainder_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <=100 ; i++) {
            if(i % 3 == 0) {
                System.out.println(i);
            }

        }
    }
}
