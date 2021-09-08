import java.util.Scanner;

public class EasterEggs_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfPaintedEggs= Integer.parseInt(scan.nextLine());
        String color = "";
        int max = 0;
        int redCnt=0;
        int orangeCnt=0;
        int blueCnt=0;
        int greenCnt=0;
        for (int i = 1; i <=numberOfPaintedEggs; i++) {
            String command= scan.nextLine();//"red", "orange", "blue", "green"
            switch(command){
                case "red":
                    redCnt++;
                    break;
                case "orange":
                    orangeCnt++;
                    break;
                case "blue":
                    blueCnt++;
                    break;
                case "green":
                    greenCnt++;
                    break;

            }

        }
         max= redCnt;

        if(greenCnt> max) {
            max = greenCnt;
            color= "green";
        } else if(blueCnt>max) {
            max = blueCnt;
            color= "blue";
        } else if(orangeCnt>max) {
            max = orangeCnt;
            color = "orange";
        } else {
            color= "red";
        }
        System.out.printf("Red eggs: %d%n",redCnt);
        System.out.printf("Orange eggs: %d%n",orangeCnt);
        System.out.printf("Blue eggs: %d%n",blueCnt);
        System.out.printf("Green eggs: %d%n", greenCnt);
        System.out.printf("Max eggs: %d -> %s",max,color);
    }
}
