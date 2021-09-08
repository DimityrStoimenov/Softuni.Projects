import java.util.Scanner;

public class Graduation_Part02_09 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // въвеждаме име на ученика
        String studentName = scan.nextLine();
        // тъй като ще трябва да въвеждаме всичките му оценки от 1 до 12 клас
        // си правим променлива за първи клас- int currentGrade =1;
        int currentGrade = 1;
        double sum = 0; //  променлива в която ще сумираме годишните оценки (mark),
        // и за да получим средната оценка от всички класове, сумата ще я разделим на 12 (averageMark)
        int numberOfRepetitions = 0; // променлива , вкоято си държим колко пъти е повтарял преди да бъде изключен
        // и така програмата ще приключи( за начало е нула за да покажем, че още не е повтарял).
        while (currentGrade <= 12) {
            double mark = Double.parseDouble(scan.nextLine());
            if (mark < 4.00) {
                numberOfRepetitions++; // инкрементация на повтарянето- над continue,
                // защото ако е под него, ние никога няма да можем да отбележим колко пъти  е повтарял класа
                // continue изпраща към проверката и няма да стане инкрементацията.
                if (numberOfRepetitions == 2) {
                    System.out.printf("%s has been excluded at %d grade", studentName, currentGrade);
                    break;

                }
                continue;
            }
            sum = sum + mark;
            currentGrade++; //  с тази инкрементация отиваме в следващия клас

        }
        if (numberOfRepetitions < 2.00) {
            double averageMark = sum / 12;
            System.out.printf("%s graduated. Average grade: %.2f", studentName, averageMark);
        }
    }

}
// 12 е 12 клас
// въвеждаме годишна оценка от конзолата - mark
// ако оценката му за годината ( марк <4.00) , трябва да повтаря класа
// и това го осигуряваме като напишем проверка if( mark<4.00) {
//  continue
//  } - continue не прекъсва цилкъка ( за ралика от brake), a ни връща към нова проверка
//  и ако следващата оценка (mark) която ще получим от конзолата пак е по-малка от 4 след проверка
//  на if(марк ,4)  , пак ще повтаря , докато оценката , която получим (mark) e по-голяма или равна на 4
// при това условие програмата ще премине към условието if( mark>=4)  и ще сумира оценките,
// като след това ще намери срената оценка и ще я принтира (averageMark)
