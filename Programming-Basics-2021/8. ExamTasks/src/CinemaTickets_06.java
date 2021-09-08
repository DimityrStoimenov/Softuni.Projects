import java.util.Scanner;

public class CinemaTickets_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nameOfFilm = scan.nextLine();
        int studentCnt= 0;
        int standardCnt = 0;
        int kidCnt = 0;
        int Tickets = 0;
        double average=0;
        int Student =0;
        int Standard =0;
        int numberOfSeats =0;
        int Kid = 0;
        while (!"Finish". equals(nameOfFilm)) {
            int numberOfFreeSeats = Integer.parseInt(scan.nextLine());
            numberOfSeats = numberOfFreeSeats;
            String command = scan.nextLine();
            while (!"End". equals(command)) {
                switch (command) {
                    case "student":
                        studentCnt++;
                        Student++;
                        numberOfFreeSeats--;
                        break;
                    case "standard":
                        standardCnt++;
                        Standard++;
                        numberOfFreeSeats--;
                        break;
                    case "kid":
                        kidCnt++;
                        Kid++;
                        numberOfFreeSeats--;
                        break;
                }
                if (numberOfFreeSeats <= 0) {
                    break;
                }
                command= scan.nextLine();
            }
            Tickets += studentCnt + standardCnt + kidCnt;
            average = (Tickets * 1.0 / numberOfSeats) * 100;
            System.out.printf("%s - %.2f%% full.%n", nameOfFilm,average);
            average =0;
            Tickets=0;
            standardCnt=0;
            studentCnt=0;
            kidCnt=0;
            numberOfSeats =0;
            nameOfFilm = scan.nextLine();
        }
        int totalTickets = Student + Standard+Kid;
        double studentTickets = (Student * 1.0 / totalTickets) * 100;
        double standardTickets =(Standard *1.0 / totalTickets) * 100;
        double kidTickets = ( Kid * 1.0 / totalTickets) * 100;
        System.out.printf("Total tickets: %d%n",totalTickets);
        System.out.printf("%.2f%% student tickets.%n",studentTickets);
        System.out.printf("%.2f%% standard tickets.%n",standardTickets);
        System.out.printf("%.2f%% kids tickets.",kidTickets);
    }
}
