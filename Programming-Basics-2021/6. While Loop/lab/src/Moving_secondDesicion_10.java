import java.util.Scanner;

public class Moving_secondDesicion_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width= Integer.parseInt(scan.nextLine());
        int length= Integer.parseInt(scan.nextLine());
        int height= Integer.parseInt(scan.nextLine());

        int freeSpace= width * length * height;
        int totalSpace = 0;
        int space = 0;
        while(true) {
            String input= scan.nextLine();
            if(input.equals("Done")) {
                System.out.println(space + " Cubic meters left.");
                break;
            }
            int box= scan.nextInt();
            if(totalSpace < freeSpace) {
                totalSpace= totalSpace +box;
                space= Math.abs(totalSpace-freeSpace);
                System.out.printf("No more free space! You need %d Cubic meters more.", space);
                break;
            }

        }
    }
}
