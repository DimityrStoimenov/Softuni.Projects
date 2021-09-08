import java.util.Scanner;

public class TheMostPowerfulWord_06_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        double powerWord = 0;
        double result = 0;
        String theWord = "";
        while (!input.equals("End of words")) {
            powerWord = 0;
            String word = input;
            if (word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i' || word.charAt(0) == 'o'
                    || word.charAt(0) == 'u' || word.charAt(0) == 'y' || word.charAt(0) == 'A' || word.charAt(0) == 'E'
                    || word.charAt(0) == 'I' || word.charAt(0) == 'O' || word.charAt(0) == 'U' ||
                    word.charAt(0) == 'Y') {
                for (int i = 0; i < word.length(); i++) {
                    powerWord += word.charAt(i);

                }
                powerWord *= word.length();
            } else {
                powerWord = Math.floor(powerWord / word.length());
            }
            if (powerWord > result) {
                result = powerWord;
                theWord = word;
            }
            input = scan.nextLine();
        }
        System.out.printf("The most powerful word is %s - %.0f",theWord,result );
    }

}

