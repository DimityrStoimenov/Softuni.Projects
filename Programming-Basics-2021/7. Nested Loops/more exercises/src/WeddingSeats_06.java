import java.util.Scanner;

public class WeddingSeats_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        char theLastSectors = input.charAt(0);
        int numberOfRowsInFirstSector = Integer.parseInt(scan.nextLine());
        int numbersOfSeatsOfOddRow = Integer.parseInt(scan.nextLine());
        boolean isEven = false;
        int count = 0;
        for (char i = 'A'; i <= theLastSectors; i++) {
            if (i > 'A' && i <= theLastSectors) {
                numberOfRowsInFirstSector += 1;
            }
            for (int j = 1; j <= numberOfRowsInFirstSector; j++) {
                if (j % 2 == 1) {
                    for (int k = 97; k < 97 + numbersOfSeatsOfOddRow; k++) {
                        char symbol = (char) k;
                        System.out.printf("%c%d%c%n", i, j, k);
                        count+=1;
                    }
                } else if (j % 2 == 0) {
                    for (int l = 97; l < 97 + numbersOfSeatsOfOddRow+2; l++) {
                        char symbol = (char) l;
                        System.out.printf("%c%d%c%n", i, j, l);
                        count+=1;
                    }
                }

                if (i > theLastSectors) {
                    break;
                }
            }
        }
        System.out.printf("%d", count);
    }
}




