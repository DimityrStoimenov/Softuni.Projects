import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name =  scan.nextLine();
        String sport = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        String town = scan.nextLine();
        System.out.printf("My name is %s. My favorite sport is %s. I'm %d-years old person from %s", name, sport,age, town);
    }
}
