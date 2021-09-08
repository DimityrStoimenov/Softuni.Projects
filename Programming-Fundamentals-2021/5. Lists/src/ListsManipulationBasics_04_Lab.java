import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListsManipulationBasics_04_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> listOfIntegers = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scan.nextLine();
        while (!input.equals("end")) {
            String [] tokens = input. split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "Add":
                    int number = Integer.parseInt(tokens[1]);
                    listOfIntegers.add(number);
                    break;
                case "Remove":
                    int element = Integer.parseInt(tokens[1]);
                    listOfIntegers.remove((Integer) element);
                    break;
                case "RemoveAt":
                    int index = Integer.parseInt(tokens[1]);
                    listOfIntegers.remove(listOfIntegers.get(index));
                    break;
                case "Insert":
                    int digit = Integer.parseInt(tokens[1]);
                    int indexOfList = Integer.parseInt(tokens[2]);
                    listOfIntegers.add(indexOfList,digit);
                    break;
            }
            input = scan.nextLine();
        }
        for (Integer listOfInteger : listOfIntegers) {
            System.out.print(listOfInteger + " ");
        }
    }
}
