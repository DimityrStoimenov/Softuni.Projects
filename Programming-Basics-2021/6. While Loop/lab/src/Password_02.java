import java.util.Scanner;

public class Password_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       // username  неговият
        // password неговата
        //ще въвежда парола (anotherPassword, докато не въведе неговата парола(password))
        // ПОВТАРЯМЕ
        // !password.equals("username"), това е true  и докато не съвпаднат password  с anotherpassword ще се повтаря

        String username= scan.nextLine();
        String password= scan.nextLine();
        String input= scan.nextLine();

        while(!input.equals(password)) {
         input= scan.nextLine();

        }
        System.out.printf("Welcome %s!", username);
    }
}
