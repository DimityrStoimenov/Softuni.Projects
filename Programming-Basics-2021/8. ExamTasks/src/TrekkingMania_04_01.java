import java.util.Scanner;

public class TrekkingMania_04_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    /*
    Катерачи от цяла България се събират на групи и набелязват следващите върхове за изкачване. Според размера
    на групата, катерачите ще изкачват различни върхове.
    • Група до 5 човека– Мусала
    • Група от 6 до 12 – Монблан
    • Група от 13 до 25 – Килиманджаро
    • Група от 26 до 40 – К2
    • Група от 41 или повече – Еверест
Да се напише програма, която изчислява процента на катерачите изкачващи всеки връх.
Вход
От конзолата се четат поредица от числа, всяко на отделен ред:
    • На първия ред – броя на групите от катерачи – цяло число в интервала [1...1000]
    • За всяка една група на отделен ред – броя на хората в групата – цяло число в интервала [1...1000]
Изход
Да се отпечатат на конзолата 5 реда, всеки от които съдържа процент между 0.00% и 100.00% с точност до втората
цифра след десетичната запетая.
    • Първи ред - процентът изкачващи Мусала
    • Втори ред – процентът изкачващи Монблан
    • Трети ред – процентът изкачващи Килиманджаро
    • Четвърти ред – процентът изкачващи К2
    • Пети ред – процентът изкачващи Еверест
     */
        int numberOfGroupsOfClimbers= Integer.parseInt(scan.nextLine());
        int MoussalaCnt=0;
        int MonblancCnt=0;
        int KilimandjaroCnt=0;
        int K2Cnt=0;
        int EverestCnt=0;
        int totalClimbers=0;
        for( int group = 1; group<=numberOfGroupsOfClimbers; group++) {
          int numberOfPeopleInGroup= Integer.parseInt(scan.nextLine());
          if(numberOfPeopleInGroup<=5) {
              MoussalaCnt+= numberOfPeopleInGroup;
          }
          if(numberOfPeopleInGroup>= 6 && numberOfPeopleInGroup<=12) {
              MonblancCnt+=numberOfPeopleInGroup;
          }
          if(numberOfPeopleInGroup>=13 && numberOfPeopleInGroup<=25) {
              KilimandjaroCnt+=numberOfPeopleInGroup;
          }
          if(numberOfPeopleInGroup>=26 && numberOfPeopleInGroup<=40) {
              K2Cnt+=numberOfPeopleInGroup;
          }
          if(numberOfPeopleInGroup>=41) {
              EverestCnt+=numberOfPeopleInGroup;
          }
          totalClimbers+=numberOfPeopleInGroup;

        }

        double percentClimbingMoussala= (MoussalaCnt*1.0 / totalClimbers) * 100;
        double percenClimbingMonblanc= ( MonblancCnt*1.0/totalClimbers)*100;
        double percentClimbingKilimandjaro= (KilimandjaroCnt*1.0/totalClimbers)*100;
        double percentClimbingK2= (K2Cnt*1.0/totalClimbers)*100;
        double percentClimbingEverest= (EverestCnt*1.0/totalClimbers)*100;
        System.out.printf("%.2f%%%n",percentClimbingMoussala);
        System.out.printf("%.2f%%%n",percenClimbingMonblanc);
        System.out.printf("%.2f%%%n",percentClimbingKilimandjaro);
        System.out.printf("%.2f%%%n",percentClimbingK2);
        System.out.printf("%.2f%%",percentClimbingEverest);
    }
}
