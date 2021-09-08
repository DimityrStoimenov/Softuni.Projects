import java.util.Scanner;

public class TheSongOfTheWheels_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int controlNumber = Integer.parseInt(scan.nextLine());
        int count = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        String password = "";
        boolean passwordIsFound = false;
        for (a = 1; a <= 9; a++) {
            for (b = 1; b <= 9; b++) {
                for (c = 1; c <= 9; c++) {
                    for (d = 1; d <= 9; d++) {
                        if ((a * b + c * d == controlNumber) && (a < b && c > d)) {
                            System.out.printf("%d%d%d%d ", a, b, c, d);
                            count++;
                        }
                            if (count == 4 &&(a * b + c * d == controlNumber) && (a < b && c > d) ) {
                                password= a + "" +b + "" + c + "" + d;
                                passwordIsFound = true;
                            }


                        }

                    }

                }

            }
        System.out.println();

            if (passwordIsFound) {
                System.out.printf("Password: %s", password);
            } else {
                System.out.println("No!");
            }

        }
    }



