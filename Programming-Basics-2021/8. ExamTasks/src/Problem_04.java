import java.util.Scanner;

public class Problem_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberGroups= Integer.parseInt(scan.nextLine());
        int MousalaCnt=0;
        int MontBlancCnt=0;
        int KilimanjaroCnt=0;
        int K2Cnt=0;
        int EverestCnt=0;
        int totalClimbing=0;
        double climbingMousala=0;
        double climbingMontBlanc=0;
        double climbingKilimanjaro=0;
        double climbingK2=0;
        double climbingEverest=0;
        for (int i = 1; i <=numberGroups; i++) {
            int numberPeopleInGroup= Integer.parseInt(scan.nextLine());
            if(numberPeopleInGroup>=1 && numberPeopleInGroup<=5) {
                MousalaCnt+= numberPeopleInGroup;
            } else if(numberPeopleInGroup>=6 && numberPeopleInGroup<=12){
                MontBlancCnt+=numberPeopleInGroup;
            } else if(numberPeopleInGroup>=13 && numberPeopleInGroup<=25) {
                KilimanjaroCnt+=numberPeopleInGroup;
            } else if(numberPeopleInGroup>=26 && numberPeopleInGroup<=40) {
                K2Cnt+=numberPeopleInGroup;
            } else if( numberPeopleInGroup>=41) {
                EverestCnt+=numberPeopleInGroup;
            }

        }
        totalClimbing= MousalaCnt+MontBlancCnt+KilimanjaroCnt+K2Cnt+EverestCnt;
        climbingMousala=(MousalaCnt*1.0/totalClimbing) * 100;
        climbingMontBlanc= (MontBlancCnt*1.0/totalClimbing)*100;
        climbingKilimanjaro= (KilimanjaroCnt*1.0/totalClimbing)*100;
        climbingK2= (K2Cnt*1.0/totalClimbing) * 100;
        climbingEverest= (EverestCnt*1.0/totalClimbing)*100;
        System.out.printf("%.2f%%%n",climbingMousala);
        System.out.printf("%.2f%%%n",climbingMontBlanc);
        System.out.printf("%.2f%%%n",climbingKilimanjaro);
        System.out.printf("%.2f%%%n",climbingK2);
        System.out.printf("%.2f%%",climbingEverest);

    }
}
