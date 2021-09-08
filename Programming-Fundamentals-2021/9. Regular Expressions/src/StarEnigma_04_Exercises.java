import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma_04_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n ; i++) {
          String cryptText = scan.nextLine();
            Pattern key = Pattern.compile("[STARstar]+");
            Matcher matcher = key.matcher(cryptText);
            StringBuilder sb = new StringBuilder();
            StringBuilder builder  = new StringBuilder();
            while (matcher.find()) {
              sb.append(matcher.group());
            }
            int count = sb.length();
            for (int j = 0; j <= cryptText.length() - 1 ; j++) {
                int value =(int) cryptText.charAt(j) - count;
                builder.append((char)value);

            }
            list.add(builder.toString());
        }
        String regex = "@(?<planet>[A-Z][a-z]+)[^@\\-!:>]*:(?<population>\\d+)[^@\\-!:>]*!(?<typeOfAttack>[A-D])![^@\\-!:>]*->(?<soldierCount>[0-9]+)";
        Map<String, List<String>> planets = new LinkedHashMap<>();
        planets.put("A", new ArrayList<>());
        planets.put("D", new ArrayList<>());
        for (String s : list) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(s);
            if (matcher.find()) {
                String typeofAttack = matcher.group("typeOfAttack");
                String planet = matcher.group("planet");
                planets.get(typeofAttack).add(planet);
            }
        }
        planets
                .entrySet()
                .forEach(entry -> {
                    String result = "";
                    if(entry.getKey().equals("A")) {
                     result = "Attacked planets: ";
                    } else {
                        result = "Destroyed planets: ";
                    }
                    System.out.println(result + entry.getValue().size());
                    entry.getValue().stream().sorted().forEach(i -> System.out.println("-> " + i));
                });
    }
}


