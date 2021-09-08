import java.util.Scanner;

public class Grades_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfStudents= Integer.parseInt(scan.nextLine());
        double sum=0;
        double average=0;
        int count = 0;
        int countOne =0;
        int countTwo = 0;
        int countThree = 0;
        int countFour = 0;
        for (int i = 0; i <numberOfStudents; i++) {
            double grade= Double.parseDouble(scan.nextLine());
            sum+= grade;
            count++;
            if(grade>=2.00 && grade <3.00) {
                countOne++;
            } else if(grade >= 3.00 && grade <= 3.99) {
                countTwo++;
            } else if(grade >= 4.00 && grade <= 4.99) {
                countThree++;
            } else if(grade >= 5 && grade <=6.00) {
                countFour++;
            }

        }
        double topStudents = (countFour * 1.0 / count) * 100;
        System.out.printf("Top students: %.2f%%%n",topStudents);
        double averageStudents = (countThree *1.0 / count) * 100;
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", averageStudents);
        double weakStudents= (countTwo * 1.0 /count) * 100;
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", weakStudents);
        double failedStudents= (countOne * 1.0 / count) * 100;
        System.out.printf("Fail: %.2f%%%n", failedStudents);
        average = sum * 1.0 / count;
        System.out.printf("Average: %.2f",average);
    }
}
