import java.util.Scanner;

public class BalancedBrackets_06_MoreExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
         int openingBracketsCount = 0;
         int closingBracketsCount = 0;
         boolean isBalanced = true;
        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            if(input.equals("(")) {
                openingBracketsCount++;
                if(openingBracketsCount - closingBracketsCount >= 2) {
                    isBalanced = false;
                }
            } else if(input.equals(")")) {
                closingBracketsCount++;
                if(closingBracketsCount > openingBracketsCount) {
                    isBalanced = false;
                }
            }
        }
        if(openingBracketsCount != closingBracketsCount) {
            isBalanced = false;
        }
        if(!isBalanced) {
            System.out.println("UNBALANCED");
        } else {
            System.out.println("BALANCED");
        }
    }
}
 