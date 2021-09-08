import java.util.Scanner;

public class LettersCombinations_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char startIndex= scan.next().charAt(0);
        char lastIndex= scan.next().charAt(0);
        char character= scan.next().charAt(0);
        int count=0;
        for (char i = startIndex; i <= lastIndex; i++) {
            for (char j = startIndex; j <=lastIndex ; j++) {
                for (char k = startIndex; k <=lastIndex; k++) {
                    if( i != character&& j!= character&& k!= character) {
                        System.out.printf("%c%c%c%n",i,j,k);
                        count++;
                    }

                }

            }

        }
        System.out.printf("%d", count);
    }
}
