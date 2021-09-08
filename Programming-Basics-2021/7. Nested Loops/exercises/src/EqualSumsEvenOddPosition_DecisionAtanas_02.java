import java.util.Scanner;

public class EqualSumsEvenOddPosition_DecisionAtanas_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 1. да си прочетем входа - първото и последното число
        // 2. да направим цикъл , който ще мине от първото до последното число
        // 3. да проверим дали едно число е специално (сумата на четните позиции да бъде равна на сумата на нечетните позиции)
        // 4. isSpecial алгоритм
        // 5. Ако числото е специално, го отпечатваме.
        int firstNum = Integer.parseInt(scan.nextLine());
        int lastNum = Integer.parseInt(scan.nextLine());
        boolean isEvenPosition = true; //  тази булева променлива е за всички четни числа ( затова е true), ще сменяме стойността й на false при нечетните позиции
        for (int i = firstNum; i <= lastNum; i++) {
            int evenDigitsSum = 0; // брояч за четни позиции
            int oddDigitsSum = 0; // брояч за нечетни позиции
            int currentNumber = i; //  в тази променлива ще държим текущото число i , за да можем
            // да взимаме стойността на последната цифра на четна/нечетна позици и след като сме я взели да махаме последната цифра. Не можем да използваме директно i
            // защото ще променим неговата стойност, а то трябва да присвоява поредния номер от цикъла ( пример цикъл 1000 до 3000, - i ще бъде първо 1000, после 2000 като
            // стигне 3000 ще изпълни и за него инструкциите и ще спре цикъла.
            while (currentNumber > 0) {
                int lastDigit = currentNumber % 10; // взима последната цифра от currentNumber
                if (isEvenPosition) {
                    evenDigitsSum += lastDigit;
                    isEvenPosition = false; // сетваме го на false понеже ( първото число е четно - true),
                    // но следващото число ще е нечетно,  и за да преминем на него, трябва да сетнем на false
                } else {
                    oddDigitsSum += lastDigit;
                    isEvenPosition = true; // следващото число ще е четно и за да преминем към него isEvenPosition го сетваме на true
                }
                currentNumber /= 10; // след като е взел цифрата за да отидем на следващата позиция(последната е четна,следващата е  нечетна), махаме последната,
                // след това взима числото от нечетната позиция и за да отиде на следващата четна, маха тази нечетна и т.н.
                // докато не стигнем до позиция номер 1 (която винаги е нечетна)
            }
            if (evenDigitsSum == oddDigitsSum) {
                System.out.printf("%d ", i);
            }

        }


    }
}



