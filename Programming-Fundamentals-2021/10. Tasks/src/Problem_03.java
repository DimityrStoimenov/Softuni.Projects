import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Map<String, Person> users = new LinkedHashMap<>();
        while (!input.equals("Log out")) {
            String [] tokens = input.split(":\\s+");
            String command = tokens[0];
            String userName = tokens[1];
            switch(command) {
                case "New follower":
                    if (!users.containsKey(userName)) {
                        int likes = 0;
                        int comments = 0;
                        Person newPerson = new Person(likes,comments);
                        users.put(userName,  newPerson);
                    }
                    break;
                case "Like":
                    int comment = 0;
                    int countLikes = Integer.parseInt(tokens[2]);
                    if(!users.containsKey(userName)) {
                        Person newPerson = new Person(countLikes,comment);
                        users.put(userName, newPerson);
                    } else {
                        int increaseLikes = users.get(userName).getLikes() + countLikes;
                        users.get(userName).setLikes(increaseLikes);
                    }
                    break;
                case "Comment":
                    if (!users.containsKey(userName)) {
                        int likes = 0;
                        int comments = 1;
                        Person newPerson = new Person(likes,comments);
                        users.put(userName, newPerson);
                    } else {
                        int increaseComments = users.get(userName).getComments() + 1;
                        users.get(userName).setComments(increaseComments);
                    }
                    break;
                case "Blocked":
                    if (users.containsKey(userName)) {
                        users.remove(userName);
                    } else {
                        System.out.printf("%s doesn't exist.%n", userName);
                    }
                    break;
            }
            input = scan.nextLine();
        }
        Map <String, Integer > printUsers = new LinkedHashMap<>();
        int sum = 0;
        for (Map.Entry<String, Person> entry : users.entrySet()) {
            sum = 0;
            String user =  entry.getKey();
            sum = entry.getValue().getLikes() + entry.getValue().getComments();
            printUsers.put(user,sum);
        }
        System.out.printf("%d followers%n", printUsers.size());
        printUsers.entrySet().stream().sorted((a,b) ->{
            int result = b.getValue() - a.getValue();
            if (result == 0) {
                return a.getKey().compareTo(b.getKey());
            }
            return result;
        }).forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(),entry.getValue()));
    }
}
class Person{
    private int likes;
    private int comments;

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public Person (int likes, int comments) {
        this.likes = likes;
        this.comments = comments;
    }
}
