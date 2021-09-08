import java.util.*;
import java.util.stream.Collectors;

public class OddOccurrences_03_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> list = Arrays.stream(scan.nextLine().split("\\s+")).collect(Collectors.toList());
        LinkedHashMap<String, List<Integer>> elements = new LinkedHashMap<>();
        for (String element : list) {
            String currentElement = element.toLowerCase();
            if (!elements.containsKey(currentElement)) {
                elements.putIfAbsent(currentElement, new ArrayList<>());
                elements.get(currentElement).add(1);
            } else {
                elements.get(currentElement).add(1);
            }
        }
        List<String > oddOccurrences = new ArrayList<>();
        for (Map.Entry<String, List<Integer>> entry : elements.entrySet()) {
            if(entry.getValue().size() % 2 == 1) {
                oddOccurrences.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ",oddOccurrences));
    }
}

