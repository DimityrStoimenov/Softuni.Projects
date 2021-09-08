import java.util.*;

public class Courses_06_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, List<String>> programmingSchedule = new LinkedHashMap<>();
        String input = scan.nextLine();
        while (!input.equals("end")) {
            String [] databaseOfCourse = input.split("\\s+:\\s+");
            String nameOfCourse = databaseOfCourse[0];
            String studentName = databaseOfCourse[1];
            if (!programmingSchedule.containsKey(nameOfCourse)) {
                programmingSchedule.put(nameOfCourse, new ArrayList<>());
                programmingSchedule.get(nameOfCourse).add(studentName);
            } else {
                programmingSchedule.get(nameOfCourse).add(studentName);
            }
            input = scan.nextLine();
        }
        programmingSchedule
                .entrySet()
                .stream()
                .sorted((a,b) ->b.getValue().size() - a.getValue().size()
                ).forEach(entry -> {
            System.out.printf("%s: %d%n", entry.getKey().trim(), entry.getValue().size());
            entry.getValue().stream().sorted(String::compareTo).forEach(e -> System.out.printf("-- %s%n", e));
        });
    }
}