import java.util.Scanner;

public class Messages_05_MoreExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int count;
        int offset;
        int letterIndex;
        int current;
        int cnt;
        StringBuilder bul = new StringBuilder();
        for (int i = 1; i <= n ; i++) {
            int digit = Integer.parseInt(scan.nextLine());
            count =0;
            current =0;
            offset = 0;
            cnt =0;
            letterIndex = 0;
            int currentIndex;
            while( digit > 0) {
                count ++;
                int quotient = digit /10;
                current = digit - quotient * 10;
                digit = quotient;
            }
            if( current == 8 || current ==9) {
                cnt+=1;
            }
            offset = (( current - 2) * 3) + cnt;
            currentIndex = (offset + (count -1));
            if( currentIndex < 0 && count ==0) {
                letterIndex = 32;
                bul.append((char) letterIndex);
            }else if( currentIndex ==0) {
                letterIndex = 97;
                bul.append((char) letterIndex);
            } else if( currentIndex == 1) {
                letterIndex = 98;
                bul.append((char) letterIndex);
            } else if( currentIndex == 2) {
                letterIndex = 99;
                bul.append((char) letterIndex);
            }else if( currentIndex == 3) {
                letterIndex = 100;
                bul.append((char) letterIndex);
            }else if( currentIndex == 4) {
                letterIndex = 101;
                bul.append((char) letterIndex);
            }else if( currentIndex == 5) {
                letterIndex = 102;
                bul.append((char) letterIndex);
            }else if( currentIndex == 6) {
                letterIndex = 103;
                bul.append((char) letterIndex);
            }else if( currentIndex == 7) {
                letterIndex = 104;
                bul.append((char) letterIndex);
            }else if( currentIndex == 8) {
                letterIndex = 105;
                bul.append((char) letterIndex);
            }else if( currentIndex == 9) {
                letterIndex = 106;
                bul.append((char) letterIndex);
            }else if( currentIndex == 10) {
                letterIndex = 107;
                bul.append((char) letterIndex);
            }else if( currentIndex ==11) {
                letterIndex = 108;
                bul.append((char) letterIndex);
            }else if( currentIndex == 12) {
                letterIndex = 109;
                bul.append((char) letterIndex);
            }else if( currentIndex == 13) {
                letterIndex = 110;
                bul.append((char) letterIndex);
            }else if( currentIndex == 14) {
                letterIndex = 111;
                bul.append((char) letterIndex);
            }else if( currentIndex == 15) {
                letterIndex = 112;
                bul.append((char) letterIndex);
            }else if( currentIndex == 16) {
                letterIndex = 113;
                bul.append((char) letterIndex);
            }else if( currentIndex == 17) {
                letterIndex = 114;
                bul.append((char) letterIndex);
            }else if( currentIndex == 18) {
                letterIndex = 115;
                bul.append((char) letterIndex);
            }else if( currentIndex == 19) {
                letterIndex = 116;
                bul.append((char) letterIndex);
            }else if( currentIndex == 20) {
                letterIndex = 117;
                bul.append((char) letterIndex);
            }else if( currentIndex == 21) {
                letterIndex = 118;
                bul.append((char) letterIndex);
            }else if( currentIndex == 22) {
                letterIndex = 119;
                bul.append((char) letterIndex);
            }else if( currentIndex == 23) {
                letterIndex = 120;
                bul.append((char) letterIndex);
            }else if( currentIndex == 24) {
                letterIndex = 121;
                bul.append((char) letterIndex);
            }else if( currentIndex == 25) {
                letterIndex = 122;
                bul.append((char) letterIndex);
            }

        }
        System.out.println(bul);

    }
}
