import java.util.Scanner;

public class Train_01_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(java.lang.System.in);
        int numberOfWagons = Integer.parseInt(scan.nextLine());
        int [] wagons = new int[numberOfWagons];
        int sum = 0;
        for (int i = 0; i < numberOfWagons ; i++) {
            wagons[i] = Integer.parseInt(scan.nextLine());
            sum += wagons[i];
        }
        for (int wagon : wagons) {
            System.out.print(wagon + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
