import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UserLogs_SecondDecision_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
             // userName  ip    countMessages
        Map<String, Map<String,Integer>> userInfo = new TreeMap<>();
        String input = scan.nextLine();

        while (!input.equals("end")) {
            String [] tokens = input.split("\\s+");
            String ip = tokens[0].split("=")[1];
            String userName = tokens[2].split("=")[1];

            // putIfAbsent замества проверката (!userInfo.containsKey(userName)) - ако го няма ключа го постави
            // и инициализирай нов мап

            userInfo.putIfAbsent(userName,new LinkedHashMap<>());
            userInfo.get(userName).putIfAbsent(ip, 0);
            userInfo.get(userName).put(ip,userInfo.get(userName).get(ip) + 1);
            input = scan.nextLine();
        }

        for(Map.Entry<String, Map<String,Integer>> entry:userInfo.entrySet()) {
            System.out.println(entry.getKey() + ":");
            Map<String, Integer> innerMap = entry.getValue();
            StringBuilder stringBuilder = new StringBuilder();
            for(Map.Entry<String,Integer> innerEntry :innerMap.entrySet()) {
                String ipInfo = String.format("%s => %d", innerEntry.getKey(),innerEntry.getValue());
                stringBuilder.append(ipInfo).append(", ");
            }
            String result = stringBuilder.substring(0,stringBuilder.length() - 2);
            System.out.println(result + ".");
        }

    }
}
