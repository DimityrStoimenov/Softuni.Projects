import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory_09_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lengthDNA = Integer.parseInt(scan.nextLine());
        String command = scan.nextLine();
        int lineCount = 0;
        int bestStartIndex = Integer.MAX_VALUE;
        int[] bestLine = new int[lengthDNA];
        int bestLineNum = 0;
        int bestOnes = 0;
        int bestSum = 0;
        int sum = 0;
        while (!command.equals("Clone them!")) {
            int[] currentLine = Arrays.stream(command.split("!+")).mapToInt(Integer::parseInt).toArray();
            lineCount++; //  актуализация номера на текущия ред
            int longestOnesInARow = 0; // поредица от 1-ци на текущия ред
            int startIndex = Integer.MAX_VALUE;
             for (int i = 0; i < currentLine.length; i++) {
                int onesInARow = 0;
                for (int j = i; j < currentLine.length; j++) {
                    if (currentLine[i] == currentLine[j] && currentLine[i] == 1) {
                        onesInARow++;
                        if (onesInARow > longestOnesInARow) {
                            longestOnesInARow = onesInARow;
                            startIndex = i; // индекс на единиците на текущия ред
                        }
                    } else {
                        break;
                    }
                }
            }
            if(longestOnesInARow > bestOnes) {
                bestOnes = longestOnesInARow;
                // ъпдейтвам най - добрата последователност от единици от всички редове до момента
                bestLine = currentLine;
                bestLineNum = lineCount;
                bestStartIndex = startIndex; // най - добрия индекс 1- ци
            } else if (longestOnesInARow == bestOnes) {
                if (startIndex < bestStartIndex) {
                    bestLine = currentLine;
                    bestLineNum = lineCount;
                    bestStartIndex = startIndex;
                } if (startIndex == bestStartIndex) {
                    // при равни последователни единици и индекси, проверявам сумите на текущия
                    // и най-добрия до момента ред
                    for (int j : bestLine) {
                        bestSum += j;
                    }
                    for (int j : currentLine) {
                        sum += j;
                    }
                    if(sum > bestSum) {
                    bestLine = currentLine;
                    bestLineNum = lineCount;
                    bestSum = sum;
                    }
                }
            }
            command = scan.nextLine();
        }
        bestSum = 0; // да се избегне ред с по-голяма сума , но по-лоша последователност
        for (int j : bestLine) {
            bestSum += j;
        }
        // проверка за нулеви редове
        if(bestSum == 0) {
            bestLineNum = 1;
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n",bestLineNum,bestSum);
        for (int j : bestLine) {
            System.out.print(j + " ");
        }
    }
}
