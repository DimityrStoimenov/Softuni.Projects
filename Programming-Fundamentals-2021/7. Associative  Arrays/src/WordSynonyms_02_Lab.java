import java.util.*;

public class WordSynonyms_02_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        LinkedHashMap<String, List<String>> synonyms = new LinkedHashMap<>();

        for (int i = 0; i < n ; i++) {
            String word = scan.nextLine();
            String synonym = scan.nextLine();
            if(!synonyms.containsKey(word)) {
                synonyms.putIfAbsent(word,new ArrayList<>());
                synonyms.get(word).add(synonym);
            } else {
                synonyms.get(word).add(synonym);
            }
        }
        for (Map.Entry<String, List<String>> entry : synonyms.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(), entry.getValue().toString().
                    replaceAll("[\\[\\]]",""));
        }
    }
}
