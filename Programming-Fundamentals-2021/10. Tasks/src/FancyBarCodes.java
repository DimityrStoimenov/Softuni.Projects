import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarCodes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String regex = "@#+(?<productGroup>[A-Z][a-zA-Z0-9]{4,}[A-Z])@#+";
        for (int i = 0; i < n ; i++) {
            String code = scan.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(code);
            if (matcher.find()) {
                String fancyCode = matcher.group("productGroup");
                StringBuilder builder = new StringBuilder();
                for (int j = 0; j <= fancyCode.length() -1 ; j++) {
                    char currentChar = fancyCode.charAt(j);
                    if (Character.isDigit(currentChar)) {
                        builder.append(currentChar);
                    }
                }
                if (builder.toString().equals("")) {
                    System.out.println("Product group: 00");
                } else  {
                    System.out.printf("Product group: %s%n", builder);
                }
            } else {
                System.out.println("Invalid barcode");
            }

        }
    }
}
