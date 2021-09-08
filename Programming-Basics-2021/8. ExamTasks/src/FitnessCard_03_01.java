import java.util.Scanner;

public class FitnessCard_03_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       /*
       Да се напише програма, която проверява дали първоначално налична сума е достатъчна, за да се заплати карта
       за месечен достъп във фитнес.
Цената на картата зависи от пола на клиента и спорта, който практикува:
Пол     Gym     Boxing   Yoga   Zumba   Dances      Pilates

мъж     $42      $41     $45    $34      $51          $39

жена    $35      $37     $42    $31      $53          $37

Всички цени на карти за ученици (възраст под 19 години вкл.) са с 20% намаление.
Вход
От конзолата се прочитат 4 реда:
    • Сумата, с която разполагаме - реално число в интервала [10.00…1000.00]
    • Пол - символ ('m' за мъж и 'f' за жена)
    • Възраст - цяло число в интервала [5…105]
    • Спорт - текст (една от възможностите в таблицата)
Изход
На конзолата се отпечатва 1 ред:
    • Ако сумата е достатъчна:
"You purchased a 1 month pass for {sport}."
където {sport} е въведения тип спорт
    • Ако сумата не е достатъчна трябва да се пресметне колко още пари са необходими, за да се закупи карта:
"You don't have enough money! You need ${money} more."
където {money} e оставащата сума нужна, за да се закупи картата, форматирана до втория знак след десетичната
запетая.
        */
        double budget = Double.parseDouble(scan.nextLine());
        char gender = scan.nextLine().charAt(0);
        int age = Integer.parseInt(scan.nextLine());
        String sport = scan.nextLine();
        double cost = 0;
        double discount = 0;
        double leftMoney = 0;
        double neededMoney = 0;
        switch (sport) {
            case "Gym":
                if (gender == 'm') {
                    cost = 42;
                    if (age <= 19) {
                        discount = cost - (cost * 0.2);
                    }
                }
                if (gender == 'f') {
                    cost = 35;
                }
                if (age <= 19) {
                    discount = cost - (cost * 0.2);
                }
                break;
            case "Boxing":
                if (gender == 'm') {
                    cost = 41;
                    if (age <= 19) {
                        discount = cost - (cost * 0.2);
                    }
                }
                if (gender == 'f') {
                    cost = 37;
                }
                if (age <= 19) {
                    discount = cost - (cost * 0.2);
                }
                break;
            case "Yoga":
                if (gender == 'm') {
                    cost = 45;
                    if (age <= 19) {
                        discount = cost - (cost * 0.2);
                    }
                }
                if (gender == 'f') {
                    cost = 42;
                }
                if (age <= 19) {
                    discount = cost - (cost * 0.2);
                }
                break;
            case "Zumba":
                if (gender == 'm') {
                    cost = 34;
                    if (age <= 19) {
                        discount = cost - (cost * 0.2);
                    }
                }
                if (gender == 'f') {
                    cost = 31;
                }
                if (age <= 19) {
                    discount = cost - (cost * 0.2);
                }
                break;
            case "Dances":
                if (gender == 'm') {
                    cost = 51;
                    if (age <= 19) {
                        discount = cost - (cost * 0.2);
                    }
                }
                if (gender == 'f') {
                    cost = 53;
                }
                if (age <= 19) {
                    discount = cost - (cost * 0.2);
                }
                break;
            case "Pilates":
                if (gender == 'm') {
                    cost = 39;
                    if (age <= 19) {
                        discount = cost - (cost * 0.2);
                    }
                }
                if (gender == 'f') {
                    cost = 37;
                }
                if (age <= 19) {
                    discount = cost - (cost * 0.2);
                }
                break;

        }
        if ((sport.equals("Gym") || sport.equals("Boxing") || sport.equals("Yoga") || sport.equals("Zumba")
                || sport.equals("Dances") || sport.equals("Pilates")) && (gender == 'm' || gender == 'f') && (age <= 19)
                && (budget >= discount)) {

            System.out.printf("You purchased a 1 month pass for %s.", sport);
        } else if ((sport.equals("Gym") || sport.equals("Boxing") || sport.equals("Yoga") || sport.equals("Zumba")
                || sport.equals("Dances") || sport.equals("Pilates")) && (gender == 'm' || gender == 'f') && (age <= 19)
                && (budget < discount)) {
            neededMoney = discount - budget;
            System.out.printf("You don't have enough money! You need $%.2f more.", neededMoney);
        }
        if ((sport.equals("Gym") || sport.equals("Boxing") || sport.equals("Yoga") || sport.equals("Zumba")
                || sport.equals("Dances") || sport.equals("Pilates")) && (gender == 'm' || gender == 'f') && (age > 19)
                && (budget >= cost)) {

            System.out.printf("You purchased a 1 month pass for %s.", sport);
        } else if ((sport.equals("Gym") || sport.equals("Boxing") || sport.equals("Yoga") || sport.equals("Zumba")
                || sport.equals("Dances") || sport.equals("Pilates")) && (gender == 'm' || gender == 'f') && (age > 19)
                && (budget < cost)) {
            neededMoney = cost - budget;
            System.out.printf("You don't have enough money! You need $%.2f more.", neededMoney);


        }
    }
}
