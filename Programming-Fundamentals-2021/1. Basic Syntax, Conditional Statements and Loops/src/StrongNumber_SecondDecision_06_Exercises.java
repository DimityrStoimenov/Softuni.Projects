import java.util.Scanner;

public class StrongNumber_SecondDecision_06_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // цифра -> факториел -> сумиране
        int number = Integer.parseInt(scan.nextLine());
        // принтираме всички цифри на числото
        // взимаме последната цифра (делим я % 10)
        // принтираме я
        // и я махаме от числото ( \10)
        // stop когато числото = 0
        int sumFact = 0;
        int startNumber = number; // начална стойност на числото
        while ( number!= 0) {
            int lastDigit = number % 10;
            // намираме факториела на цифрата
            int factorial= 1;
           // 5! = 5*4*3*2*1;
            //Пример
            for (int n = 1; n <= lastDigit ; n++) {
                factorial=  factorial * n ;
                
            }
            sumFact += factorial;
            number = number / 10;

        }
        if(sumFact == startNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
