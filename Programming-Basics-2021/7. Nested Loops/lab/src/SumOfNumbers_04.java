import java.util.Scanner;

public class SumOfNumbers_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int beginInterval= Integer.parseInt(scan.nextLine());
        int endInterval= Integer.parseInt(scan.nextLine());
        int magicNumber= Integer.parseInt(scan.nextLine());
          int numberOfCombinations= 0;
            boolean weFoundIt= false; // сетваме го така за да покажем че числото не е намерено
          for(int x1 = beginInterval; x1 <=endInterval; x1++) {
              for (int x2 = beginInterval; x2 <= endInterval; x2++) {
                  numberOfCombinations++;
                  if (x1 + x2 == magicNumber) {
                      System.out.printf("Combination N:%d (%d + %d = %d)%n", numberOfCombinations, x1, x2, magicNumber);
                      weFoundIt = true; // след като го намерим го сетваме на true, но това няма
                      // да спре първия цикъл и спираме втория цикъл. Сега остава да спрем и първия - със следващата проверка.
                      break;
                  }
              }
              if (weFoundIt) {
                  break; // // затова преди последната скоба правим вптра проверка ( weFoundit) с което
                  // показваме, че сме намерили интересуващата ни  първа комбинация и затова с
                  // проверката и (break)  спираме и първия цикъл
              }
          }
        if(!weFoundIt) {
            System.out.printf("%d combinations - neither equals %d", numberOfCombinations, magicNumber);
            // извеждаме я извън цикъла защото той се е извъртял, не е намерил комбинации и ще провери тази проверка
            // в нея ние казваме weFoundIt= false или просто  !weFoundIt и принтираме това което искат като изход
        }
    }
}
