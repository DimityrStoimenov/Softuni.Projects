import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        // Ivan, Dimitar, Petar, Georgy
        if (name.equals("Ivan")) {
            System.out.println("Hallo, Ivan");
        } else if (name.equals("Dimitar")) {
            System.out.println("Hello, Dimitar");
        } else if (name.equals("Petar")) {
            System.out.println("Hello, Petar");
        } else if (name.equals("Georgy")) {
            System.out.println("Hello, Georgy");
        }
    }
}

