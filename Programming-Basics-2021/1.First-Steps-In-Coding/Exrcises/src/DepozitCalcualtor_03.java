import java.util.Scanner;

public class DepozitCalcualtor_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // прочитаме си входа
        double depositAmount= Double.parseDouble(scan.nextLine());
        int termOfDeposit= Integer.parseInt(scan.nextLine());
        double annualRate= Double.parseDouble(scan.nextLine());
        //  първо изчисляваме лихвеният процент(annualRate) който ни плаща банката за това че си държим парите при тях
        double accumulatedInterest = depositAmount * (annualRate /100);
        // така вече може да намерим колко ни плаща за един месец , като разделим годишният приход от лихва на 12
       double interestPerMonth= accumulatedInterest /12;
       // накрая изчисляваме каква сума ще получим за целият депозитен период,като съберем депозита с
        // умножени прихода ни за месец по срока на депозита
        double totalAmountForAllPeriod= depositAmount+(interestPerMonth * termOfDeposit) ;
        System.out.printf("%.2f",totalAmountForAllPeriod);
    }
}
