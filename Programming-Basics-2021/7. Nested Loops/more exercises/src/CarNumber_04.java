import java.util.Scanner;

public class CarNumber_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int startIndex= Integer.parseInt(scan.nextLine());
        int lastIndex= Integer.parseInt(scan.nextLine());
        for (int i = startIndex; i <=lastIndex; i++) {
            for (int j = startIndex; j <=lastIndex; j++) {
                for (int k = startIndex; k <=lastIndex; k++) {
                    for (int l = startIndex; l <=lastIndex; l++) {
                        if(i%2 == 0 && i>l && (j+k) % 2==0 && l %2 ==1) {
                            System.out.printf("%d%d%d%d ", i,j,k,l);
                        } else if(i%2 == 1 && i>l && (j+k) % 2==0 && l %2 ==0) {
                            System.out.printf("%d%d%d%d ", i,j,k,l);
                        }

                    }

                }

            }

        }
    }
}
