import java.util.Scanner;

public class GodzillaAgainstKong_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Снимките за дългоочаквания филм "Годзила срещу Конг" започват. Сценаристът Адам Уингард ви моли да
        напишете програма, която да изчисли, дали предвидените средства са достатъчни за снимането на филма.
        За снимките  ще бъдат нужни определен брой статисти, облекло за всеки един статист и декор.
Известно е, че:
        ◦ Декорът за филма е на стойност 10% от бюджета.
        ◦ При повече от 150 статиста,  има отстъпка за облеклото на стойност 10%.
Вход
От конзолата се четат 3 реда:
    Ред 1. Бюджет за филма – реално число в интервала [1.00 … 1000000.00]
    Ред 2. Брой на статистите – цяло число в интервала [1 … 500]
    Ред 3. Цена за облекло на един статист – реално число в интервала [1.00 … 1000.00]
Изход
На конзолата трябва да се отпечатат два реда:
    • Ако  парите за декора и дрехите са повече от бюджета:
        ◦ "Not enough money!"
        ◦ "Wingard needs {парите недостигащи за филма} leva more."
    • Ако парите за декора и дрехите са по малко или равни на бюджета:
        ◦ "Action!"
        ◦ "Wingard starts filming with {останалите пари} leva left."
Резултатът трябва да е форматиран до втория знак след десетичната запетая.
         */
        double budget = Double.parseDouble(scan.nextLine());
        int numberOfWalkOn = Integer.parseInt(scan.nextLine());
        double costForClothPerWalkOn= Double.parseDouble(scan.nextLine());
        double decor = budget * 0.1;
        double costOfClothesForAllWalkOns= numberOfWalkOn * costForClothPerWalkOn;
        if(numberOfWalkOn >150){
            costOfClothesForAllWalkOns = costOfClothesForAllWalkOns - (costOfClothesForAllWalkOns *0.1);
        }
        double totalCost= costOfClothesForAllWalkOns + decor;
        if(totalCost > budget) {
            double neededMoney= totalCost - budget;
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",neededMoney);
        } else {
            double leftMoney= budget - totalCost;
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",leftMoney);
        }

    }
}
