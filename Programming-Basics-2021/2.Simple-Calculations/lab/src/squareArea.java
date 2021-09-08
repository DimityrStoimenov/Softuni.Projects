import java.util.Scanner; // импортираме клас Scanner, с която да достъпваме скенера

public class squareArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // правим си четец за вход
        String input = scan.nextLine(); // четем вход от текста от конзолата - въведено от потребителя като текст- "6"
        int side =Integer.parseInt(input); // преобразува текста "6" в число 6
        int area = side* side; // резултата от умножението се присвоява в кутията area / лице /
        System.out.println(area); // отпечатваме резултата area
    }

}
