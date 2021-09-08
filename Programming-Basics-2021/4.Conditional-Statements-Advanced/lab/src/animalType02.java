import java.util.Scanner;

public class animalType02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String animalType = scan.nextLine();

        switch(animalType){
            case "dog":
                System.out.println("mammal");
                break;
            case "crocodile":
            case "tortoise":
            case "snake":
                System.out.println("reptile");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }
}
