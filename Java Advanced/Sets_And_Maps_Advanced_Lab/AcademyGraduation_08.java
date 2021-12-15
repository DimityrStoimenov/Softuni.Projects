import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;

public class AcademyGraduation_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Double[]> students = new TreeMap<>();
        int studentCounter = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < studentCounter; i++) {
            String name = scan.nextLine();
            String [] scores = scan.nextLine().split("\\s+");
            Double [] grades = new Double [scores.length];
            for (int j = 0; j < scores.length; j++) {
                grades[j] = Double.parseDouble(scores[j]);
            }

            if(!students.containsKey(name)) {
                students.put(name,grades);
            }
        }
        for (Map.Entry<String, Double[]> entry : students.entrySet()) {
            DecimalFormat decimalFormat = new DecimalFormat("#.##########################");
            String name = entry.getKey();
            double sum = 0;
            for (int i = 0; i < entry.getValue().length; i++) {
               sum += entry.getValue()[i];
            }
            double average = sum / entry.getValue().length;


            System.out.printf("%s is graduated with %s%n", name, decimalFormat.format(average));
        }
    }
}
