import java.util.Scanner;

public class BirthdayParty_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // прочитаме си входа
        int rentalHall= Integer.parseInt(scan.nextLine());
        // намираме цената на тортата
        double costCake = rentalHall * 0.2;
        // намираме цената на напитките
        double costSoftDrinks= costCake - (costCake * 0.45);
        // намираме цената за наемане на аниматора
        double costPerRentAnimator= (rentalHall * 1.0)/3; // винаги когато делим int на double ,
        // int трябва да умножим (* 1.0).
        // намираме крайният разход за партито
        double totalCost= rentalHall +costCake+ costSoftDrinks+costPerRentAnimator;
        System.out.printf("%.2f",totalCost);
    }
}
