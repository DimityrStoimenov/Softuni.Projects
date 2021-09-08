import java.util.Scanner;

public class FoodForPets_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Ани има два домашни любимеца - куче и котка. Напишете програма, която изготвя статистика за храната на
        домашните любимци за определен брой дни. Всеки ден кучето и котката изяждат различно количество от общата
        им храна. На  всеки трети ден получават награда - бисквитки. Количеството на бисквитките е 10% от общо
        изядената храна за деня.
Вашата програма трябва да отпечатва статистика за количеството бисквитки, които са изяли, колко процента от
първоначалното количество обща храна са изяли и колко процента от изядената храна е изяло кучето и колко е изяла
котката.
Вход
Първоначално се чете един ред:
    • Брой дни – цяло число в диапазона [1…30]
    • Общо количество храна – реално число в диапазона [0.00…10000.00]
След това за всеки ден се чете:
    • Количество изядена храна от кучето – цяло число в диапазона [10…500]
    • Количество изядена храна от котката – цяло число в диапазона [10…500]
    Изход
На конзолата да се отпечатват четири реда:
    • "Total eaten biscuits: {количество изядени бисквитки}gr."
    • "{процент изядена храна}% of the food has been eaten."
    • "{процент изядена храна от кучето}% eaten from the dog."
    • "{процент изядена храна от котката}% eaten from the cat."
Количеството изядени бисквитки трябва да бъде закръглено до най – близкото цяло число, а процентът храна трябва
да бъде форматиран до втората цифра след десетичния знак.
         */
        int  numberDays= Integer.parseInt(scan.nextLine());
        double totalAmountOfFood= Double.parseDouble(scan.nextLine());
        double eatenFoodByDog=0;
        double eatenFoodByCat=0;
        double totalEatenBiscuits=0;
        double totalEatenFood=0;
        for(int day=1; day<=numberDays; day++) {
            int amountOfFoodEatenByDog= Integer.parseInt(scan.nextLine());
            int amountOfFoodEatenByCat= Integer.parseInt(scan.nextLine());
            eatenFoodByDog+= amountOfFoodEatenByDog*1.0;
            eatenFoodByCat+=amountOfFoodEatenByCat*1.0;
            if(day %3 ==0) {
                totalEatenBiscuits+= (amountOfFoodEatenByDog+amountOfFoodEatenByCat)*0.1;

            }
        }
        totalEatenFood=eatenFoodByDog+eatenFoodByCat;
        System.out.printf("Total eaten biscuits: %.0fgr.%n",totalEatenBiscuits);
        double total= (totalEatenFood/totalAmountOfFood)*100;
        System.out.printf("%.2f%% of the food has been eaten.%n",total);
        double eatenFoodDog=(eatenFoodByDog / totalEatenFood) * 100;
        System.out.printf("%.2f%% eaten from the dog.%n",eatenFoodDog);
        double eatenFoodCat= (eatenFoodByCat/totalEatenFood)*100;
        System.out.printf("%.2f%% eaten from the cat.",eatenFoodCat);
    }
}
