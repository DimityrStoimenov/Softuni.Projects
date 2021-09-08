import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat_08_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String namesInput = scan.nextLine();
        List<String> names = Arrays.stream(namesInput.split("\\s+")).collect(Collectors.toList());
        String command = scan.nextLine();
         while (!command.equals("3:1")) {
             String [] commandData = command.split("\\s+");
             String commandName = commandData[0];
             if ( commandName.equals("merge")) {
                int startIndex = Integer.parseInt(commandData[1]);
                int endIndex = Integer.parseInt(commandData[2]);
                if( endIndex > names.size() -1) {
                    endIndex = names.size() -1;
                }
                if ( startIndex < 0) {
                    startIndex = 0;
                }
                // проверка за индексите
                 boolean isStartIndexValid = isValidIndex(startIndex, names.size());
                 boolean isEndIndexValid = isValidIndex(endIndex, names.size());
                    if (isEndIndexValid && isStartIndexValid) {
                        // {abc, def, ghi} -> merge 0 1 -> {abcdef, ghi}
                        StringBuilder build = new StringBuilder();
                        for (int i = startIndex; i <= endIndex; i++) {
                            build.append(names.get(i));
                        }
                        for (int i = startIndex; i <= endIndex; i++) {
                            names.remove(startIndex);
                        }

                        names.add(startIndex, build.toString());
                    }
             } else if (commandName.equals("divide")) {
                int index = Integer.parseInt(commandData[1]);
                int partitions = Integer.parseInt(commandData[2]);
                String elementOfDivide = names.get(index);
                names.remove(index);
                // abcdef -> 6 (length) / 3(partitions) = 2
                int partSize = elementOfDivide.length() / partitions;
                int begin = 0;

                 for (int i = 1; i < partitions; i++) {
                     names.add(index, elementOfDivide.substring(begin,begin + partSize));
                     index++;
                     begin += partSize;
                 }
                 names.add(index, elementOfDivide.substring(begin));



             }
             command = scan.nextLine();
         }
        System.out.println(String.join(" ", names));
         
     }

    private static boolean isValidIndex(int index, int size) {

        return index >= 0 && index <= size - 1;
    }
}
