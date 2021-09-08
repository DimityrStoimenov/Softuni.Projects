import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ranking_01_MoreExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, String> courses = new LinkedHashMap<>();
       TreeMap<String, LinkedHashMap<String, Integer>> users = new TreeMap<>();
        String input = scan.nextLine();
        while (!input.equals("end of contests")) {
            String[] courseValidation = input.split(":");
            String course = courseValidation[0];
            String coursePassword = courseValidation[1];
            if (!courses.containsKey(course)) {
                courses.put(course, coursePassword);
            } else {
                courses.put(course, courses.get(course) + coursePassword);
            }
            input = scan.nextLine();
        }
        input = scan.nextLine();
        while (!input.equals("end of submissions")) {
            String[] databaseOFCourses = input.split("=>");
            String nameOfCourse = databaseOFCourses[0];
            String passwordOfCourse = databaseOFCourses[1];
            for (Map.Entry<String, String> entry : courses.entrySet()) {
                String currentCourse = entry.getKey();
                if (currentCourse.equals(nameOfCourse)) {
                    if (courses.get(nameOfCourse).contains(passwordOfCourse)) {
                        String userName = databaseOFCourses[2];
                        int pointsOfUSer = Integer.parseInt(databaseOFCourses[3]);
                        if (!users.containsKey(userName)) {
                            users.put(userName, new LinkedHashMap<>());
                        }

                        if (users.containsKey(userName) && users.get(userName).containsKey(nameOfCourse)) {
                            if (users.get(userName).get(nameOfCourse) < pointsOfUSer) {

                                users.get(userName).put(nameOfCourse, pointsOfUSer);
                            }
                        } else if (users.containsKey(userName) && (!users.get(userName).containsKey(nameOfCourse))) {
                            users.get(userName).put(nameOfCourse, pointsOfUSer);
                        }
                    }
                }
            }
            input = scan.nextLine();
        }
            int currentSum = 0;
            String winner = " ";
        for (Map.Entry<String, LinkedHashMap<String, Integer>> student : users.entrySet()) {
           int sum = student.getValue().values().stream().mapToInt(Integer::intValue).sum();
           if (sum  > currentSum) {
               currentSum = sum;
               winner = student.getKey();
        }
        }
        System.out.printf("Best candidate is %s with total %d points.%n", winner,currentSum);

            System.out.println("Ranking:");
       users
               .entrySet()
               .stream()
               .sorted(Map.Entry.comparingByKey())
               .forEach(entry -> {
                   System.out.printf("%s%n", entry.getKey());
                   entry.getValue()
                           .entrySet()
                           .stream()
                           .sorted((a,b) -> {
                               int result = b.getValue().compareTo(a.getValue());
                               if(result == 0) {
                                   return a.getKey().compareTo(b.getKey());
                               }
                               return result;
                           }). forEach(e -> System.out.printf("#  %s -> %d%n", e.getKey(),e.getValue()));
               });
    }
}


