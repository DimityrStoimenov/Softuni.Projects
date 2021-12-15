
import java.util.Scanner;
import java.util.TreeSet;

public class SoftUniParty_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeSet<String> vipInvitedGuests = new TreeSet<>();
        TreeSet<String> regularInvitedGuests = new TreeSet<>();
        String input = scan.nextLine();
        while (!input.equals("PARTY")) {
            String typeOfGuest = input;
            if (Character.isDigit(typeOfGuest.charAt(0))) {
               vipInvitedGuests.add(typeOfGuest);
            } else {
                regularInvitedGuests.add(typeOfGuest);
            }
            input = scan.nextLine();
        }
        input = scan.nextLine();
        while (!input.equals("END")) {
            String onParty = input;
            if(vipInvitedGuests.contains(onParty)) {
                vipInvitedGuests.remove(onParty);
            } else  {
                regularInvitedGuests.remove(onParty);
            }
            input = scan.nextLine();
        }
        int totalSize = vipInvitedGuests.size() + regularInvitedGuests.size();
        System.out.println(totalSize);
        for (String vipInvitedGuest : vipInvitedGuests) {
            System.out.println(vipInvitedGuest);
        }
        for (String regularInvitedGuest : regularInvitedGuests) {
            System.out.println(regularInvitedGuest);
        }
    }
}
