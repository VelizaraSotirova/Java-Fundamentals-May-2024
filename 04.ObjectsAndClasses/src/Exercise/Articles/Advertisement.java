package Exercise.Articles;

import java.util.Scanner;

public class Advertisement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String articleData = scan.nextLine();
        String title = articleData.split(", ")[0];
        String content = articleData.split(", ")[1];
        String author = articleData.split(", ")[2];

        Article article = new Article(title, content, author);

        int commandsCount = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= commandsCount; i++) {
            String command = scan.nextLine();
            String commandName = command.split(": ")[0];
            String param = command.split(": ")[1];

            switch (commandName) {
                case "Edit" -> article.edit(param);
                case "ChangeAuthor" -> article.changeAuthor(param);
                case "Rename" -> article.rename(param);
            }
        }

        System.out.println(article.toString());
    }
}
