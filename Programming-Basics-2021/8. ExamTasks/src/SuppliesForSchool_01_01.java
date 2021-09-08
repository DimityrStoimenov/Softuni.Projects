import java.util.Scanner;

public class SuppliesForSchool_01_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Учебната година вече е започнала и отговорничката на 10Б клас - Ани трябва да купи определен брой пакетчета
        с химикали, пакетчета с маркери, както и препарат за почистване на дъска. Тя е редовна клиентка на една
        книжарница, и има намаление за нея, което представлява някакъв процент от общата сума. Напишете програма,
        която изчислява колко пари ще трябва да събере Ани, за да плати сметката, като имате предвид следния ценоразпис:
    • Пакет химикали - 5.80 лв
    • Пакет маркери - 7.20 лв
    • Препарат - 1.20 лв (за литър)
Вход
От конзолата се четат 4 числа:
    • Първи ред - брой пакети химикали. Цяло число в интервала [0...100]
    • Втори ред - брой пакети маркери. Цяло число в интервала [0...100]
    • Трети ред - литър препарат за почистване на дъска. Реално число в интервала [0.00…50.00]
    • Четвърти ред - процентът намаление. Цяло число в интервала [0...100]
Изход
Да се отпечата на конзолата колко пари ще са нужни на Ани, за да си плати сметката.
Резултатът да се ФОРМАТИРА до третия знак след десетичната запетая.
         */
        int numberPacksOfPens= Integer.parseInt(scan.nextLine());
        int numberOfPacksTags= Integer.parseInt(scan.nextLine());
        double litersOfDetergentForCleaningTheBoard= Double.parseDouble(scan.nextLine());
        double percentOfDiscount= Double.parseDouble(scan.nextLine());
        double pricePens= numberPacksOfPens * 5.80;
        double priceTags= numberOfPacksTags*7.20;
        double priceDetergent= litersOfDetergentForCleaningTheBoard*1.20;
        double totalSum= pricePens+priceTags+priceDetergent;
        double discount = totalSum * (percentOfDiscount/100);
        double netSum= totalSum - discount;
        System.out.printf("%.3f", netSum);
    }
}
