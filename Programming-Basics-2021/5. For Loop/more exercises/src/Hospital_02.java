import java.util.Scanner;

public class Hospital_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int period= Integer.parseInt(scan.nextLine());
        int doctors=7;
        int treatedPatients=0;
        int untreatedPatients=0;
        for (int i = 1; i <= period; i++) {
            int numberOfPatients= Integer.parseInt(scan.nextLine());
            if( i % 3 == 0 && untreatedPatients>treatedPatients) {
                doctors++;
            }
            if(numberOfPatients>doctors) {
                treatedPatients+=doctors;
                untreatedPatients+= numberOfPatients- doctors;
            } else {
                treatedPatients+= numberOfPatients;
            }
        }
        System.out.printf("Treated patients: %d.%n",treatedPatients);
        System.out.printf("Untreated patients: %d.",untreatedPatients);
    }
}
