import java.util.Scanner;

public class Problem_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int bitkoins= Integer.parseInt(scan.nextLine());
       double yuans= Double.parseDouble(scan.nextLine());
       double commission= Double.parseDouble(scan.nextLine());
       int leva = bitkoins*1168;
       double USD= yuans*0.15;
       double BGN= USD *1.76;
       double currencies= (leva +BGN) / 1.95;
       double percentCommision= currencies*(commission/100);
       double totalResult= currencies - percentCommision;
        System.out.printf("%.2f",totalResult);


    }
}
