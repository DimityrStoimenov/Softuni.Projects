import java.util.Scanner;

public class Division_SecondDecision_02_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        int divider = 0; // делител
        if(number % 10 == 0) {
            divider = 10;
        } else if(number % 7 == 0) {
            divider = 7;
        } else if (number % 6 == 0) {
            divider = 6;
        } else if (number % 3 == 0){
            divider = 3;
        } else if (number % 2 == 0) {
            divider = 2;
        }
        // ако нямаме делител(делителят е равен на нула)
        if ( divider == 0) {
            System.out.println("Not divisible");
        } else { // когато делителя е различен от нула
            System.out.println("The number is divisible by " + divider);
        }
    }
}
