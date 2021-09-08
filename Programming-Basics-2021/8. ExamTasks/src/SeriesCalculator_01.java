import java.util.Scanner;

public class SeriesCalculator_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Напишете програма, която изчислява колко време ще ви отнеме да изгледате всички епизоди на един сериал в минути. Ще
        разполагате с брой сезони, брой епизоди на сезон и времетраене на един епизод. Във всеки епизод има реклами, които са с
        продължителност 20% от времето на един епизод. Също така знаете, че всеки сезон завършва със специален епизод, който е с
        10м по-дълъг от обичайното.
Вход
От конзолата се четат 4 реда:
    • Име на сериал - текст
    • Брой сезони – цяло число в диапазона [1… 10]
    • Брой епизоди  – цяло число в диапазона [10… 80]
    • Времетраене на обикновен епизод без рекламите – реално число в диапазона [40.0… 65.0]
Изход
Да се отпечата на конзолата времето, необходимо за изглеждане на всички епизоди, закръглено до най-близкото цяло число надолу в
следния формат:
"Total time needed to watch the {име на сериал} series is {време} minutes."
         */
        String nameSerial= scan.nextLine();
        int numberSeasons= Integer.parseInt(scan.nextLine());
        int numberEpisodes= Integer.parseInt(scan.nextLine());
        double durationEpisodAdFree= Double.parseDouble(scan.nextLine());
        double durationEpisodeWitAdd= durationEpisodAdFree + (durationEpisodAdFree *0.2);
        double addedtimeOfSpecialEpisode= numberSeasons * 10;
        double totalTimeWatching= Math.floor(durationEpisodeWitAdd * numberSeasons* numberEpisodes + addedtimeOfSpecialEpisode);
        System.out.printf("Total time needed to watch the %s series is %.0f minutes.",nameSerial, totalTimeWatching);
    }
}
