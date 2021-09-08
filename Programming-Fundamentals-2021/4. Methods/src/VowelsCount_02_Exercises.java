import java.util.Scanner;

public class VowelsCount_02_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sequence = scan.nextLine();
        int vowelCount = vowelCounter(sequence);
        System.out.print(vowelCount);

    }

    private static int vowelCounter(String sequence) {
        int vowelCount = 0;
        for (int i = 0; i < sequence.length() ; i++) {
            char currentChar = sequence.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar=='u'
            || currentChar == 'A' || currentChar == 'E' || currentChar == 'I' || currentChar == 'O' || currentChar=='U') {
                vowelCount++;
            }
        }
        return vowelCount;
    }
}
