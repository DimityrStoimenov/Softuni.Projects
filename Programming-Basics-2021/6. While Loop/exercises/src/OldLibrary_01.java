import java.util.Scanner;

public class OldLibrary_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String bookName= scan.nextLine(); //
        int libraryCapacity = Integer.parseInt(scan.nextLine());// капацитет на библиотеката
        String currentBook= "";
        int count=0;
        boolean isFound= false;
        while (!isFound && libraryCapacity > count) {
            currentBook= scan.nextLine();
            if(currentBook.equals(bookName)) {
                isFound= true;
            } else {
                count++;
            }
        }
        if(isFound) {
            System.out.printf("You checked %d books and found it.",count);
        } else {
            System.out.printf("The book you search is not here!%n");
            System.out.printf("You checked %d books.", count);
        }
    }
}
