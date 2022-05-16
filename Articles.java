import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Articles {
    public static class Site{
        String title;
        String  content;
        String author;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        @Override
        public String toString() {
            return this.title+" - "+this.content+": "+this.author;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        Site(String title, String content, String author){
            this.title = title;
            this.content = content;
            this.author = author;
        }

    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List <Site> article = new ArrayList<>();

        for(int i =0; i < n; i++){
            String [] parts = scanner.nextLine().split(", ");
            Site articles = new Site (parts[0],parts[1],parts[2]);
            article.add(articles);
        }
for(Site e : article){
    System.out.println(e.toString());


}

    }
}
