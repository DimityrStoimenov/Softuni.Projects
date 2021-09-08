import java.util.Scanner;

public class FromInchesToCentimeters_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // как да направиш live template за скенера / пишеш си Scanner scanner= new Scanner(System.in)/
        // или scan в моя случай( няма значение как ще го кръстиш), отиваш на Scanner и натискаш Alt+Shift+Enter, за
        // да си
        // импортираш библиотеката import java.util.Scanner; след това маркираш
        // Scanner scanner= new Scanner(System.in);
        // Отиваш в менюто горе и избираш Tools -> Save as Live Template -> Abbreviation ( измисляш си някаква
        // абревиатура, aз примерно съм си сложил едно s) -> Apply.И вместо да пишеш всеки път
        // Scanner scanner= new Scanner(System.in);  пишеш абревиатурата + Tab  и то автоматично ти създава скенера.
        // Този начин е валиден за всичко.  Така можеш да си направиш и live templates за int
        // (Integer.parseInt(scan.nextLine()), double(Double.parseDouble.scan.nextLine()).


        double inches = Double.parseDouble(scan.nextLine()); // прочитаме си инчовете/double защото е реално число -
        // в double може да е цяло число (-5 или 5), а може и да е със запетая / 5.5- в  java десетичната запетая
        // е точка/
        double centimeters = inches * 2.54; // умножаваме инчовете по коефциента за преобразуване в сантиметри
        System.out.println(centimeters); //  при отпечатване  променливата / в случая centimeters/ не е в кавички,
        // в кавички слагаме само текст

    }
}

