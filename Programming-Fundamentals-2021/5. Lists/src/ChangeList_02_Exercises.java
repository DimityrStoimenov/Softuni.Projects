import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scan.nextLine();
        while (!input.equals("end")) {
            String [] tokens = input.split("\\s+");
            if(tokens[0].equals("Delete")) {
                int numberForComparison = Integer.parseInt(tokens[1]);
                if(list.contains(numberForComparison)) {
                    while (list.contains(numberForComparison)) {
                        list.remove(Integer.valueOf(numberForComparison));
                    }
                }

            } else if (tokens[0].equals("Insert")) {
                int element = Integer.parseInt(tokens[1]);
                int index = Integer.parseInt(tokens[2]);
                if (index >= 0 && index <= list.size() - 1) {
                   list.add(index,element);
                } else {
                    list.add(element);
                }

            }
            input = scan.nextLine();
        }
        for (int i = 0; i <= list.size() - 1 ; i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}
