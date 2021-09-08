import java.util.Scanner;

public class ForeignLanguages_06_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String country = scan.nextLine();
       if(country.equals("England") || country.equals("USA")) {
           System.out.println("English");
       } else if (country.equals("Spain") || country.equals("Mexico") || country.equals("Argentina")) {
           System.out.println("Spanish");
       } else {
           System.out.println("unknown");
       }
    }
}
