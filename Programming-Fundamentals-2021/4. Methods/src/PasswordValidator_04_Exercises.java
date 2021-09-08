import java.util.Scanner;

public class PasswordValidator_04_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();
        //Проверяваме дължината - от 6 до 10 символа
        // ако дължината не е валидна - print
        boolean isValidLength = isValidLength(password);
        if (!isValidLength) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        //Втори метод проверка дали съдържа само букви и цифри
        boolean isValidContent = isValidContent(password);
        if(!isValidContent) {
            System.out.println("Password must consist only of letters and digits");
        }
        //Трети метод - да съдържа най - малко 2 числа
        boolean isValidCountDigits = isValidCountDigits(password);
        if (!isValidCountDigits) {
            System.out.println("Password must have at least 2 digits");
        }
        if (isValidLength && isValidContent && isValidCountDigits) {
            System.out.println("Password is valid");
        }


    }
    //Първи метод - проверка за дължина от 6 до 10 символа - true при валидана дължина , false - при невалидна
    private static boolean isValidLength(String password) {
        // проверяваме дали паролата е валидна
        return password.length() >= 6 && password.length() <= 10;
    }
    // Втори метод за проверка на букви и цифри - true (валидна) или false(невалидна)
    private static boolean isValidContent(String password) {
        for (int i = 0; i <= password.length() -1; i++) {
            char currentSymbol = password.charAt(i);
            // пример за смисъла на проверката Dimit@r ->  минава D, i, m i , t и стига до @ -> false
            // и цялата парола е невалидна
            if (!Character.isLetterOrDigit(currentSymbol)) {
                return false;
            }
        }
        //след като ги е обходил през целия цикъл и не е върнал false, значи всички символи са букви и цифри
        // и затова връща true.
        return true;
    }
    // Трети метод за проверка на броя на цифрите в паролата - валидна -> ако броя на цифрите е по-голяма от 2(true),
    // иначе (false)
    private static boolean isValidCountDigits(String password) {
        // true - броят на цифрите >= 2
        // false - броят на цифрите < 2
        int counter = 0;
        for (int i = 0; i <= password.length() -1 ; i++) {
            char currentSymbol = password.charAt(i);
            if( Character.isDigit(currentSymbol)) {
                counter++;
            }
        }
        return counter >= 2;
        /* Друг вариант за  return;
        if(counter >= 2){
        return true;
        } else {
        return false;
        }
         */
    }
}
