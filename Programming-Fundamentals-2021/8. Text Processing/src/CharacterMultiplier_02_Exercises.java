import java.util.Scanner;

public class CharacterMultiplier_02_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] arrays = input.split("\\s+");
        int multiplier = 0;
        int sum = 0;
        for (int i = 0; i < arrays.length - 1; i++) {
           String firstArray = arrays[i];
           String secondArray = arrays[ i + 1];
           if (firstArray.length() == secondArray.length()) {
               for (int j = 0; j <= firstArray.length() - 1 ; j++) {
                   char first = firstArray.charAt(j);
                   for (int k = j; k <= secondArray.length() - 1 ; k++) {
                     char second = secondArray.charAt(k);
                     multiplier = (int) first * (int) second;
                     sum += multiplier;
                     break;
                   }
               }
           } else {
              int length = Math.min(firstArray.length(), secondArray.length());
               for (int j = 0; j < length ; j++) {
                  multiplier = (int) firstArray.charAt(j) * (int) secondArray.charAt(j);
                  sum += multiplier;
               }
               if (firstArray.length() > secondArray.length()) {
                   for (int j = length; j < firstArray.length(); j++) {
                     int one =  firstArray.charAt(j);
                     sum +=  one;
                   }
               } else  {
                   for (int j = length; j < secondArray.length();  j++) {
                      int second =  secondArray.charAt(j);
                      sum += second;
                   }

               }
           }

        }
        System.out.print(sum);

    }
}

