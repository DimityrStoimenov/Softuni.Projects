import java.util.Scanner;

public class ExamPreparation_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberBadMarks= Integer.parseInt(scan.nextLine());
        int badMarksCount= 0;
        int solvedProblemsCount=0;
        double sumMarks=0;
        String lastProblem= "";
        boolean isFailed= true;
         while(badMarksCount<numberBadMarks) {
             String problemName= scan.nextLine();
             if("Enough".equals(problemName)) {
                 isFailed= false;
                 break;
             }
            int mark= Integer.parseInt(scan.nextLine());
             if( mark <= 4) {
                 badMarksCount++;
             }
             sumMarks+= mark;
             solvedProblemsCount++;
             lastProblem= problemName;
         }
         if(isFailed) {
             System.out.printf("You need a break, %d poor grades.", numberBadMarks);
         } else {
             System.out.printf("Average score: %.2f%n", sumMarks / solvedProblemsCount);
             System.out.printf("Number of problems: %d%n ", solvedProblemsCount);
             System.out.printf("Last problem: %s", lastProblem);
         }
    }
}
