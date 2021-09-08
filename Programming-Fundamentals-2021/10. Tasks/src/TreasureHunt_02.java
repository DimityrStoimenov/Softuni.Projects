import java.util.*;
import java.util.stream.Collectors;

public class TreasureHunt_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> listOfTreasure = Arrays.stream(scan.nextLine().split("\\|")).collect(Collectors.toList());
        String input = scan.nextLine();
        while (!input.equals("Yohoho!")) {
            String [] tokens = input.split("\\s+",2);
            String command = tokens[0];
            switch (command) {
                case "Loot":
                 String [] treasure = tokens[1].split("\\s+");
                    for (int i = 0; i <= treasure.length - 1 ; i++) {
                        String currentTreasure = treasure[i];
                        if (!listOfTreasure.contains(currentTreasure)) {
                            listOfTreasure.add(0,currentTreasure);
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(tokens[1]);
                    if (index >= 0 && index <= listOfTreasure.size() - 1) {
                        String currentElement = listOfTreasure.get(index);
                        if (listOfTreasure.contains(currentElement)) {
                            listOfTreasure.remove(currentElement);
                            listOfTreasure.add(currentElement);
                        }
                    }
                    break;
                case "Steal":
                    int count = Integer.parseInt(tokens[1]);
                    List <String> stolenItems = new ArrayList<>();
                        if (listOfTreasure.size() <= count) {
                            for (int i = 0; i <= listOfTreasure.size()- 1 ; i++) {
                                System.out.print(listOfTreasure.get(i));
                                if ( i < listOfTreasure.size() - 1) {
                                    System.out.print(", ");
                                }
                            }
                            listOfTreasure.clear();
                            System.out.println();
                            break;

                        } else {
                            for (int i = 0; i < count ; i++) {
                                String currentElement = listOfTreasure.get(listOfTreasure.size() - 1);
                                stolenItems.add(currentElement);
                                listOfTreasure.remove(listOfTreasure.size() - 1);
                            }
                            Collections.reverse(stolenItems);
                            for (int i = 0; i <= stolenItems.size() - 1 ; i++) {
                                System.out.print(stolenItems.get(i));
                                if ( i < stolenItems.size() - 1) {
                                    System.out.print(", ");
                                }
                            }
                            System.out.println();
                        }
                    break;
            }
            input = scan.nextLine();
        }
        if (listOfTreasure.isEmpty()) {
            System.out.print("Failed treasure hunt.");
        } else {
            int sumOfTreasuresLength = 0;
            for (String treasure : listOfTreasure) {
              sumOfTreasuresLength += treasure.length();
            }
            double averageGain = sumOfTreasuresLength * 1.0 / listOfTreasure.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.", averageGain);
        }
    }
}
