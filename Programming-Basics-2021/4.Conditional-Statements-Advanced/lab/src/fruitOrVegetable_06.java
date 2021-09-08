import java.util.Scanner;

public class fruitOrVegetable_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        if(name.equals("banana")||name.equals("apple")||name.equals("kiwi")
        || name.equals("cherry")|| name.equals("lemon")||name.equals("grapes")) {
            System.out.println("fruit");
        } else if(name.equals("tomato") || name.equals("cucumber")||name.equals("pepper")||name.equals("carrot")) {
            System.out.println("vegetable");
        }else {
            System.out.println("unknown");
        }
    }
}
