import java.util.Scanner;

public class ReadText_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // променлива input с която ще прочитаме текст от конзолата
        // ПОВТАРЯМЕ:
        // докато input не е равно на Stop, ще въвеждаме input

        //  когато input стане равно на Stop,
        //  ПРОГРАМАТА / ЦИЛЪЛЪТ/ СПИРА, защото такова е условието на задачата
        String input = scan.nextLine();
         while(!input.equals("Stop")) {
             input= scan.nextLine();
         }

    }
}
