import java.util.Scanner;

public class NymberPyramid_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int currentNumber = 1; // в този брояч пазим колко числа сме отпечатали до момента (кое е текущото число)
        boolean isBigger = false; // булева която ще ни помогне да направим проверката
        // if(currentNumber>n) и да прекъснем двата цикъла
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                if(currentNumber>n) { //  тази проверка е за да излезем от външния цикъл
                    isBigger=true;
                    break;
                }
                System.out.print(currentNumber + " ");  // отпечатваме числата
                currentNumber++; // броч на текущото число
            }
           if(isBigger) {
               break;
           }
            System.out.println(); // отиваме на нов ред
        }

    }
}
