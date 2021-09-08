import java.util.Scanner;

public class EnergyBooster_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Сезона за изкачване на алпийски върхове започва и всички алпинисти, се запасяват с енергийни гелове за
        изкачването. Фирма предлага малки и големи разфасовки с по 2 бр. и 5 бр. енергийни гела, като цената на
        един гел зависи от плодовете, от които е направен. В зависимост от размера на разфасовката, цената за брой
        енергиен гел е различна. От конзолата се четат плодовете, размерът на опаковката ((малка) 2 бр. или (голяма)
        5 бр.), както и колко разфасовки са поръчани. Да се напише програма, която изчислява сумата, която трябва да
        се плати за поръчката.
        /*
                       Диня         Манго          Ананас            Малина

  2 броя (small)       56 лв./бр.    36.66 лв./бр.   42.10 лв./бр.    20 лв./бр.

  5 броя (big)         28.70 лв./бр. 19.60 лв./бр.   24.80 лв./бр.   15.20 лв./бр.
    При поръчки:
    • от 400 лв. до 1000 лв. включително има 15% отстъпка
    • над 1000 лв. има 50% отстъпка

     От конзолата се четат 3 реда:
    1. Плод - текст с възможности: "Watermelon", "Mango", "Pineapple" или "Raspberry"
    2. Размерът на сета - текст с възможности: "small" или "big"
    3. Брой на поръчаните сетове - цяло число в интервала [1 … 10000]
    На конзолата се отпечатва 1 ред:
    • Цената, която трябва да се заплати, форматирана до втория знак след десетичната запетая,
в следния формат:
"{цената} lv."

         */
        String fruit= scan.nextLine();
        String sizeOfPackage = scan.nextLine();
        int numberOfPackages= Integer.parseInt(scan.nextLine());
        double cost = 0;
        double discount=0;
        switch(fruit) {
            case "Watermelon":
                if(sizeOfPackage.equals("small")) {
                   cost= numberOfPackages*56*2;
                } else if(sizeOfPackage.equals("big")) {
                    cost=28.70 * numberOfPackages*5;
                }
                break;
            case "Mango":
                if(sizeOfPackage.equals("small")) {
                    cost= numberOfPackages*36.66*2;
                } else if(sizeOfPackage.equals("big")) {
                    cost=19.60*numberOfPackages*5;
                }
                break;
            case "Pineapple":
                if(sizeOfPackage.equals("small")) {
                    cost= numberOfPackages*42.10*2;
                } else if(sizeOfPackage.equals("big")) {
                    cost=24.80*numberOfPackages*5;
                }
                break;
            case "Raspberry":
                if(sizeOfPackage.equals("small")) {
                    cost= numberOfPackages*20*2;
                } else if(sizeOfPackage.equals("big")) {
                    cost=15.20*numberOfPackages*5;
                }
                break;
        }
        if((fruit.equals("Watermelon")||fruit.equals("Mango")||fruit.equals("Pineapple")||fruit.equals("Raspberry")
        ) && (sizeOfPackage.equals("small")||sizeOfPackage.equals("big")) && cost <400 ) {
            System.out.printf("%.2f lv.",cost);
        }
        if((fruit.equals("Watermelon")||fruit.equals("Mango")||fruit.equals("Pineapple")||fruit.equals("Raspberry")
        ) && (sizeOfPackage.equals("small")||sizeOfPackage.equals("big")) && (cost>=400 &&
                cost<=1000)) {
            discount = cost - (cost *0.15);
            System.out.printf("%.2f lv.", discount);
        } else if ((fruit.equals("Watermelon")||fruit.equals("Mango")||fruit.equals("Pineapple")||fruit.equals("Raspberry")
        ) && (sizeOfPackage.equals("small")||sizeOfPackage.equals("big")) && cost >1000){
            discount = cost - (cost * 0.5);
            System.out.printf("%.2f lv.", discount);
        }
    }
}
