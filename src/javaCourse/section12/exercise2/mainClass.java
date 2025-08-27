package javaCourse.section12.exercise2;

import javaCourse.section12.exercise2.entities.Comment;
import javaCourse.section12.exercise2.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class mainClass {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Comment c1 = new Comment("Example");
        Comment c2 = new Comment("Example2");
        Post post1 = new Post("Example title", sdf.parse("27/08/2025 14:00:00"), "Content example", 10);

        post1.addComment(c1);
        post1.addComment(c2);

        System.out.println(post1);

        Comment c3 = new Comment("Example3");
        Comment c4 = new Comment("Example4");
        Post post2 = new Post("Example title2", sdf.parse("30/08/2025 14:00:00"), "Content example2", 69);

        post1.addComment(c3);
        post1.addComment(c4);

        System.out.println(post2);
    }
}
