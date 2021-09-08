import java.util.Scanner;

public class PadawanEquipment_09_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double amountOfMoney = Double.parseDouble(scan.nextLine());
        int countOfStudents = Integer.parseInt(scan.nextLine());
        double priceOfSingleSaber = Double.parseDouble(scan.nextLine());
        double priceOfSingleRobe = Double.parseDouble(scan.nextLine());
        double priceOfSingleBelt = Double.parseDouble(scan.nextLine());
        double priceOfSabers = (priceOfSingleSaber * Math.ceil (countOfStudents + (countOfStudents * 0.1)));
        double priceOfRobes = priceOfSingleRobe * countOfStudents;
       int freeBelts = countOfStudents / 6;
        double priceOfBelts = (countOfStudents - freeBelts) * priceOfSingleBelt ;
        double totalCost = priceOfSabers + priceOfBelts + priceOfRobes;
        if(totalCost> amountOfMoney) {
            double neededMoney = totalCost - amountOfMoney;
            System.out.printf("George Lucas will need %.2flv more.", neededMoney);
        } else {
            System.out.printf("The money is enough - it would cost %.2flv.", totalCost);
        }
    }
}
