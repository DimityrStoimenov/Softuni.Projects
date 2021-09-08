import java.util.Scanner;

public class OperationsBetweenNumbers_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N1 = Integer.parseInt(scan.nextLine());
        int N2 = Integer.parseInt(scan.nextLine());
        char operator = scan.nextLine().charAt(0);

        switch(operator) {
            case '+':
                int sum = N1 + N2;
                if(sum % 2 == 0) {
                    System.out.printf("%d + %d = %d - even",N1,N2,sum);
                } else {
                    System.out.printf("%d + %d = %d - odd",N1,N2,sum);
                }
                break;
            case'-':
                int result = N1 - N2;
                if(result % 2 == 0) {
                    System.out.printf("%d - %d = %d - even",N1,N2,result);
                } else {
                    System.out.printf("%d - %d = %d - odd",N1,N2,result);
                }
                break;
            case '*':
                int product = N1 * N2;
                if(product % 2 == 0) {
                    System.out.printf("%d * %d = %d - even",N1,N2,product);
                } else {
                    System.out.printf("%d * %d = %d - odd",N1,N2,product);
                }
                break;
            case '/':
                if(N2 == 0) {
                    System.out.printf("Cannot divide %d by zero",N1 );
                } else {
                    double division = N1*1.0 / N2;
                    System.out.printf("%d / %d = %.2f",N1,N2,division );
                }
                break;
            case '%':
                if(N2 == 0) {
                    System.out.printf("Cannot divide %d by zero",N1 );
                } else {
                    int module = N1 % N2;
                    System.out.printf("%d %% %d = %d",N1,N2,module );
                }
                break;
        }
    }
}
