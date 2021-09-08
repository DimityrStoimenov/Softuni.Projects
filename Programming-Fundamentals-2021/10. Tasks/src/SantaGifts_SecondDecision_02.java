import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SantaGifts_SecondDecision_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Integer> houseNumbers = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        int count = 0;
        for (int i = 0; i < n; i++) {
                String text = scan.nextLine();
                String[] tokens = text.split(" ");
                String command = tokens[0];
                switch (command) {
                    case "Forward":
                        int indexNumberOfForwardSteps = Integer.parseInt(tokens[1]);
                        if ( indexNumberOfForwardSteps >= 0 && indexNumberOfForwardSteps <= houseNumbers.size() - 1) {
                            count = count + indexNumberOfForwardSteps;
                            if (count <= houseNumbers.size() - 1) {
                                houseNumbers.remove(count);
                            } else {
                               count = indexNumberOfForwardSteps;

                            }

                        }
                        break;
                    case "Back":
                        int indexNumberOfBackSteps = Integer.parseInt(tokens[1]);
                        if ( indexNumberOfBackSteps >= 0 &&  indexNumberOfBackSteps <= houseNumbers.size() - 1) {
                           count = count - indexNumberOfBackSteps;
                            if ( count >=  0 ) {
                                houseNumbers.remove(count);
                            } else {
                                count = 0;

                            }


                        }
                        break;
                    case "Gift":
                        int indexOfInsert = Integer.parseInt(tokens[1]);
                        int elementToInsert = Integer.parseInt(tokens[2]);
                        if (indexOfInsert >= 0 && indexOfInsert <= houseNumbers.size() - 1) {
                            houseNumbers.add(indexOfInsert, elementToInsert);
                            count = indexOfInsert;

                        }

                        break;
                    case "Swap":
                        int indexOfFirstHouse = Integer.parseInt(tokens[1]);
                        int indexOfSecondHouse = Integer.parseInt(tokens[2]);
                        int firstIndex = houseNumbers.indexOf(indexOfFirstHouse);
                        int secondIndex = houseNumbers.indexOf(indexOfSecondHouse);
                        if ((firstIndex >= 0 && firstIndex <= houseNumbers.size() - 1) &&
                                (secondIndex >= 0 && secondIndex <= houseNumbers.size() - 1)) {
                            houseNumbers.set(firstIndex, indexOfSecondHouse);
                            houseNumbers.set(secondIndex,indexOfFirstHouse);



                        }
                        break;
                }



        }
        System.out.printf("Position: %d%n", count);
        for (int i = 0; i <= houseNumbers.size() - 1 ; i++) {
            System.out.print(houseNumbers.get(i));
            if (i < houseNumbers.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}

