import java.util.Scanner;

public class FootballLeague_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int capacity= Integer.parseInt(scan.nextLine());
        int numberOfFens= Integer.parseInt(scan.nextLine());
        int countA= 0;
        int countB= 0;
        int countV= 0;
        int countG=0;
        int count=0;
        double fA=0;
        double fB=0;
        double fV =0;
        double fG=0;


        for (int i = 0; i <numberOfFens; i++) {
            String sector = scan.nextLine();
            switch(sector) {
                case "A":
                    countA++;
                    break;
                case "B":
                    countB++;
                    break;
                case "V":
                    countV++;
                    break;
                case "G":
                    countG++;
                    break;
            }
            count++;

        }
        fA = (countA *1.0 /count) *100;
        fB= (countB *1.0 /count) * 100;
        fV=(countV *1.0 /count) *100;
        fG= (countG * 1.0 / count) *100;
        double allFens = (count * 1.0 /capacity)*100;
        System.out.printf("%.2f%%%n",fA);
        System.out.printf("%.2f%%%n",fB);
        System.out.printf("%.2f%%%n",fV);
        System.out.printf("%.2f%%%n",fG);
        System.out.printf("%.2f%%",allFens);
    }
}
