import java.util.Scanner;

public class Cinema_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        От кино ви наемат да напишете програма, чрез която да разберете дали на една прожекцията ще се запълни залата и колко
        пари ще се изкарат от нея. Получавате места в залата и на всеки следващ ред до команда "Movie time!", колко хора влизат
        в залата. Цената на един билет е 5 лв. Ако текущия брой хора влезли в залата се дели на 3 без остатък, се прави
        отстъпка 5лв от общата им сметка.
Ако в залата се опитат да влязат повече хора от колкото места са останали, то се счита че местата са изчерпани и програмата
трябва да приключи четенето на вход.
Вход
От конзолата се четат:
    • На първия ред - капацитет на залата - цяло число в интервала [50... 150]
На всеки следващ ред до команда "Movie time!":
        ◦ Брой хора влизащи в киното - цяло число в интервала [1… 15]
Изход
На конзолата първо да се отпечата един ред:
    • При получена команда "Movie time!":
 "There are {останали места} seats left in the cinema."
    • При изчерпване на местата в залата:
	"The cinema is full."
След това да се отпечата:
	"Cinema income - {приходи от залата} lv."
         */
        int hallCapacity = Integer.parseInt(scan.nextLine());
        int bill = 0;

        String input= scan.nextLine();;
        while (!input.equals("Movie time!")) {
            int numberPeopleEnteringInCinema = Integer.parseInt(input);
            hallCapacity -= numberPeopleEnteringInCinema;
            if(input.equals("Movie time!")) {
                break;
            }
            if (hallCapacity < 0 ) {
                break;
            }
            bill += numberPeopleEnteringInCinema * 5;

            if (numberPeopleEnteringInCinema % 3 == 0) {
                bill -= 5;
            }
            input= scan.nextLine();

        }
            if(input. equals("Movie time!")) {
                System.out.printf("There are %d seats left in the cinema.%n", hallCapacity);
                System.out.printf("Cinema income - %d lv.", bill);
            }
            if(hallCapacity<0) {
            System.out.println("The cinema is full.");
            System.out.printf("Cinema income - %d lv.", bill);
        }
    }
}
