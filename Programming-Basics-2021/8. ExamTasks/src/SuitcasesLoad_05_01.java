import java.util.Scanner;

public class SuitcasesLoad_05_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Напишете програма, която ви помага при товаренето на куфари в багажника на самолет. Всеки самолет има
        определен капацитет на багажника. До получаване на команда "End" ще получавате обем на куфар. Обемът на
        всеки трети куфар трябва да се увеличава с 10%, поради загубата на пространство при начина на подреждане.
        Ако свободното пространството в даден момент е по-малко от обема на куфар товаренето трябва да прекъсне.
Вход
Първоначално се чете един ред:
    • Капацитетът на багажника – реално число в диапазона [100.0…6000.0]
След това до получаване на команда "End" или до запълване на багажника, се чете по един ред:
    • Обем на куфар – реално число в диапазона [100.0…6000.0]
Изход
На конзолата да се отпечатат следните редове според случая:
    • При получаване на командата "End" се печата:
"Congratulations! All suitcases are loaded!"
    • Ако обемът на куфара е по-голям от оставащото пространство в багажника:
"No more space!"
    • Накрая винаги се отпечатва статистика – колко багажа са натоварени:
"Statistic: {брой натоварени багажи} suitcases loaded."
         */
        double trunkCapacity = Double.parseDouble(scan.nextLine());
        String input = "";
        double suitcaseVolume = 0;
        int count = 0;
        while (true) {
            input = scan.nextLine();
            if (input.equals("End")) {
                System.out.println("Congratulations! All suitcases are loaded!");
                break;
            }
            suitcaseVolume = Double.parseDouble(input);

            if (count % 2 == 0 && count!=0) {
                suitcaseVolume = suitcaseVolume + (suitcaseVolume * 0.1);

            }
            if (trunkCapacity < suitcaseVolume) {
                System.out.println("No more space!");
                break;
            }
            trunkCapacity -= suitcaseVolume;
            count++;

        }
        System.out.printf("Statistic: %d suitcases loaded.", count);
    }
}



