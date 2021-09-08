import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] array = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt)
                .toArray();
        String input = scan.nextLine();
        while (!input.equals("end")) {
            String [] tokens = input.split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "swap":
                    int indexOne = Integer.parseInt(tokens[1]);
                    int indexTwo = Integer.parseInt(tokens[2]);
                    if ((indexOne >= 0 && indexOne <= array.length - 1) &&
                            (indexTwo >= 0 && indexTwo <= array.length -1)) {
                        int temp = array[indexOne];
                        array[indexOne] = array[indexTwo];
                        array[indexTwo] = temp;
                    }
                    break;
                case "multiply":
                    int firstIndex = Integer.parseInt(tokens[1]);
                    int secondIndex = Integer.parseInt(tokens[2]);
                    if((firstIndex >= 0 && firstIndex <= array.length - 1) &&
                            (secondIndex >= 0 && secondIndex <= array.length - 1 )) {
                       array[firstIndex] = array[firstIndex] * array[secondIndex];
                    }
                    break;
                case "decrease":
                    for (int i = 0; i <= array.length - 1 ; i++) {
                        array[i] -= 1;
                    }
                    break;
            }
            input = scan.nextLine();
        }
        for (int i = 0; i <= array.length - 1 ; i++) {
            System.out.print(array[i]);
            if ( i < array.length - 1) {
                System.out.print(", ");
            }

        }
    }
}
