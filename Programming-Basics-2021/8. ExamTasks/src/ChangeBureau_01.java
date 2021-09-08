import java.util.Scanner;

public class ChangeBureau_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Преди време Петър си е купил биткойн. Сега ще ходи на екскурзия из Европа и ще му трябва евро. Освен биткойн
        има и китайски юанa. Той иска да обмени парите си в евро за екскурзията. Напишете програма, която да пресмята
        колко евро може да купи спрямо следните валутни курсове:
    • 1 биткойн = 1168 лева.
    • 1 китайски юан = 0.15 долара.
    • 1 долар = 1.76 лева.
    • 1 евро = 1.95 лева.
Обменното бюро има комисионна от 0 до 5 процента от крайната сума в евро.
Вход
От конзолата се четат 3 числа:
    • На първия ред – броят биткойни. Цяло число в интервала [0…20]
    • На втория ред – броят китайски юана. Реално число в интервала [0.00… 50 000.00]
    • На третия ред – комисионната. Реално число в интервала [0.00 ... 5.00]
Изход
На конзолата да се отпечата 1 число - резултатът от обмяната на валутите. Резултатът да се форматира до втората
цифра след десетичната запетая.
         */
        int bitcoins= Integer.parseInt(scan.nextLine());
        double yuan = Double.parseDouble(scan.nextLine());
        double commission= Double.parseDouble(scan.nextLine());
        int bitcoinsToLeva= bitcoins * 1168;
        double USD= yuan*0.15;
        double USDToLeva= USD*1.76;
        double sum= (bitcoinsToLeva + USDToLeva) /1.95;
        double discount= sum * (commission/100);
        double totalSum = sum - discount;
        System.out.printf("%.2f", totalSum);

    }
}
