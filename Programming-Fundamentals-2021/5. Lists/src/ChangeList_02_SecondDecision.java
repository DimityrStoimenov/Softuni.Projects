import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02_SecondDecision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> listOfIntegers = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scan.nextLine();
        while (!input.equals("end")) {
            String [] commandData = input.split("\\s+");
            String command = commandData[0];
            if (command.equals("Delete")) {
                int element = Integer.parseInt(commandData[1]);
                //  премахва всеки един елемент от листа, който съвпада със зададения елемент
                listOfIntegers.removeAll(Collections.singleton(element));


            }else if (command.equals("Insert")) {
                int givenElement = Integer.parseInt(commandData[1]);
                int index = Integer.parseInt( commandData[2]);
                if ( index >= listOfIntegers.size() || index < 0) {
                    listOfIntegers.add(givenElement);
                } else {
                    listOfIntegers.add(index,givenElement);

                }
            }
            input = scan.nextLine();
        }
        for (int i = 0; i <= listOfIntegers.size() - 1 ; i++) {
            System.out.print(listOfIntegers.get(i));
            if ( i < listOfIntegers.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}
