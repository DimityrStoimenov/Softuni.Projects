

public class testDebbuger {
    public static void main(String[] args) {

        String animal= "cat";
        if(animal.equals("dog")) {
            System.out.println("bark");
        } else if(animal.equals("cat")){
            System.out.println("meow");
        } else if (animal.equals("cow")) {
            System.out.println("moo");
        } else {
            System.out.println("Unknown");
        }
    }
}

