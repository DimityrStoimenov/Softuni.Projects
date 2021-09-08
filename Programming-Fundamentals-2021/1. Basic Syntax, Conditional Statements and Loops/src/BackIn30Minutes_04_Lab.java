import java.util.Scanner;

public class BackIn30Minutes_04_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine()) + 30;
        if(minutes > 59){
            hours ++;
            minutes -= 60;

        }  if(hours > 23) {
            hours = hours - 24;
        }
           if(minutes <= 9) {
               System.out.printf("%d:0%d", hours,minutes);
           } else {
               System.out.printf("%d:%d", hours,minutes);
           }
    }
}
