import java.util.Scanner;

public class SumPrimeNonPrime_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int primeNumbersSum= 0;
        int nonPrimeNumbersSum=0;
        while (true) {
            String input = scan.nextLine();// число или stop
            if (input.equals("stop")) {
                break;
            }
            // ако не е stop е число, затова input(пример "3") го парсваме на currentNumber(3)
            int currentNumber = Integer.parseInt(input);
            if(currentNumber<0){
                System.out.println("Number is negative.");
            } else {

                // проверяваме дали currentNumber е просто или не е просто число
                // просто число е всяко число което се дели на себе си и на едно( пример : 3, 7, 11, 13)
                // непросто число е това което се дели на себе си, на едно и на друго число(пример:4,6,8,10,21,24,49 и т.н.)
                // проверяваме 9 -> на колко се дели 9 % 2 == 0 -> ако се дели без остатък е просто
                // дели се на 1 и на 9
                // дели се и на 3, значи 9 не е просто
                // за тази проверка правим цикъл който започваме от 2( защо от 2 защото 1 дели всяко едно число,
                // и затова няма нужда да го проверяваме)
                boolean isPrime = true; // приемаме в началото че всяко едно число е просто
                for (int i = 2; i < currentNumber; i++) {
                    // защо i < currentNumber защото примерно ако currentNumber= 7, казваме
                    // 7 % 2 == 0; не, значи е все още просто, 7 % 3 ==0, не подължава да е просто, така ще го направим за 4,5,6
                    // обаче като стигнем до 7 ( 7 % 7 == 0, да равно е, но ще излезе чене е просто число, а това не отговаря на условието
                    // за просто число да се дели на 1 и на себе си). Затова и махаме = от проверката в цилъка и остава(i < currentNumber)
                    if (currentNumber % i == 0) {
                        isPrime = false; // след като се дели без остатък го сетваме на false (true е само за простите числа)
                        break; // след като е установено, че е false, никога няма да стане на true и затова спираме цикъла(пример ако числото
                        // е 8 , ние знаем че то освен на себе си и на 1 се дели и на 2, 4. След като установим че се дели на 2 ние няма нужда
                        // да проверяваме другите итерации ( 4 и т.н.) знаем че 8 не е просто число.
                    }
                }
                    if (isPrime) {
                        primeNumbersSum += currentNumber;
                    } else {
                        nonPrimeNumbersSum += currentNumber;
                }
            }
        }
        System.out.printf("Sum of all prime numbers is: %d%n", primeNumbersSum);
        System.out.printf("Sum of all non prime numbers is: %d%n", nonPrimeNumbersSum);
    }
}

