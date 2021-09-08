import java.util.Scanner;

public class FootballResults_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] firstMatch = scan.nextLine().split(":");
        String one = firstMatch[0];
        int One = Integer.parseInt(one);
        String next = firstMatch[1];
        int Next = Integer.parseInt(next);
        String[] secondMatch = scan.nextLine().split(":");
        String two = secondMatch[0];
        int Two = Integer.parseInt(two);
        String nextTwo = secondMatch[1];
        int nextOfTwo = Integer.parseInt(nextTwo);
        String[] thirdMatch = scan.nextLine().split(":");
        String third = thirdMatch[0];
        int Third = Integer.parseInt(third);
        String thrd = thirdMatch[1];
        int nextThird = Integer.parseInt(thrd);
        int win = 0;
        int lost = 0;
        int draw = 0;

        if (One > Next) {
            win += 1;
        }
        if (Two > nextOfTwo) {
            win += 1;
        }
        if (Third > nextThird) {
            win += 1;
        }
        if (One < Next) {
            lost += 1;
        }
        if (Two < nextOfTwo) {
            lost += 1;
        }
        if (Third < nextThird) {
            lost += 1;
        }
        if((One ==Next)) {
        draw += 1;
    } if(Two ==nextOfTwo) {
            draw += 1;
        } if(Third ==nextThird) {
            draw += 1;
        }
        System.out.printf("Team won %d games.%n", win);

        System.out.printf("Team lost %d games.%n", lost);

        System.out.printf("Drawn games: %d%n", draw);
    }
}



