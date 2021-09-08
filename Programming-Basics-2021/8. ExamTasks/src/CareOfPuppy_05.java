import java.util.Scanner;

public class CareOfPuppy_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Ани намира кученце, за което ще се грижи, докато се намери някой да го осинови. То изяжда дневно определено
        количество храна. Да се напише програма, която проверява дали количеството храна, което е закупено за
        кученцето, ще е достатъчно докато кученцето бъде осиновено.
Вход
От конзолата се прочитат:
    • Закупеното количество храна за кученцето в килограми – цяло число в интервала [1 …100]
    • На всеки следващ ред до получаване на команда Adopted ще получавате колко грама изяжда кученцето на всяко
    хранене - цяло число в интервала [10 …1000]
Изход
На конзолата се отпечатва 1 ред:
    • Ако количеството храна е достатъчно да се отпечата:
 	"Food is enough! Leftovers: {останала храна} grams."
    • Ако количеството храна не е достатъчно да се отпечата:
 	"Food is not enough. You need {нужно количество храна} grams more."
         */
        int PurchasedQuantityOfFoodInKilograms= Integer.parseInt(scan.nextLine());
        int Purchased= PurchasedQuantityOfFoodInKilograms*1000;
        String input= scan.nextLine();
        int totalAmountOfEatenFood=0;
        while(!input.equals("Adopted")) {
            int eatenFoodPerGrams= Integer.parseInt(input);
            totalAmountOfEatenFood+=eatenFoodPerGrams;
            input= scan.nextLine();
        }
        if(Purchased>=totalAmountOfEatenFood) {
            int leftFood= Purchased-totalAmountOfEatenFood;
            System.out.printf("Food is enough! Leftovers: %d grams.",leftFood);
        } else  {
            int neededFood=totalAmountOfEatenFood- Purchased;
            System.out.printf("Food is not enough. You need %d grams more.",neededFood);
        }
    }
}
