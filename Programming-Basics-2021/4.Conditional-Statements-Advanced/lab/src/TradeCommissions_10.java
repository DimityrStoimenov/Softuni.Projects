import java.util.Scanner;

public class TradeCommissions_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String city = scan.nextLine(); // име на град
        double s = Double.parseDouble(scan.nextLine()); // обем продажби
        double sizeOfCommission = 0;
        boolean isCity = (city.equals("Sofia") || city.equals("Varna") || city.equals("Plovdiv"));
        boolean isSalesVolume = (0 <= s && s <= 500 || 500 < s && s <= 1000 || 1000 < s && s <= 10000 || s > 10000);
        if (isCity) {
            if (city.equals("Sofia")) {
                if (isSalesVolume) {
                    if (0 <= s && s <= 500) {
                        sizeOfCommission = s * 0.05;
                        System.out.printf("%.2f", sizeOfCommission);
                    } else if (500 < s && s <= 1000) {
                        sizeOfCommission = s * 0.07;
                        System.out.printf("%.2f", sizeOfCommission);
                    } else if (1000 < s && s <= 10000) {
                        sizeOfCommission = s * 0.08;
                        System.out.printf("%.2f", sizeOfCommission);
                    } else if (s > 10000) {
                        sizeOfCommission = s * 0.12;
                        System.out.printf("%.2f", sizeOfCommission);
                    }
                }
            }
        }
        if (isCity) {
            if (city.equals("Varna")) {
                if (isSalesVolume) {
                    if (0 <= s && s <= 500) {
                        sizeOfCommission = s * 0.045;
                        System.out.printf("%.2f", sizeOfCommission);
                    } else if (500 < s && s <= 1000) {
                        sizeOfCommission = s * 0.075;
                        System.out.printf("%.2f", sizeOfCommission);
                    } else if (1000 < s && s <= 10000) {
                        sizeOfCommission = s * 0.10;
                        System.out.printf("%.2f", sizeOfCommission);
                    } else if (s > 10000) {
                        sizeOfCommission = s * 0.13;
                        System.out.printf("%.2f", sizeOfCommission);
                    }
                }
            }
        }
        if (isCity) {
            if (city.equals("Plovdiv")) {
                if (isSalesVolume) {
                    if (0 <= s && s <= 500) {
                        sizeOfCommission = s * 0.055;
                        System.out.printf("%.2f", sizeOfCommission);
                    } else if (500 < s && s <= 1000) {
                        sizeOfCommission = s * 0.08;
                        System.out.printf("%.2f", sizeOfCommission);
                    } else if (1000 < s && s <= 10000) {
                        sizeOfCommission = s * 0.12;
                        System.out.printf("%.2f", sizeOfCommission);
                    } else if (s > 10000) {
                        sizeOfCommission = s * 0.145;
                        System.out.printf("%.2f", sizeOfCommission);
                    }
                }
            }
        }
        if (!isCity && isSalesVolume) {
            System.out.println("error");
        }
        if (isCity && !isSalesVolume) {
            System.out.println("error");
        }
        if (!isCity && !isSalesVolume) {
            System.out.println("error");
        }

    }
}
