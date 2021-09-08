import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class ThePianist_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Pianist> pianists = new ArrayList<>();
        int numberOfPieces = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < numberOfPieces; i++) {
            String piece = scan.nextLine();
            String [] databaseOfPiece = piece.split("\\|");
            String masterPiece = databaseOfPiece[0];
            String composer = databaseOfPiece[1];
            String key = databaseOfPiece[2];
            Pianist newPianist = new Pianist(masterPiece,composer,key);
            pianists.add(newPianist);

        }
        String input = scan.nextLine();
        while (!input.equals("Stop")) {
            //•	Add|{piece}|{composer}|{key}
            //•	Remove|{piece}
            //•	ChangeKey|{piece}|{new key}
            String [] tokens = input.split("\\|");
            String command = tokens[0];
            String piece = tokens[1];
            switch(command) {
                case "Add":
                    String composer = tokens[2];
                    String key = tokens[3];
                    boolean isInTheCollection = false;
                    for (int i = 0; i <= pianists.size() - 1 ; i++) {
                      if (pianists.get(i).getPiece().equals(piece)) {
                          System.out.printf("%s is already in the collection!%n", piece);
                          isInTheCollection = true;
                          break;
                      } else {
                          isInTheCollection = false;
                      }
                    }
                    if (!isInTheCollection) {
                        Pianist newPianist = new Pianist(piece,composer,key);
                        pianists.add(newPianist);
                        System.out.printf("%s by %s in %s added to the collection!%n",piece,composer,key);
                    }
                    break;
                case "Remove":
                    boolean pieceIsNotInTheCollection = true;
                    for (int i = 0; i <= pianists.size() - 1 ; i++) {
                     if (pianists.get(i).getPiece().equals(piece)) {
                         pianists.remove(pianists.get(i));
                         System.out.printf("Successfully removed %s!%n", piece);
                         pieceIsNotInTheCollection = false;
                         break;
                     } else {
                         pieceIsNotInTheCollection = true;
                     }
                    }
                    if (pieceIsNotInTheCollection) {
                      System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }
                    break;
                case "ChangeKey":
                String newKey = tokens[2];
                boolean keyIsInTheCollection = false;
                    for (int i = 0; i <= pianists.size() - 1 ; i++) {
                    if(pianists.get(i).getPiece().equals(piece)) {
                        pianists.get(i).setKey(newKey);
                        System.out.printf("Changed the key of %s to %s!%n", piece, newKey);
                        keyIsInTheCollection = true;
                        break;
                    } else {
                        keyIsInTheCollection = false;
                    }
                    }
                    if (!keyIsInTheCollection) {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }
                    break;
            }
            input  = scan.nextLine();

        }
        pianists.stream().sorted(Comparator.comparing(Pianist::getPiece).thenComparing(Pianist::getComposer)).
                forEach(entry -> System.out.printf("%s -> Composer: %s, Key: %s%n",
                        entry.getPiece(),entry.getComposer(),entry.getKey()));

    }
}
class Pianist {
    private String piece;
    private String composer;
    private String key;

    public String getPiece() {
        return piece;
    }

    public String getComposer() {
        return composer;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Pianist(String piece, String composer, String key) {
        this.piece = piece;
        this.composer = composer;
        this.key= key;
    }
}
