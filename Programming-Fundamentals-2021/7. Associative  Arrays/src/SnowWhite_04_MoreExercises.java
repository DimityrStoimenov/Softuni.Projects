import java.util.LinkedHashMap;
import java.util.Scanner;

public class SnowWhite_04_MoreExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, Integer> dwarfs = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> colorHats = new LinkedHashMap<>();
        String input = scan.nextLine();
        while (!input.equals("Once upon a time")) {
            String [] databaseOfDwarfs = input.split (" <:> ");
            String dwarfName = databaseOfDwarfs[1] + " " + databaseOfDwarfs[0];
            String colorHat = databaseOfDwarfs[1];
            int physics = Integer.parseInt(databaseOfDwarfs[2]);
            colorHats.putIfAbsent(colorHat, 0);
            colorHats.put(colorHat, colorHats.get(colorHat) + 1);

            if (dwarfs.containsKey(dwarfName)) {
                if (dwarfs.get(dwarfName) < physics) {
                    dwarfs.put(dwarfName, physics);
                    colorHats.put(colorHat, colorHats.get(colorHat) - 1);
                }
            }else {
                dwarfs.put(dwarfName,physics);
            }
            input = scan.nextLine();
        }
        dwarfs
                .entrySet()
                .stream()
                .sorted((a,b) -> {
                    int result = Integer.compare(b.getValue(),a.getValue());
                    if (result == 0) {
                        String [] colorOne = a.getKey().split(" ");
                        String [] colorTwo = b.getKey().split(" ");
                        int indexOfColorOne = colorHats.get(colorOne[0]);
                        int indexOfColorTwo = colorHats.get(colorTwo[0]);
                        result = Integer.compare(indexOfColorTwo,indexOfColorOne);
                    }
                    return result;
                }).forEach(entry -> {
                    String [] printResult = entry.getKey().split(" ");
            System.out.printf("(%s) %s <-> %d%n", printResult[0], printResult[1], entry.getValue());
        });
    }
}
