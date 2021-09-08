import java.util.Scanner;

public class CinemaVoucher_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int voucherValue = Integer.parseInt(scan.nextLine());
        String command = "";
        int ticketCount = 0;
        int productCount = 0;
        int count = 0;
        int prize = 0;
        while (!"End".equals(command = scan.nextLine())) {
            String purchase = command;
            count = 0;
            prize = 0;
            for (int i = 0; i < purchase.length(); i++) {
                if (purchase.charAt(i) >= 32 && purchase.charAt(i) <= 122) {
                    count++;
                }
            }


            if (count <= 8) {
                prize = purchase.charAt(0);
                voucherValue -= prize;
                if (voucherValue < 0) {
                    break;
                }
                productCount += 1;

            } else {
                prize = purchase.charAt(0) + purchase.charAt(1);
                voucherValue -= prize;
                if (voucherValue < 0) {
                    break;
                }
                ticketCount += 1;
            }

        }
        System.out.printf("%d%n", ticketCount);
        System.out.printf("%d", productCount);
    }
}

