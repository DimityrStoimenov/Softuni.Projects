import java.util.Scanner;

public class ExtractFile_DesicionDesi_03_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String path = scan.nextLine();
        String [] parts = path.split("\\\\"); // сплитваме по една или повече \
        String fullFileName = parts[parts.length - 1]; //Template.pptx
        String fileName = fullFileName.split("\\.")[0];
        String fileExtension = fullFileName.split("\\.")[1];
        System.out.printf("File name: %s%n", fileName);
        System.out.printf("File extension: %s", fileExtension);

    }
}
