import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManOWar_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> pirateShip = Arrays.stream(scan.nextLine().split(">")).map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> warShip = Arrays.stream(scan.nextLine().split(">")).map(Integer::parseInt)
                .collect(Collectors.toList());
        int maximumHealthCapacity = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        while (!input.equals("Retire")) {
        String [] databaseOfShip = input.split("\\s+");
        String command = databaseOfShip[0];
        switch (command) {
            case "Fire":
                int indexOfWarShip = Integer.parseInt(databaseOfShip[1]);
                if (indexOfWarShip >= 0 && indexOfWarShip <= warShip.size() - 1) {
                    int damageOfWarship = Integer.parseInt(databaseOfShip[2]);
                    int currentSectionWarShip = warShip.get(indexOfWarShip);
                    currentSectionWarShip -= damageOfWarship;
                    if (currentSectionWarShip <= 0) {
                        System.out.println("You won! The enemy ship has sunken.");
                        return;
                    } else {
                        warShip.set(indexOfWarShip,currentSectionWarShip);
                    }
                }
                break;
            case "Defend":
                int startIndex = Integer.parseInt(databaseOfShip[1]);
                int endIndex = Integer.parseInt(databaseOfShip[2]);
                boolean isValidStartIndex = validStartIndex(startIndex, pirateShip);
                boolean isValidEndIndex = validEndIndex(endIndex,pirateShip);
                if (isValidStartIndex && isValidEndIndex) {
                    int damageOfPirateShip = Integer.parseInt(databaseOfShip[3]);
                    for (int i = startIndex; i <= endIndex ; i++) {
                        int currentSectionOfPirateShip = pirateShip.get(i);
                        currentSectionOfPirateShip -= damageOfPirateShip;
                        if (currentSectionOfPirateShip <= 0) {
                            System.out.println("You lost! The pirate ship has sunken.");
                            return;
                        } else {
                            pirateShip.set(i, currentSectionOfPirateShip);
                        }
                    }
                }
                break;
            case "Repair":
                int indexOfPirateShipSection = Integer.parseInt(databaseOfShip[1]);
                if (indexOfPirateShipSection >= 0 && indexOfPirateShipSection <= pirateShip.size() - 1) {
                    int healthOfPirateShipSection = Integer.parseInt(databaseOfShip[2]);
                    int healthOfCurrentPirateShipSection= pirateShip.get(indexOfPirateShipSection);
                    if (healthOfCurrentPirateShipSection + healthOfPirateShipSection > maximumHealthCapacity) {
                        healthOfCurrentPirateShipSection = maximumHealthCapacity;
                        pirateShip.set(indexOfPirateShipSection,healthOfCurrentPirateShipSection);
                    } else {
                        pirateShip.set(indexOfPirateShipSection, healthOfCurrentPirateShipSection +healthOfPirateShipSection);
                    }
                }
                break;
            case "Status":
                int countOfRepairSections = 0;
                double repairSection = maximumHealthCapacity * 0.2;
                for (Integer section : pirateShip) {
                    if(section < repairSection) {
                       countOfRepairSections++;
                    }
                }
                System.out.printf("%d sections need repair.%n", countOfRepairSections);

                break;
        }
            input = scan.nextLine();
        }
        int valueOfAllPirateShipSections = 0;
        for (Integer pirateShipSection : pirateShip) {
            valueOfAllPirateShipSections += pirateShipSection;
        }
        System.out.printf("Pirate ship status: %d%n", valueOfAllPirateShipSections);
        int valueOfAllWarShipSections = 0;
        for (Integer warShipSection : warShip) {
           valueOfAllWarShipSections += warShipSection;
        }
        System.out.printf("Warship status: %d", valueOfAllWarShipSections);
    }
    private static boolean validStartIndex(int startIndex, List<Integer> pirateShip) {
        return startIndex >= 0&& startIndex <= pirateShip.size() - 1;
    }
    private static boolean validEndIndex(int endIndex, List<Integer> pirateShip) {
        return endIndex >= 0 && endIndex <= pirateShip.size() - 1;
    }
}
