import java.util.Scanner;

public class Building_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfFloors = Integer.parseInt(scan.nextLine()); // брой етажи
        int numberOfRooms = Integer.parseInt(scan.nextLine());

        for (int floors = numberOfFloors; floors >= 1; floors--) {
            for (int rooms = 0; rooms < numberOfRooms; rooms++) {
                if (floors == numberOfFloors) {
                    System.out.printf("L%d%d ", floors, rooms);
                } else if (floors % 2 == 0) {
                    System.out.printf("O%d%d ", floors, rooms);
                } else {
                    System.out.printf("A%d%d ",floors,rooms);
                }
            }
            System.out.println();
        }
    }
}

