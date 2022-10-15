import java.util.LinkedList;

public class JavaLinkedList {
    public static void main (String[] args) {
        LinkedList<String> books = new LinkedList<String>();

        books.add("To Kill a Mockingbird");
        books.add("The Da Vinci Code");
        books.add("The Hunger Games");
        books.add("Water for Elephants");
        books.add("Lord of the Flies");

        for (String i: books) {
            System.out.println(i);
        }
    }
}