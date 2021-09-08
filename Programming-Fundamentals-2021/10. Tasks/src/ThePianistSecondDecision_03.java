import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ThePianistSecondDecision_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Pianists> pianists = new TreeMap<>();
        int numberOfPianists = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < numberOfPianists; i++) {
            String pianist = scan.nextLine();
            String [] pianistDatabase = pianist.split("\\|");
            String piece = pianistDatabase[0];
            String composer = pianistDatabase[1];
            String key = pianistDatabase[2];
            Pianists newPianist = new Pianists (composer,key);
            pianists.put(piece,newPianist);
        }
        String input = scan.nextLine();
        while (!input.equals("Stop")) {
            String [] tokens = input.split("\\|");
            String command = tokens[0];
            String piece = tokens[1];
            switch(command) {
                case "Add":
                    String composer = tokens[2];
                    String key = tokens[3];
                    if (pianists.containsKey(piece)) {
                        System.out.printf("%s is already in the collection!%n", piece);
                    } else {
                        Pianists currentPianist = new Pianists(composer,key);
                        pianists.put(piece,currentPianist);
                        System.out.printf("%s by %s in %s added to the collection!%n",
                                piece,composer,key);
                    }
                    break;
                case "Remove":
                    if (pianists.containsKey(piece)) {
                        pianists.remove(piece);
                        System.out.printf("Successfully removed %s!%n", piece);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }
                    break;
                case "ChangeKey":
                    String newKey = tokens[2];
                    if (pianists.containsKey(piece)){
                        pianists.get(piece).setKey(newKey);
                        System.out.printf("Changed the key of %s to %s!%n", piece,newKey);
                    } else {
                       System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }
                    break;
            }
            input = scan.nextLine();
        }
        for (Map.Entry<String, Pianists> entry : pianists.entrySet()) {
           System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(),entry.getValue().getComposer(),
                   entry.getValue().getKey());
        }
    }
}
class Pianists {

    private String composer;
    private String key;

    public String getComposer() {
        return composer;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Pianists ( String composer, String key) {
        this.composer = composer;
        this.key = key;
    }
}
