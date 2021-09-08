import java.util.Scanner;

public class YardGreening_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // прочитаме си входа
        double squareMetersOfLandscaping = Double.parseDouble(scan.nextLine());//квадратни метри за озеленяване
        // първо намираме цената на всички квадратни метри
        double totalCostOfAllSquareMeters = squareMetersOfLandscaping * 7.61;
        // след това намираме отстъпката
        double discount = (totalCostOfAllSquareMeters * 18)/100;
        //  изчисляваме цената след приспадане на отстъпката
        double netCost= totalCostOfAllSquareMeters - discount;
        // Разпечатваме исканите резултати като пак използваме System.out.printf,ато за да са едно под друго на края
        // на
        // първата разпечатка ( преди кавичките за край) използваме шаблон за преминаване на хов ред - шаблонът е %n
        System.out.printf("The final price is: %.2f lv.%n",netCost);
        System.out.printf("The discount is: %.2f lv.",discount);

    }
}

