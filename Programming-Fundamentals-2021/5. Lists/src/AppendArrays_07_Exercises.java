import java.util.Scanner;

public class AppendArrays_07_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String [] arrays = input.split("\\|");
        for (int i = arrays.length - 1; i >= 0 ; i --) {
            String currentArray = arrays[i].trim();
            // да направим масив от стрингове на текущия масив
            if(currentArray.equals(" ") || currentArray.equals("")) {
                continue;
            }
            String [] numbers = currentArray.split("\\s+");
            System.out.print(String.join(" ", numbers));
            System.out.print(" ");

        }
    }
}
