import java.util.Scanner;

public class VacationBooksList_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Pages= Integer.parseInt(scan.nextLine());
        int readPagesPerHour= Integer.parseInt(scan.nextLine());
        int daysReadAllBook= Integer.parseInt(scan.nextLine());
        // изчисляваме общото време за четене на книгата ( общите страници / прочетените страници за 1 час)
        int totalTimePerReadAllBook= Pages / readPagesPerHour;
        // сега остава да намерим за колко часа ще я прочете ( общото време за четене / броя дни за които ще я прочете)
        int neededHoursForReadAllBook= totalTimePerReadAllBook /daysReadAllBook;
        System.out.println(neededHoursForReadAllBook);
    }
}
