import java.util.Scanner;

public class ExtractFile_03_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String file = scan.nextLine();
       int firstIndex = file.lastIndexOf(92);
       int secondIndex = file.lastIndexOf(46);
       String fileName = file.substring(firstIndex + 1, secondIndex);
       String fileExtension = file.substring(secondIndex + 1,file.length());
        System.out.printf("File name: %s%n", fileName);
        System.out.printf("File extension: %s", fileExtension);

    }
}
