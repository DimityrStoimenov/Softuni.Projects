import java.util.Scanner;

public class MorseCodeTranslator_04_MoreExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] cryptText = scan.nextLine().split (" \\| ");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <= cryptText.length - 1; i++) {
            String [] boundsOfCurrentWord = cryptText[i].trim().split(" ");
            for (int j = 0; j <= boundsOfCurrentWord.length - 1; j++) {
               String character = boundsOfCurrentWord[j];
                if (character.equals(".-")) {
                    builder.append('A');
                } else if (character.equals("-...")) {
                    builder.append('B');
                } else if (character.equals("-.-.")) {
                    builder.append('C');
                } else if (character.equals("-..")) {
                    builder.append('D');
                } else if (character.equals(".")) {
                    builder.append('E');
                } else if (character.equals("..-.")) {
                    builder.append('F');
                } else if (character.equals("--.")) {
                    builder.append('G');
                } else if (character.equals("....")) {
                    builder.append('H');
                } else if (character.equals("..")) {
                    builder.append('I');
                } else if (character.equals(".---")) {
                    builder.append('J');
                } else if (character.equals("-.-")) {
                    builder.append('K');
                } else if (character.equals(".-..")) {
                    builder.append('L');
                } else if (character.equals("--")) {
                    builder.append('M');
                } else if (character.equals("-.")) {
                    builder.append('N');
                } else if (character.equals("---")) {
                    builder.append('O');
                } else if (character.equals(".--.")) {
                    builder.append('P');
                } else if (character.equals("--.-")) {
                    builder.append('Q');
                } else if (character.equals(".-.")) {
                    builder.append('R');
                } else if (character.equals("...")) {
                    builder.append('S');
                } else if (character.equals("-")) {
                    builder.append('T');
                } else if (character.equals("..-")) {
                    builder.append('U');
                }else if(character.equals("...-")) {
                    builder.append('V');
                } else if (character.equals(".--")) {
                    builder.append('W');
                } else if (character.equals("-..-")) {
                    builder.append('X');
                } else if (character.equals("-.--")) {
                    builder.append('Y');
                } else if (character.equals("--..")) {
                    builder.append('Z');
                }

            }

            builder.append(' ');

        }
        System.out.println(builder);
    }
}
