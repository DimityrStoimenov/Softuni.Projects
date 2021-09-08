import java.util.Scanner;

public class FishTank_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // прочитаме си входните данни
        int length= Integer.parseInt(scan.nextLine());
        int width= Integer.parseInt(scan.nextLine());
        int height= Integer.parseInt(scan.nextLine());
        double percent= Double.parseDouble(scan.nextLine());
        // изчисляваме обема на аквариума
        double volume= length * width * height;
        // резултатът ни е в кубични сантиметри и за да го превърнем в литри(по условие 1 литър = 1 кубичен
        // дециметър,а 1 кубичен сантиметър= 0.001 литра,следователно обемът * 0.001.
        double volumeInLiters=  volume * 0.001;
        // изчисляваме процента на изместване от пясъка, растенията, нагревателя и гумата
        double offset = volumeInLiters * (percent /100);
        // изчисляваме чистия обем (вода) като извадим от обема  изместването
        double pureVolume= volumeInLiters - offset;
        System.out.printf("%.2f", pureVolume);
    }
}
