import java.util.Scanner;

public class CharToString_06_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < 3 ; i++) {
            String currentChar = scan.nextLine();
            build.append(currentChar);
        }
        System.out.println(build);
    }
}
