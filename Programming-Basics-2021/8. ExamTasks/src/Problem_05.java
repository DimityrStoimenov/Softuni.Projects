import java.util.Scanner;

public class Problem_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double trunkCapacity = Double.parseDouble(scan.nextLine());
        double suitcaseCount = 0;
        int count=0;

        boolean isContinue = true;
        while (trunkCapacity>0) {
            count++;
            String command= scan.nextLine();
            if (command.equals("End")) {
                isContinue = false;
                break;
            }
            double volumeSuitcase = Double.parseDouble(command);
            if (trunkCapacity < volumeSuitcase) {
                System.out.println("No more space!");
                System.out.printf("Statistic: %.0f suitcases loaded.", suitcaseCount);
                return;
            }

            if (suitcaseCount % 3 != 0) {
                trunkCapacity -= volumeSuitcase;
            } else {
                volumeSuitcase= (volumeSuitcase+(volumeSuitcase*0.1));
                trunkCapacity-=volumeSuitcase;

            }
            suitcaseCount++;



        }

        if(!isContinue) {
            System.out.println("Congratulations! All suitcases are loaded!");
            System.out.printf("Statistic: %.0f suitcases loaded.", suitcaseCount);
        }

    }
}
