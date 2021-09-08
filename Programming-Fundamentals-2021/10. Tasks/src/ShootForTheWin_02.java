import java.util.Arrays;
import java.util.Scanner;

public class ShootForTheWin_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] targets = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt)
                .toArray();
        int countOfTargets = 0;
        String input = scan.nextLine();
        while (!input.equals("End")) {
            int index = Integer.parseInt(input);
             if ( index >= 0 && index <= targets.length - 1) {
                 for (int i = 0; i <= targets.length - 1; i++) {
                     if (targets[i] == -1)  {
                         continue;
                     }
                     if(i == index) {
                         continue;
                     }
                     if(targets[index] >= targets[i]) {
                       targets[i] += targets[index];
                     } else if (targets[i] > targets[index]) {
                         targets[i] -= targets[index];
                     }

                 }
                 countOfTargets++;
                 targets[index] = -1;
             }
            input = scan.nextLine();
        }
        StringBuilder build = new StringBuilder();
        for (int i = 0; i <= targets.length - 1 ; i++) {
            build.append(targets[i]);
            if (i < targets.length - 1) {
                build.append(" ");
            }

        }
        System.out.printf("Shot targets: %d -> %s", countOfTargets,build);

    }
}
