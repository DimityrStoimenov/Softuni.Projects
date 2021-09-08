import java.util.Scanner;

public class LettersChangeNumbers_08_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String [] arrays = input .split("\\s+");
        double sum = 0.0;
        for (String array : arrays) {
           char firstLetter = array.charAt(0);
           char lastLetter = array.charAt(array.length() -1);
           String numberAsAString = array.substring(1, array.length() - 1);
           long number = Long.parseLong(numberAsAString);
           double result ;

           if(Character.isUpperCase(firstLetter)) {
               result = number * 1.0 / (firstLetter - 64);
           } else {
               result = number  * ( firstLetter - 96);
           }
           if(Character.isUpperCase(lastLetter)) {
               result = result - (lastLetter - 64);
           } else {
               result = result + (lastLetter - 96);
           }
           sum += result;
        }
        System.out.printf("%.2f", sum);

    }
}

