import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning_10_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> programme = Arrays.stream(scan.nextLine().split(", ")).collect(Collectors.toList());
         String input = scan.nextLine();
         while (!input.equals("course start")) {
             String [] commandData = input.split(":");
             String command = commandData[0];
             String lecture;
             switch (command) {
                 case "Add":
                     lecture = commandData[1];
                     if(!programme.contains(lecture)) {
                         programme.add(lecture);
                     }
                     break;
                 case "Insert":
                     lecture = commandData[1];
                     int index = Integer.parseInt(commandData[2]);
                     if(index >= 0 && index <= programme.size() -1) {
                         if(!programme.contains(lecture))
                             programme.add(index,lecture);

                     }
                     break;
                 case "Remove":
                     lecture = commandData[1] + "-Exercise";
                         programme.remove(commandData[1]);
                         programme.remove(lecture);
                     break;
                 case "Swap":
                     String indexOne = commandData[1] + "-Exercise";
                     String indexTwo = commandData[2] + "-Exercise";
                     if(programme.contains(commandData[1])&& programme.contains(commandData[2])) {
                     String elementOne = commandData[1];
                     int firstIndex = programme.indexOf(commandData[1]);
                     String elementTwo = commandData[2];
                     int secondIndex = programme.indexOf(commandData[2]);
                     programme.set(firstIndex, elementTwo);
                     programme.set(secondIndex,elementOne);
                     if (programme.contains(indexOne)) {
                         programme.remove(programme.indexOf(indexOne));
                         programme.add(programme.indexOf(commandData[1]) + 1,indexOne);
                     }
                     if(programme.contains(indexTwo)) {
                         programme.remove(programme.indexOf(indexTwo));
                         programme.add(programme.indexOf(commandData[2]) + 1, indexTwo);
                     }
                 }
                     break;
                 case "Exercise":
                     lecture = commandData[1] + "-Exercise";
                     if(!programme.contains(commandData[1])) {
                         programme.add(commandData[1]);
                         programme.add(lecture);
                     } else if (programme.contains(commandData[1]) && !programme.contains(lecture)) {
                         int indexOfExercise = programme.indexOf(commandData[1]);
                         programme.add(indexOfExercise + 1,lecture);
                     }
                     break;
             }
             input= scan.nextLine();
         }
        for (int i = 0; i <= programme.size() - 1; i++) {
            System.out.printf("%d.%s%n",i + 1,programme.get(i));

        }
    }
}
