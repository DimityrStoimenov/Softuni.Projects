
import java.util.*;

public class EncryptSortAndPrintArrays_01_MoreExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Integer> list = new ArrayList<>();
        int sum;
        for (int i = 0; i < n ; i++) {
            String name = scan.nextLine();
            sum = 0;
            for (int j = 0; j < name.length() ; j++) {
              char currentChar = name.charAt(j);
              if (currentChar == 'A' || currentChar == 'E' || currentChar == 'I' || currentChar == 'O'
              || currentChar == 'U' || currentChar == 'a' || currentChar == 'e' || currentChar == 'i'
                      || currentChar == 'o' || currentChar == 'u') {
                  sum += (int) currentChar * name.length();
              } else {
                  sum += (int) currentChar / name.length();
              }
            }
            list.add(sum);

        }
        Collections.sort(list);
        for (Integer element : list) {
            System.out.println(element);
        }
    }
}
