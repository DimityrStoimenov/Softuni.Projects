import java.util.Scanner;

public class ReverseString_04_MoreExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        StringBuilder build = new StringBuilder(string);
        build.reverse();
        System.out.println(build);
    }
}
