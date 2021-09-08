
import java.util.Scanner;

public class ReverseArrayOfStrings_04_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] arrayList = (scan.nextLine().split("\\s+"));
        for (int i = 0; i < arrayList.length / 2 ; i++) {
            String temp = arrayList[i];
            arrayList[i] = arrayList[arrayList.length - 1 - i];
            arrayList[arrayList.length - 1 - i] = temp;

        }
        for (String arr : arrayList) {
            System.out.print(arr + " ");
        }
    }
}
