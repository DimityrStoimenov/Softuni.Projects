import java.util.*;

public class CompanyUsers_08_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeMap<String, List<String>> users = new TreeMap<>();
        String input = scan.nextLine();
        while (!input.equals("End")) {
            String [] databaseUsers= input.split("\\s+->\\s+");
            String companyName = databaseUsers[0];
            String userName = databaseUsers[1];
            if (!users.containsKey(companyName)) {
                users.put(companyName,new ArrayList<>());
                users.get(companyName).add(userName);
            } else {
                if (!users.get(companyName).contains(userName)){
                    users.get(companyName).add(userName);
                }
            }
          input = scan.nextLine();
        }
        for (String s : users.keySet()) {
            System.out.printf("%s%n", s);
            for (int i = 0; i < users.get(s).size(); i++) {
                System.out.printf("-- %s%n", users.get(s).get(i));
            }
        }
    }
}
