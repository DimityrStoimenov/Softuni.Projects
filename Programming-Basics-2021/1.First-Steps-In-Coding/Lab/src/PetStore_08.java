import java.util.Scanner;

public class PetStore_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // прочитаме си входа
        int numberOfDogs= Integer.parseInt(scan.nextLine());
        int numberOfOtherAnimals= Integer.parseInt(scan.nextLine());
        // изчисляваме разхода за храна на кучетата с double
        double costFoodForDogs= numberOfDogs * 2.50;
        // изчисляваме разхода за храна на другите животни
        double costFoodForOtherAnimals=numberOfOtherAnimals *4;
        // изчисляваме общия разход
        double totalCost= costFoodForDogs + costFoodForOtherAnimals;
        // използваме разпечатка със специалното форматиране System.out.printf  винаги когато имаш {} използваш,
        // System.out.printf (%.1f - означава че форматираш до 1 знак след десетичната запетая( може назад да
        // имаш 10 знака , така форматирано ще ти го закръгли ддо първия знак. %.2f е до втория знак(5,85), %.3f е до
        // третия знак ( 5.654) и т.н %.0f ще ти го форматира като десетично число (5)
        System.out.printf("%.1f lv.",totalCost);

    }
}
