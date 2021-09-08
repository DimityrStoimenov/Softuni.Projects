import java.util.Scanner; // импортираме клас скенер за четене на данни от вход / ako ne e syzdaden го създаваме с кликане върху Scanner и избиране на Alt+Enter

public class ConvertInchesToCentimeters {
    public static void main(String[] args) { // метод main - начална / входна/ точка на програмата
        Scanner scan = new Scanner(System.in); //  изваждаме си четец
        String input = scan.nextLine(); // потребителят задава текст , примерно "10"
        double inches = Double.parseDouble(input); // преобразува се в число 10, предава се на parseDouble, а оттам на променливата inches
        double centimeters = inches * 2.54; // числото в променливата inches се умножава по 2.54 и се прехвърля на променливата centimeters
        System.out.println(centimeters); // отпечатва се резултата на променливата centimeters
    }
}
