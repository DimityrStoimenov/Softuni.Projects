import java.util.Scanner;

public class DanceHall_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //1. read input -> length, width, side wardrobe
        //2.calculate area hall in kvadratni sm = (l*100)*(w*100)
        //3.calculate bench area= area hall / 10
        //4.calculate wardrobe = a*100 *(a*100);
        // 5.calculate bench= calculate area hall /10;
        // 6.number of dancers=(2+3+4+5) * 7040;
        double length= Double.parseDouble(scan.nextLine());
        double width= Double.parseDouble(scan.nextLine());
        double sideWordrobe= Double.parseDouble(scan.nextLine());

        double hallArea = (length*100) * (width*100);
        double benchArea= hallArea /10;
        double wordrobeArea= (sideWordrobe*100) * (sideWordrobe*100);
        double freeSpaseHall=hallArea-benchArea-wordrobeArea;
        double Dancers= freeSpaseHall/7040;
        System.out.printf("%.0f",Math.floor(Dancers));
    }
}
