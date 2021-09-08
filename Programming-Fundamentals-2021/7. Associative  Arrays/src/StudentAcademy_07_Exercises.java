import java.util.*;

public class StudentAcademy_07_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, List<Double>> students = new LinkedHashMap<>();
        int numberOfInputs = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < numberOfInputs ; i++) {
            String studentName = scan.nextLine();
            double studentMark = Double.parseDouble(scan.nextLine());
            if(!students.containsKey(studentName)) {
                students.put(studentName, new ArrayList<>());
                students.get(studentName).add(studentMark);
            } else {
                students.get(studentName).add(studentMark);
            }
        }
       LinkedHashMap<String, Double> averageMarks = new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry : students.entrySet()) {
            double average = entry.getValue().stream().mapToDouble(Double::doubleValue).average().orElse(0.00);
            if( average >= 4.50) {
                averageMarks.put(entry.getKey(), average);
            }
        }
        averageMarks
                .entrySet()
                .stream()
                .sorted((a,b) -> b.getValue().compareTo(a.getValue())).
                forEach(e -> System.out.printf("%s -> %.2f%n", e.getKey(),e.getValue()));
    }
}
