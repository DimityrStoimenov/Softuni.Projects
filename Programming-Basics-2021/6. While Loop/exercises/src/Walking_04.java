import java.util.Scanner;

public class Walking_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int walkingDistance = 10000;
        int countDistance = 0;
        int difference=0;
        while ((countDistance < walkingDistance) && (!input. equals("Going home"))) {
            int steps= Integer.parseInt(input);
            countDistance+=steps;
            if(countDistance>= walkingDistance) {
                System.out.println("Goal reached! Good job!");
                break;
            }
            input= scan.nextLine();
        }
        if(input.equals("Going home")) {
            int anotherStep= Integer.parseInt(scan.nextLine());
            if(countDistance + anotherStep>= walkingDistance) {
                System.out.println("Goal reached! Good job!");
            } else {
                difference= walkingDistance - countDistance - anotherStep;
                System.out.printf("%d more steps to reach goal.", difference);
            }
        }
    }
}
