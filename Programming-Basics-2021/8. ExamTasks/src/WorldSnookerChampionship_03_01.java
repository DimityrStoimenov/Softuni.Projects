import java.util.Scanner;

public class WorldSnookerChampionship_03_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String stageOfTheChampionship = scan.nextLine(); // “Quarter final ”, “Semi final” или “Final”
        String typeOfTicket = scan.nextLine(); // “Standard”, “Premium” или “VIP”
        int numberOfTickets = Integer.parseInt(scan.nextLine());
        char photoOfTheTrophy = scan.nextLine().charAt(0); // Y' (да) или 'N' (не)
        double prizeOfTicket = 0;
        double discount = 0;
        int prize;
        switch (stageOfTheChampionship) {
            case "Quarter final":
                if (typeOfTicket.equals("Standard")) {
                    prizeOfTicket = numberOfTickets * 55.50;
                    if (prizeOfTicket > 2500 && prizeOfTicket<=4000) {
                        discount = prizeOfTicket - (prizeOfTicket * 0.1);
                    } else if (prizeOfTicket > 4000) {
                        discount = prizeOfTicket - (prizeOfTicket * 0.25);
                    }
                }
                if (typeOfTicket.equals("Premium")) {
                    prizeOfTicket = numberOfTickets * 105.20;
                    if (prizeOfTicket > 2500 && prizeOfTicket <= 4000) {
                        discount = prizeOfTicket - (prizeOfTicket * 0.1);
                    } else if (prizeOfTicket > 4000) {
                        discount = prizeOfTicket - (prizeOfTicket * 0.25);
                    }
                }
                if (typeOfTicket.equals("VIP")) {
                    prizeOfTicket = numberOfTickets * 118.90;
                    if (prizeOfTicket > 2500 && prizeOfTicket<=4000) {
                        discount = prizeOfTicket - (prizeOfTicket * 0.1);
                    } else if (prizeOfTicket > 4000) {
                        discount = prizeOfTicket - (prizeOfTicket * 0.25);
                    }
                }
                break;
            case "Semi final":
                if (typeOfTicket.equals("Standard")) {
                    prizeOfTicket = numberOfTickets * 75.88;
                    if (prizeOfTicket > 2500 && prizeOfTicket <= 4000) {
                        discount = prizeOfTicket - (prizeOfTicket * 0.1);
                    } else if (prizeOfTicket > 4000) {
                        discount = prizeOfTicket - (prizeOfTicket * 0.25);
                    }
                }
                if (typeOfTicket.equals("Premium")) {
                    prizeOfTicket = numberOfTickets * 125.22;
                    if (prizeOfTicket > 2500 && prizeOfTicket<=4000) {
                        discount = prizeOfTicket - (prizeOfTicket * 0.1);
                    } else if (prizeOfTicket > 4000) {
                        discount = prizeOfTicket - (prizeOfTicket * 0.25);
                    }
                }
                if (typeOfTicket.equals("VIP")) {
                    prizeOfTicket = numberOfTickets * 300.40;
                    if (prizeOfTicket > 2500 && prizeOfTicket <=4000) {
                        discount = prizeOfTicket - (prizeOfTicket * 0.1);
                    } else if (prizeOfTicket > 4000) {
                        discount = prizeOfTicket - (prizeOfTicket * 0.25);
                    }
                }

                break;
            case "Final":
                if (typeOfTicket.equals("Standard")) {
                    prizeOfTicket = numberOfTickets * 110.10;
                    if (prizeOfTicket > 2500 && prizeOfTicket<=4000) {
                        discount = prizeOfTicket - (prizeOfTicket * 0.1);
                    } else if (prizeOfTicket > 4000) {
                        discount = prizeOfTicket - (prizeOfTicket * 0.25);
                    }
                }
                if (typeOfTicket.equals("Premium")) {
                    prizeOfTicket = numberOfTickets * 160.66;
                    if (prizeOfTicket > 2500 && prizeOfTicket<=4000) {
                        discount = prizeOfTicket - (prizeOfTicket * 0.1);
                    } else if (prizeOfTicket > 4000) {
                        discount = prizeOfTicket - (prizeOfTicket * 0.25);
                    }
                }
                if (typeOfTicket.equals("VIP")) {
                    prizeOfTicket = numberOfTickets * 400.00;
                    if (prizeOfTicket > 2500 && prizeOfTicket<=4000) {
                        discount = prizeOfTicket - (prizeOfTicket * 0.1);
                    } else if (prizeOfTicket > 4000) {
                        discount = prizeOfTicket - (prizeOfTicket * 0.25);
                    }
                }

                break;
        }
        if (((stageOfTheChampionship.equals("Quarter final")) || (stageOfTheChampionship.equals("Semi final")) ||
                (stageOfTheChampionship.equals("Final"))) && ((typeOfTicket.equals("Standard")) ||
                (typeOfTicket.equals("Premium")) || (typeOfTicket.equals("VIP"))) && (prizeOfTicket <= 2500) &&
                (photoOfTheTrophy == 'N')) {
            System.out.printf("%.2f", prizeOfTicket);
        } else if (((stageOfTheChampionship.equals("Quarter final")) || (stageOfTheChampionship.equals("Semi final")) ||
                (stageOfTheChampionship.equals("Final"))) && ((typeOfTicket.equals("Standard")) ||
                (typeOfTicket.equals("Premium")) || (typeOfTicket.equals("VIP"))) && (prizeOfTicket <= 2500) &&
                (photoOfTheTrophy == 'Y')) {
            prize = 40 * numberOfTickets;
            prizeOfTicket += prize;
            System.out.printf("%.2f", prizeOfTicket);
        }
        if (((stageOfTheChampionship.equals("Quarter final")) || (stageOfTheChampionship.equals("Semi final")) ||
                (stageOfTheChampionship.equals("Final"))) && ((typeOfTicket.equals("Standard")) ||
                (typeOfTicket.equals("Premium")) || (typeOfTicket.equals("VIP"))) &&
                (prizeOfTicket>2500 && prizeOfTicket <= 4000) && (photoOfTheTrophy == 'N')) {
            System.out.printf("%.2f",discount);
        } else if (((stageOfTheChampionship.equals("Quarter final")) || (stageOfTheChampionship.equals("Semi final")) ||
                (stageOfTheChampionship.equals("Final"))) && ((typeOfTicket.equals("Standard")) ||
                (typeOfTicket.equals("Premium")) || (typeOfTicket.equals("VIP"))) &&
                (prizeOfTicket>2500 && prizeOfTicket <= 4000) && (photoOfTheTrophy == 'Y')) {
            prize = 40 * numberOfTickets;
            discount += prize;
            System.out.printf("%.2f", discount);
        }
        if (((stageOfTheChampionship.equals("Quarter final")) || (stageOfTheChampionship.equals("Semi final")) ||
                (stageOfTheChampionship.equals("Final"))) && ((typeOfTicket.equals("Standard")) ||
                (typeOfTicket.equals("Premium")) || (typeOfTicket.equals("VIP"))) && (prizeOfTicket > 4000) &&
                (photoOfTheTrophy == 'N')) {
            System.out.printf("%.2f",discount);
        } else if (((stageOfTheChampionship.equals("Quarter final")) || (stageOfTheChampionship.equals("Semi final")) ||
                (stageOfTheChampionship.equals("Final"))) && ((typeOfTicket.equals("Standard")) ||
                (typeOfTicket.equals("Premium")) || (typeOfTicket.equals("VIP"))) && (prizeOfTicket > 4000) &&
                (photoOfTheTrophy == 'Y')) {
            System.out.printf("%.2f",discount);
        }
    }
}
