import java.util.Scanner;

public class MountainRun_02_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Георги решава да подобри рекорда за най-бързо изкачване на връх Монблан. На конзолата се въвежда рекордът в
        секунди, който Георги трябва да подобри, разстоянието в метри, което трябва да изкачи и времето в секунди, за
        което той изкачва 1 метър. Да се напише програма, която изчислява дали се е справил със задачата, като се има
        предвид, че: наклона на терена го забавя на всеки 50 м. с 30 секунди. Да се изчисли времето в секунди, за което
        Георги ще изкачи разстоянието до върха и разликата спрямо рекорда.
Когато се изчислява колко пъти Георги ще се забави в резултат на наклона на терена, резултатът трябва да се закръгли
надолу до най-близкото цяло число.
Вход
От конзолата се четат 3 реда:
    1. Рекордът в секунди – реално число в интервала [0.00 … 100000.00]
    2. Разстоянието в метри – реално число в интервала [0.00 … 100000.00]
    3. Времето в секунди, за което изкачва 1 м. – реално число в интервала [0.00 … 1000.00]
Изход
Отпечатването на конзолата зависи от резултата:
    • Ако Георги е подобрил рекорда отпечатваме:
        ◦ " Yes! The new record is {времето на Георги} seconds."
    • Ако НЕ е подобрил рекорда отпечатваме:
        ◦ "No! He was {недостигащите секунди} seconds slower."
Резултатът трябва да се форматира до втория знак след десетичната запетая.
         */
        double recordInSeconds= Double.parseDouble(scan.nextLine());
        double distanceInMeters= Double.parseDouble(scan.nextLine());
        double timeInSecondsToEscapeOneMeter= Double.parseDouble(scan.nextLine());
        double lag= Math.floor(distanceInMeters / 50) * 30;
        double totalTime = distanceInMeters * timeInSecondsToEscapeOneMeter;
        double netTime = totalTime + lag;
        if(netTime>= recordInSeconds) {
        double neededTime=  netTime - recordInSeconds;
            System.out.printf("No! He was %.2f seconds slower.",neededTime );
        }
        else {
            System.out.printf("Yes! The new record is %.2f seconds.",netTime);
        }
    }
}
