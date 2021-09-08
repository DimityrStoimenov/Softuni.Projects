import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_SecondDecision_05_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String [] tokens = scan.nextLine().split("\\s+");
        int bombNumbers = Integer.parseInt(tokens[0]);
        int power = Integer.parseInt(tokens[1]);
        while (list.contains(bombNumbers)) {
            int indexOfBombNumbers = list.indexOf(bombNumbers);
            if(indexOfBombNumbers >= 0 && indexOfBombNumbers <= list.size() - 1) {
                int leftBound = Math.max(indexOfBombNumbers - power, 0);
                int rightBound = Math.min(indexOfBombNumbers + power, list.size() - 1);
                if ((leftBound >= 0 && leftBound <= list.size() - 1) && (rightBound >= 0 && rightBound <= list.size() - 1)) {
                    list.remove(indexOfBombNumbers);
                    list.subList(leftBound,rightBound).clear();
                }
            }
        }
        int sum = 0;
        for (Integer element : list) {
            sum += element;
        }
        System.out.println(sum);
    }
}
