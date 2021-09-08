import java.util.Scanner;

public class Login_05_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String user = scan.nextLine();
        StringBuilder build = new StringBuilder(user);
        build.reverse();


        for (int i = 1; i <= 4; i++) {
            String password = scan.nextLine();
            if(i == 4) {
                System.out.printf("User %s blocked!", user);
                break;
            }
            if (build.toString().equals(password)) {
                System.out.printf("User %s logged in.", user);
                return;
            } else {
                System.out.println("Incorrect password. Try again.");
            }

        }

    }
}

