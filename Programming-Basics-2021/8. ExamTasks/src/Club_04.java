import java.util.Scanner;

public class Club_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Времето се затопля и клубовете пускат обещаващи промоции. Напише програма, която да изчислява
        приходите на един клуб за вечерта и дали е достигната желаната печалба, като знаете следните
        условия: цената на един коктейл е дължината неговото име. Ако цената на една поръчка е нечетно
        число, има 25% отстъпка от цената на поръчката.
Вход
От конзолата се четат:
    • На първия ред – желаната печалба на клуба - реално число в интервала [1.00... 15000.00]
Поредица от два реда до получаване на командата "Party!" или до достигане на желаната печалба:
        ◦ Име на коктейла – текст
        ◦ Брой на коктейлите за поръчката – цяло число в интервала [1… 50]
Изход
На конзолата първо да се отпечата един ред:
    • При получена команда "Party!":
 "We need {недостигаща сума} leva more."
    • При достигане на желаната печалба:
	"Target acquired."
След това да се отпечата:
	"Club income - {приходи от клуба} leva."
Парите да бъдат форматирани до втората цифра след десетичния знак.
         */
        double desiredProfit = Double.parseDouble(scan.nextLine());

        double profit = 0;
        double Money = 0;
        double neededMoney = 0;
        String namecocteil = scan.nextLine();
        while (!namecocteil.equals("Party!")) {
            int numberCocteilsForOrder = Integer.parseInt(scan.nextLine());
            int name = namecocteil.length();
            Money = 0;
            Money = name * numberCocteilsForOrder;
            if (Money % 2 == 1) {
                Money = Money - (Money * 0.25);

            } else {

            }
            profit += Money;

            if (profit >= desiredProfit) {
                break;

            }


            namecocteil = scan.nextLine();


        }

        if (profit >= desiredProfit) {
            System.out.println("Target acquired.");
            System.out.printf("Club income - %.2f leva.", profit);
        } else {
            neededMoney = desiredProfit - profit;
            System.out.printf("We need %.2f leva more.%n", neededMoney);
            System.out.printf("Club income - %.2f leva.", profit);
        }
    }
}
