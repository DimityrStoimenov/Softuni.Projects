import java.util.Scanner;

public class Login_SecondDecision_05_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // username
        //1. намираме паролата -> username на обратно
        String username = scan.nextLine();
        String password = "";
        for (int position = username.length() -1; position >= 0 ; position --) {
            // за всяка една позиция ( от послената към първата), взимам символа на текущата позиция
            //и след това го добавям към password
            char currentSymbol =username.charAt(position);
            // добавяме към паролата
            password += currentSymbol;
        }
        // повтаряме: въвеждаме паролата
        // спираме, когато въведената парола =  обърнатата парола
        // продължаваме докато паролата е различна от обърнатата парола
        String enteredPassword = scan.nextLine();
        int countFailedPasswordAttempts = 0;
        while (!enteredPassword.equals(password)) {
            countFailedPasswordAttempts++;
            if(countFailedPasswordAttempts >= 4) {
                System.out.printf("User %s blocked!",username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            enteredPassword = scan.nextLine();
        }
        // въведената парола е равна на търсената
        if (enteredPassword.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }
            
    }

}
