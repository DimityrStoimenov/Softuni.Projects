import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> listOfIntegers = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).
                collect(Collectors.toList());
        String input = scan.nextLine();
        while (!input.equals("End")) {
            String [] tokens = input.split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "Add":
                    listOfIntegers.add(Integer.parseInt(tokens[1]));
                    break;
                case "Insert":
                    int element = Integer.parseInt(tokens[1]);
                    int index = Integer.parseInt(tokens[2]);
                    if (index >= 0 && index <= listOfIntegers.size() - 1) {
                        listOfIntegers.add(index,element);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    int indexOfList = Integer.parseInt(tokens[1]);
                    if (indexOfList >= 0 && indexOfList <= listOfIntegers.size() - 1) {
                        listOfIntegers.remove(indexOfList);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    String position = tokens[1];
                    int count = Integer.parseInt(tokens[2]);
                    if (position.equals("left")) {
                        for (int i = 0; i < count ; i++) {
                          listOfIntegers.add(listOfIntegers.get(0));
                          listOfIntegers.remove(0);
                        }
                    } else if (position.equals("right")) {
                        int counter = Integer.parseInt(tokens[2]);
                        for (int i = 0; i < counter ; i++) {
                            listOfIntegers.add(0,listOfIntegers.get(listOfIntegers.size() - 1));
                            listOfIntegers.remove(listOfIntegers.size() - 1);
                        }
                    }
            }
            input = scan.nextLine();
        }
        for (int i = 0; i <= listOfIntegers.size() - 1 ; i++) {
            System.out.print(listOfIntegers.get(i));
            if(i < listOfIntegers.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}
