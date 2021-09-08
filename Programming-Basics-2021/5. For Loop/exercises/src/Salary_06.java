import java.util.Scanner;

public class Salary_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= Integer.parseInt(scan.nextLine());
        int salary= Integer.parseInt(scan.nextLine());

        boolean isFired= false;
        for (int i = 0; i <n; i++) {
            String command= scan.nextLine();
            switch (command) {
                case "Facebook" -> salary -= 150;
                case "Instagram" -> salary -= 100;
                case "Reddit" -> salary -= 50;
            }
            if(salary<=0) {
                isFired= true;
                break;
            }



        }
        if(isFired) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.printf("%d", salary);
        }
    }
}
