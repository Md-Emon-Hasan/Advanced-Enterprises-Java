package labreport;
import java.util.*;

public class CollectionsPractice {
    public static void main(String[] args) {
        //LIST
        List<String> book = new ArrayList<>();
        book.add("C Programming Basic Knowledge");
        book.add("Advanched Java");
        System.out.println("Book Name: " + book);
        System.out.println(book.size());
        book.remove("Advanched Java");
        System.out.println("Books Name After Removing: " + book);
        book.clear();
        System.out.println("After Clearing Name: " + book);
        //SET
        Set<String> author = new HashSet<>();
        author.add("Emon");
        author.add("Emon Hasan");
        System.out.println("Author Name: " + author);
        author.remove("Emon");
        System.out.println("After Removint Author Name: " + author);
        //QUEUE
        Queue<String> request = new LinkedList<>();
        request.add("Searching Books 1");
        request.add("Searching Books 2");
        request.add("Seraching Books 3");
        System.out.println("Before Removing Searching: " + request);
        request.clear();
        System.out.println("After Clear: " + request);
        System.out.println(request.size());
        //MAP
        Map<Integer, String> bookid = new HashMap<>();
        bookid.put(101, "Java");
        bookid.put(102, "Java");
        bookid.put(103, "Java");
        System.out.println(bookid);
    }
}