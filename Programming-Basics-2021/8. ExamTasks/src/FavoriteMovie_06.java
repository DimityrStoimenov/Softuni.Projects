import java.util.Scanner;

public class FavoriteMovie_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Петък вечер е и се чудите кой филм да си пуснете да гледате. Решавате да напишете програма, която
        да избере това вместо вас. До команда "STOP" получавате заглавия на любими ваши филми. Най-добрият
        филм за вас ще бъде този, който има най-много точки. Точките се изчисляват като сбор от ASCII
        стойностите на символите в заглавието на филма. (няма да има случай, в който имаме два филма с
        равен брой точки)
При изчислението на точките трябва да се има предвид следното:
    • За всяка малка буква в заглавието, от сумата трябва да се извади два пъти дължината на заглавието
     на филма.
    • За всяка главна буква в заглавието, от сумата трябва да се извади дължината на заглавието на филма.
Може да имате максимум 7 заглавия на филми.
Вход
От конзолата се четат редове до команда "STOP" или до достигането на лимита от 7 филма:
    • Заглавие на филм  – текст;
Изход
На конзолата да се отпечата:
    • Ако сте достигнали лимита от 7 филма трябва да отпечатате:
"The limit is reached."
Да се отпечата най-добрият филм за вас:
"The best movie for you is {заглавие на филм} with {сума на символите} ASCII sum."
         */
        String nameOfFilm = scan.nextLine();
        int counter = 0;
        int sum = 0;
        String bestFilm = "";
        int maxSum=Integer.MIN_VALUE;
        while (!nameOfFilm.equalsIgnoreCase("STOP")) {
            counter++;
            sum=0;
            if (counter >= 7) {
                System.out.println("The limit is reached.");
                System.out.printf("The best movie for you is %s with %d ASCII sum.", bestFilm,maxSum);
                return;
            }
            for (int i = 0; i < nameOfFilm.length(); i++) {
                if (nameOfFilm.charAt(i) >= 65 && nameOfFilm.charAt(i) <= 90) {
                    sum += nameOfFilm.charAt(i) - nameOfFilm.length();
                } else if (nameOfFilm.charAt(i) >= 97 && nameOfFilm.charAt(i) <= 122) {
                    sum += nameOfFilm.charAt(i) - (2 * (nameOfFilm.length()));
                } else if (nameOfFilm.charAt(i) == 32) {
                    sum += 32;
                } else if (nameOfFilm.charAt(i) >=48 && nameOfFilm.charAt(i)<=57) {
                    sum+= nameOfFilm.charAt(i);
                }

            }
            if(sum>maxSum) {
                maxSum=sum;
                bestFilm=nameOfFilm;
            }
            nameOfFilm= scan.nextLine();



        }
        System.out.printf("The best movie for you is %s with %d ASCII sum.", bestFilm, maxSum);
    }
}
