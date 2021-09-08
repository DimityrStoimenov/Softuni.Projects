import java.util.Scanner;

public class metConv {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num = Double.parseDouble(scan.nextLine());
        String input = scan.nextLine().toLowerCase();
        String output = scan.nextLine().toLowerCase();
        if(input.equals("m"))
            num= num;
        if (input.equals("cm")) {
            num = num / 100;
        }if (input.equals("mm")) {
            num = num / 1000;
        }if (output.equals("mm")) {
                num = num * 1000;
            }if (output.equals("cm")) {
                num = num * 100;
            } if(output.equals("m")) {
            num = num;
        }
            System.out.printf("%.3f", num, output);

        }
    }

