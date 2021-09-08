import java.util.Scanner;

public class HighJump_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int desiredHeightOfBar = Integer.parseInt(scan.nextLine());
        int one = 0;
        int lastheightOvercome = 0;
        int unsuccessfulShots=0;
        int shot = 0;

        for (int i = desiredHeightOfBar - 30; i <= desiredHeightOfBar; ) {
            int jump = Integer.parseInt(scan.nextLine());
            shot++;

            if(i >= jump) {
                unsuccessfulShots++;
            }
            if (jump > i) {
                i += 5;
                unsuccessfulShots = 0;
            }
            if( unsuccessfulShots ==3) {
                System.out.printf("Tihomir failed at %dcm after %d jumps.", i, shot);
                return;
            }
        }

            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", desiredHeightOfBar, shot);

    }
}
