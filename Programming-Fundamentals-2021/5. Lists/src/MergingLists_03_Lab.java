import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists_03_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> listOne = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> listTwo = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int minLength = Math.min(listOne.size(), listTwo.size());
        for (int i = 0; i < minLength ; i++) {
            System.out.print(listOne.get(i) + " ");
            System.out.print(listTwo.get(i) + " ");

        }
        if (listOne.size() > listTwo.size()) {
            printListOne(minLength, listOne);
        } else{
                printListTwo(minLength,listTwo);
            }

    }



    private static void printListOne(int startIndex, List<Integer> listOne) {
        for (int i = startIndex; i < listOne.size(); i++) {
            System.out.print(listOne.get(i) + " ");
        }
    }
    private static void printListTwo(int startIndex, List<Integer> listTwo) {
        for (int i = startIndex; i < listTwo.size() ; i++) {
            System.out.print(listTwo.get(i) + " ");
        }
    }

}
