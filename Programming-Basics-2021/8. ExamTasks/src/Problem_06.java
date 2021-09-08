import java.util.Scanner;

public class Problem_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Напишете програма, която проследява представянето на вашия отбор на благотворителен коледен турнир.  Всеки ден получавате
        имена на игри до команда "Finish". Със спечелването на всяка една игра печелите по 20лв. за благотворителност.
        Трябва да изчислите колко пари сте спечелили на края на деня. Ако имате повече спечелени игри, отколкото загубени –
        вие сте победители този ден и увеличавате парите от него с 10%. При приключване на турнира ако през повечето дни сте били
        победители печелите турнира и увеличавате всичките спечелени пари с 20%.
Никога няма да имате равен брой спечелени и загубени игри.
Вход
Първоначално от конзолата се прочита броя дни на турнира – цяло число в интервала [1… 20]
До получаване на командата "Finish" се чете:
    • Спорт  – текст
За всеки спорт се прочита:
        ◦ Резултат  – текст с възможности: "win" или "lose"
Изход
Накрая се отпечатва един ред:
    • Ако сте спечелили турнира:
     	"You won the tournament! Total raised money: {спечелените пари}"
    • Ако сте загубили на турнира:
"You lost the tournament! Total raised money: {спечелените пари}"
Парите да бъдат форматирани до втората цифра след десетичния знак.
         */
        int numberDays = Integer.parseInt(scan.nextLine());
        double totalMoney = 0;
        double winMoney = 0;
        double winGames = 0;
        double loseGames = 0;
       int winAre=0;
       int WinGames=0;
       int LoseGames =0;
        int LoseAre=0;
        double money=0;
        double result=0;

        for (int days = 0; days < numberDays; days++) {
            String sport= scan.nextLine();
            while (!sport.equals("Finish")) {
                String text = scan.nextLine();
                if (text.equals("win")) {
                    winGames += 20.0;
                    winAre++;
                    WinGames++;
                } else if (text.equals("lose")) {
                    loseGames += 0;
                    LoseAre++;
                    LoseGames++;
                }
                sport= scan.nextLine();
            }
            winMoney = winGames + loseGames;
            if (winAre > LoseAre) {
                totalMoney += winMoney+(winMoney*0.1);
            } else if(LoseAre>winAre)  {
                money+=winMoney;
            }
            winGames=0;
            winAre=0;
            LoseAre=0;

        }
        if (WinGames>LoseGames) {
            totalMoney = totalMoney +(totalMoney*0.2);
            System.out.printf("You won the tournament! Total raised money: %.2f", totalMoney);
        } else if(LoseGames>WinGames)  {
             result = totalMoney+money;
            System.out.printf("You lost the tournament! Total raised money: %.2f", result);

        }
    }

}


