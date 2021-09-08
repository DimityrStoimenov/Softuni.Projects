import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race_02_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> participants = Arrays.stream(scan.nextLine().split(", ")).collect(Collectors.toList());
        String digits = "\\d";
        String symbolsCreateName = "[A-Za-z]";
        String input = scan.nextLine();
        LinkedHashMap<String, Integer> race = new LinkedHashMap<>();
        while (!input.equals("end of race")) {
            String currentText = input;
            Pattern patternName = Pattern.compile(symbolsCreateName);
            Matcher matcherName = patternName.matcher(currentText);
            StringBuilder builder = new StringBuilder();
            while (matcherName.find()) {
             builder.append(matcherName.group());
            }
            if (participants.contains(builder.toString())) {
                race.putIfAbsent(builder.toString(),0);
                int km = race.get(builder.toString());
                Pattern patternKm = Pattern.compile(digits);
                Matcher matcherKm = patternKm.matcher(currentText);
                while (matcherKm.find()) {
                    km += Integer.parseInt(matcherKm.group());
                }
                race.put(builder.toString(),km);

            }
            input = scan.nextLine();
        }
        List <String> list = new ArrayList<>();
        list.add("1st place: ");
        list.add("2nd place: ");
        list.add("3rd place: ");
        race
                .entrySet()
                .stream()
                .sorted((a,b) -> b.getValue().compareTo(a.getValue()))
                .limit(3)
                .forEach(e -> System.out.println(list.remove(0) + e.getKey()));

    }
}


