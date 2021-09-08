import java.util.Scanner;
public class PaintingEggs_03_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sizeofEggs= scan.nextLine(); // "Large", "Medium" или "Small"
        String colorOfEggs = scan.nextLine(); //"Red", "Green" или "Yellow"
        int numberOfLots = Integer.parseInt(scan.nextLine());
        int prizeOfLots= 0;
        switch(sizeofEggs) {
            case "Large":
                if(colorOfEggs.equals("Red")) {
                 prizeOfLots = numberOfLots * 16;
                } else if(colorOfEggs.equals("Green")) {
                    prizeOfLots = numberOfLots * 12;
                } else if(colorOfEggs.equals("Yellow")) {
                    prizeOfLots = numberOfLots * 9;
                }
                break;
            case "Medium":
                if(colorOfEggs.equals("Red")) {
                    prizeOfLots = numberOfLots * 13;
                } else if(colorOfEggs.equals("Green")) {
                    prizeOfLots = numberOfLots * 9;
                } else if(colorOfEggs.equals("Yellow")) {
                    prizeOfLots = numberOfLots * 7;
                }
                break;
            case "Small":
                if(colorOfEggs.equals("Red")) {
                    prizeOfLots = numberOfLots * 9;
                } else if(colorOfEggs.equals("Green")) {
                    prizeOfLots = numberOfLots * 8;
                } else if(colorOfEggs.equals("Yellow")) {
                    prizeOfLots = numberOfLots * 5;
                }
                break;
        }
        if((sizeofEggs.equals("Large") || (sizeofEggs.equals("Medium"))||(sizeofEggs.equals("Small")))
        &&(colorOfEggs.equals("Red") || (colorOfEggs.equals("Green"))||(colorOfEggs.equals("Yellow")))){
            double manufacturingCosts = prizeOfLots * 0.35;
            double netProfit = prizeOfLots - manufacturingCosts;
            System.out.printf("%.2f leva.",netProfit);
        }
    }
}
