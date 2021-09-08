import java.util.Scanner;

public class OldLibrary_DecisionDesi_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String searchedBook = scan.nextLine(); // книгата , която търсим
        int countBooks = Integer.parseInt(scan.nextLine()); //  брой книги които имаме в библиотеката (нейният капацитет)
        int countCheckedBooks=0;
        //Стоп: -> ако намерим книгата
        // Стоп: -> броят на книгите == 0( иначе казано, проверили сме всички книги и не сме намерили търсената (searchedBook)
        while(countBooks > 0) {
            String title= scan.nextLine();
            if(title.equals(searchedBook)) {
                System.out.printf("You checked %d books and found it.",countCheckedBooks );
                break;
            } else {
                countBooks--;
                countCheckedBooks++;

            }
        }
        if(countBooks == 0) {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.",countCheckedBooks );
        }
    }
}
