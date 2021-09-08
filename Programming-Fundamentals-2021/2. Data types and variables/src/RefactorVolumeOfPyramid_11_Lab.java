import java.util.Scanner;

public class RefactorVolumeOfPyramid_11_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double length, width, volume = 0;
        System.out.print("Length: ");
        length = Double.parseDouble(scan.nextLine());
        System.out.print("Width: ");
        width = Double.parseDouble(scan.nextLine());
        System.out.print("Height: ");
        double height = Double.parseDouble(scan.nextLine());
        volume = (length * width * height) / 3;
        System.out.printf("Pyramid Volume: %.2f", volume);
    }
}
