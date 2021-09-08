package Articles_04_Exercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Article> articleDatabase = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] elements = scan.nextLine().split(",\\s+");
            String title = elements[0];
            String content = elements[1];
            String author = elements[2];

            articleDatabase.add(new Article(title,content,author));
        }
        String command = scan.nextLine();
        switch (command) {
            case "title":
                articleDatabase.sort(Comparator.comparing(Article::getTitle));
                break;
            case "content":
                articleDatabase.sort(Comparator.comparing(Article::getContent));
                break;
            case "author":
                articleDatabase.sort(Comparator.comparing(Article::getAuthor));
                break;

        }
        for (Article article : articleDatabase) {
            System.out.println(article.toString());
        }

    }
}
