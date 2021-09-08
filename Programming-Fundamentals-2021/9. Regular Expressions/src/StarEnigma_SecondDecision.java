import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma_SecondDecision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String,Integer> decryptedMessage = new LinkedHashMap<>();
        Pattern key = Pattern.compile("[STARstar]+");
        for (int i = 0; i < n ; i++) {
            String inputMessage = scan.nextLine();
            Matcher regMessageMatch = key.matcher(inputMessage);
            StringBuilder sb = new StringBuilder();
            while(regMessageMatch.find()) {
                sb.append(regMessageMatch.group());
            }
            int count= sb.toString().length();
            decryptedMessage.put(inputMessage,count);

        }
        Pattern messageReader = Pattern.compile("(?<planet>[A-Z][a-z]+)(?:[^@\\-!:>]*):(?<population>(\\d)+)" +
                "(?:[^@\\-!:>]*)!(?<attack>[AD])!(?:[^@\\-!:>]*)->(?<soldierCount>\\d+)");
        Map<String, List<String>> planets = new LinkedHashMap<>();
        planets.put("A", new ArrayList<>());
        planets.put("D", new ArrayList<>());
        for (Map.Entry<String, Integer> entry : decryptedMessage.entrySet()) {
            StringBuilder decrypted = new StringBuilder();
            String currentMessage = entry.getKey();
            for (int i = 0; i <currentMessage.length(); i++) {
                char currentChar =(char)( currentMessage.charAt(i) - entry.getValue());
                decrypted.append(currentChar);
            }
            Matcher matcher = messageReader.matcher(decrypted);
            if(matcher.find()) {
                String attack = matcher.group("attack");
                String planet = matcher.group("planet");
                planets.get(attack).add(planet);
            }
        }
        planets.entrySet().forEach(pair -> {
            String type = "";
            if(pair.getKey().equals("A")) {
                type = "Attacked planets: ";
            } else {
                type = "Destroyed planets: ";
            }
            System.out.println(type + pair.getValue().size());
            pair.getValue().stream().sorted().forEach(e -> System.out.println("-> "+ e));
        });

    }
}
