import java.util.*;
import java.util.stream.Collectors;

public class AverageStudentsGrades_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfStudents = Integer.parseInt(scan.nextLine());
        Map<String, List<Double>> students = new TreeMap<>();
        for (int i = 0; i < countOfStudents; i++) {
            String [] tokens = scan.nextLine().split("\\s+");
            String name = tokens[0];
            double grade = Double.parseDouble(tokens[1]);
            if(students.containsKey(name)) {
               students.get(name).add(grade);
            } else {
                students.put(name,new ArrayList<>());
                students.get(name).add(grade);
            }
        }

        students.entrySet()
                .stream()
                .forEach(entry -> {
                    double sum = 0;
                    for (int i = 0; i < entry.getValue().size(); i++) {
                        sum += entry.getValue().get(i);
                    }
                    double avgSum = sum / entry.getValue().size();

                    System.out.print(entry.getKey() + " -> ");
                    entry.getValue().forEach(e -> System.out.printf("%.2f ", e));
                    System.out.printf("(avg: %.2f)%n", avgSum);
                });
    }
}
