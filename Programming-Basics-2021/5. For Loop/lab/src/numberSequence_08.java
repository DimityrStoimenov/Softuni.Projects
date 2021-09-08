import java.util.Scanner;

public class numberSequence_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= Integer.parseInt(scan.nextLine());
        int max= Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <=n ; i++) {
            int number= Integer.parseInt(scan.nextLine());
            if(number > max) {
                max=number;
            }
            if(number<min) {
                min=number;
            }

        }
        System.out.println("Max number: "+ max);
        System.out.println("Min number: "+ min);
    }
}
