import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> listOfWagons = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        while (!input.equals("end")) {
            String []tokens = input.split("\\s+");
            if (tokens[0].equals("Add")) {
                int additionalWagon = Integer.parseInt(tokens[1]);
                listOfWagons.add(additionalWagon);
            } else {
                int additionalPassengersInWagon = Integer.parseInt(tokens[0]);
                for (int i = 0; i <= listOfWagons.size() -1  ; i++) {
                    int passengersInCurrentWagon = listOfWagons.get(i);
                    if (passengersInCurrentWagon + additionalPassengersInWagon <= maxCapacity) {
                        listOfWagons.set(i,passengersInCurrentWagon+additionalPassengersInWagon);
                        break;
                    }
                }
            }
            input = scan.nextLine();
        }
        for (int i = 0; i <= listOfWagons.size() - 1 ; i++) {
            System.out.print(listOfWagons.get(i));
            if ( i < listOfWagons.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}
