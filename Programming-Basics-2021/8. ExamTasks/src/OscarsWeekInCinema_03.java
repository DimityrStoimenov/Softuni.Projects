import java.util.Scanner;

public class OscarsWeekInCinema_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nameOfFilm = scan.nextLine(); // ("A Star Is Born", "Bohemian Rhapsody","Green Book" или "The Favourite")
        String typeofHall = scan.nextLine(); // ("normal", "luxury" или "ultra luxury")
        int numberOfTickets = Integer.parseInt(scan.nextLine());
        double prize = 0;
        switch (typeofHall) {
            case "normal":
                if (nameOfFilm.equals("A Star Is Born")) {
                    prize = numberOfTickets * 7.50;
                } else if (nameOfFilm.equals("Bohemian Rhapsody")) {
                    prize = numberOfTickets * 7.35;
                } else if (nameOfFilm.equals("Green Book")) {
                    prize = numberOfTickets * 8.15;
                } else if (nameOfFilm.equals("The Favourite")) {
                    prize = numberOfTickets * 8.75;
                }
                break;
            case "luxury":
                if (nameOfFilm.equals("A Star Is Born")) {
                    prize = numberOfTickets * 10.50;
                } else if (nameOfFilm.equals("Bohemian Rhapsody")) {
                    prize = numberOfTickets * 9.45;
                } else if (nameOfFilm.equals("Green Book")) {
                    prize = numberOfTickets * 10.25;
                } else if (nameOfFilm.equals("The Favourite")) {
                    prize = numberOfTickets * 11.55;
                }
                break;
            case "ultra luxury":
                if (nameOfFilm.equals("A Star Is Born")) {
                    prize = numberOfTickets * 13.50;
                } else if (nameOfFilm.equals("Bohemian Rhapsody")) {
                    prize = numberOfTickets * 12.75;
                } else if (nameOfFilm.equals("Green Book")) {
                    prize = numberOfTickets * 13.25;
                } else if (nameOfFilm.equals("The Favourite")) {
                    prize = numberOfTickets * 13.95;
                }
                break;
        }
        if(((nameOfFilm.equals("A Star Is Born"))||(nameOfFilm.equals("Bohemian Rhapsody"))||
                (nameOfFilm.equals("Green Book"))||(nameOfFilm.equals("The Favourite"))) &&
            ((typeofHall. equals("normal")) || (typeofHall.equals("luxury"))||(typeofHall.equals("ultra luxury")))){
            System.out.printf("%s -> %.2f lv.", nameOfFilm,prize);
        }
    }
}

