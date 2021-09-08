import java.util.Scanner;

public class TrainTheTrainers_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int juryCount = Integer.parseInt(scan.nextLine());// брой на участниците в журито
        double allParticipantsAverageMark = 0; //средната оценка на всички участници по всички презентации
        int ParticipantsCounter = 0; // равим го защото не знаем какъв е броятна презентациите
        while (true) {
            String input = scan.nextLine(); // име на презентацията
            if (input.equals("Finish")) {
                break;
            }
            ParticipantsCounter++; // за всяка презентация , различна от "Finish",  с този каунтър преминаваме към следващата презентация
            // така този каунтър събира броя на презентациите
            String presentationName = input; // ако input не е "Finish",  то ще е име на презентацията
            // и затова в този стринг ще държим името на презентацията
            double averageMark = 0;  // променлива в която ще пресмятаме средната стойност на оценките от една презентация
            for (int i = 0; i < juryCount; i++) {
                double mark = Double.parseDouble(scan.nextLine()); // оценките които ще четем от козолата
                averageMark += mark;
            }
            averageMark /= juryCount;
            allParticipantsAverageMark += averageMark; // добавяме средната оценка от всяка презентация и получаваме срената оценка на
            // всички участници от всички презентации
            System.out.printf("%s - %.2f.%n", presentationName, averageMark);
        }
        allParticipantsAverageMark /= ParticipantsCounter; // разделяме средната оценка на всички участници от всички презентации
        // на броя на презентациите
        System.out.printf("Student's final assessment is %.2f.",allParticipantsAverageMark); // принтираме го извън цикъла, тъй като ние
        // искаме да разпечатаме средната оценка на всички участници от всички презентации и това става след като променливата вземе
        // сумата от средната оценка на всяка една презентация (averageMark) и тази сума разделим на броя на презентациите(ParticipantsCounter)
    }
}
