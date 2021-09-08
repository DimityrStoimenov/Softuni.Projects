import java.util.Scanner;

public class Gymnastics_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String country = scan.nextLine(); // ("Russia", "Bulgaria" или "Italy")
        String device = scan.nextLine(); // ("ribbon", "hoop" или "rope")
        double rate =0;
         switch(country) {
             case "Russia":
                 if(device.equals("ribbon")) {
                     rate = 9.100 + 9.400;
                 } else if(device.equals("hoop")) {
                     rate = 9.300 + 9.800;
                 } else if (device.equals("rope")) {
                     rate = 9.600 + 9.000;
                 }
                 break;
             case "Bulgaria":
                 if(device.equals("ribbon")) {
                     rate = 9.600 + 9.400;
                 } else if(device.equals("hoop")) {
                     rate = 9.550 + 9.750;
                 } else if (device.equals("rope")) {
                     rate = 9.500 + 9.400;
                 }
                 break;
             case "Italy":
                 if(device.equals("ribbon")) {
                     rate = 9.200 + 9.500;
                 } else if(device.equals("hoop")) {
                     rate = 9.450 + 9.350;
                 } else if (device.equals("rope")) {
                     rate = 9.700 + 9.150;
                 }
                 break;
         }
         if(((country.equals("Russia"))||(country.equals("Bulgaria")||(country.equals("Italy")))) &&
                 ((device. equals("ribbon"))|| (device.equals("hoop")) ||(device.equals("rope")))) {
             System.out.printf("The team of %s get %.3f on %s.%n",country,rate,device);
             double diff= 20 - rate;
             double percent = (diff / 20 ) * 100;
             System.out.printf("%.2f%%",percent);
         }
    }
}
