import java.util.Scanner;

public class TravelAgency_03_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nameOfTown = scan.nextLine();  // ("Bansko",  "Borovets", "Varna" или "Burgas")
        String typeOfOffer = scan.nextLine(); // ("noEquipment",  "withEquipment", "noBreakfast" или "withBreakfast")
        String vip = scan.nextLine(); //  "yes" или "no"
        double prize = 0;
        int days = Integer.parseInt(scan.nextLine());
        switch (nameOfTown) {
            case "Bansko":
                if (typeOfOffer.equals("noEquipment") && vip.equals("no")) {
                    prize = days * 80;
                    if (days >= 7) {
                        prize -= 80;
                    }
                } else if (typeOfOffer.equals("noEquipment") && vip.equals("yes")) {
                    prize = days * 80;
                    prize = prize - (prize * 0.05);
                    if (days >= 7) {
                        prize -= 80;
                    }
                }
                if (typeOfOffer.equals("withEquipment") && vip.equals("no")) {
                    prize = days * 100;
                    if (days >= 7) {
                        prize -= 100;
                    }
                } else if (typeOfOffer.equals("withEquipment") && vip.equals("yes")) {
                    prize = days * 100;
                    prize = prize - (prize * 0.1);
                    if (days >= 7) {
                        prize -= 100;
                    }
                }
                break;
            case "Borovets":
                if (typeOfOffer.equals("noEquipment") && vip.equals("no")) {
                    prize = days * 80;
                    if (days >= 7) {
                        prize -= 80;
                    }
                } else if (typeOfOffer.equals("noEquipment") && vip.equals("yes")) {
                    prize = days * 80;
                    prize = prize - (prize * 0.05);
                    if (days >= 7) {
                        prize -= 80;
                    }
                }
                if (typeOfOffer.equals("withEquipment") && vip.equals("no")) {
                    prize = days * 100;
                    if (days >= 7) {
                        prize -= 100;
                    }
                } else if (typeOfOffer.equals("withEquipment") && vip.equals("yes")) {
                    prize = days * 100;
                    prize = prize - (prize * 0.1);
                    if (days >= 7) {
                        prize -= 100;
                    }
                }

                break;
            case "Varna":
                if (typeOfOffer.equals("noBreakfast") && vip.equals("no")) {
                    prize = days * 100;
                    if (days >= 7) {
                        prize -= 100;
                    }
                } else if (typeOfOffer.equals("noBreakfast") && vip.equals("yes")) {
                    prize = days * 100;
                    prize = prize - (prize * 0.07);
                    if (days >= 7) {
                        prize -= 100;
                    }
                }
                if (typeOfOffer.equals("withBreakfast") && vip.equals("no")) {
                    prize = days * 130;
                    if (days >= 7) {
                        prize -= 130;
                    }
                } else if (typeOfOffer.equals("withBreakfast") && vip.equals("yes")) {
                    prize = days * 130;
                    prize = prize - (prize * 0.12);
                    if (days >= 7) {
                        prize -= 130;
                    }
                }

                break;
            case "Burgas":
                if (typeOfOffer.equals("noBreakfast") && vip.equals("no")) {
                    prize = days * 100;
                    if (days >= 7) {
                        prize -= 100;
                    }
                } else if (typeOfOffer.equals("noBreakfast") && vip.equals("yes")) {
                    prize = days * 100;
                    prize = prize - (prize * 0.07);
                    if (days >= 7) {
                        prize -= 100;
                    }
                }
                if (typeOfOffer.equals("withBreakfast") && vip.equals("no")) {
                    prize = days * 130;
                    if (days >= 7) {
                        prize -= 130;
                    }
                } else if (typeOfOffer.equals("withBreakfast") && vip.equals("yes")) {
                    prize = days * 130;
                    prize = prize - (prize * 0.12);
                    if (days >= 7) {
                        prize -= 130;
                    }
                }
                break;

        }
        if (((nameOfTown.equals("Bansko")) || (nameOfTown.equals("Borovets")) || (nameOfTown.equals("Varna"))
                || (nameOfTown.equals("Burgas"))) && ((typeOfOffer.equals("noEquipment")) || (typeOfOffer.equals("withEquipment"))
                || (typeOfOffer.equals("noBreakfast")) || (typeOfOffer.equals("withBreakfast"))) && ((vip.equals("no"))
                || vip.equals("yes")) && ( days < 1)) {
            System.out.println("Days must be positive number!");

        } else if (((nameOfTown.equals("Bansko")) || (nameOfTown.equals("Borovets")) || (nameOfTown.equals("Varna"))
                || (nameOfTown.equals("Burgas"))) && ((typeOfOffer.equals("noEquipment")) || (typeOfOffer.equals("withEquipment"))
                || (typeOfOffer.equals("noBreakfast")) || (typeOfOffer.equals("withBreakfast"))) && ((vip.equals("no"))
                || vip.equals("yes")) && ( days < 7)) {
            System.out.printf("The price is %.2flv! Have a nice time!", prize);

        } else if (((nameOfTown.equals("Bansko")) || (nameOfTown.equals("Borovets")) || (nameOfTown.equals("Varna"))
                || (nameOfTown.equals("Burgas"))) && ((typeOfOffer.equals("noEquipment")) || (typeOfOffer.equals("withEquipment"))
                || (typeOfOffer.equals("noBreakfast")) || (typeOfOffer.equals("withBreakfast"))) && ((vip.equals("no"))
                || vip.equals("yes")) && (days >= 7)) {
            System.out.printf("The price is %.2flv! Have a nice time!", prize);
        } else if((!nameOfTown.equals("Bansko"))|| (!nameOfTown.equals("Borovets"))) {
            System.out.println("Invalid input!");
        }else if (!typeOfOffer.equals("noEquipment") ||(!typeOfOffer.equals("withEquipment"))) {
            System.out.println("Invalid input!");

        } else if ((!nameOfTown.equals("Burgas")) ||  (!nameOfTown.equals("Varna")))  {
            System.out.println("Invalid input!");
        } else if((!typeOfOffer.equals("withBreakfast")) ||(!typeOfOffer.equals("noBreakfast"))) {
            System.out.println("Invalid input!");
        }
    }
}

