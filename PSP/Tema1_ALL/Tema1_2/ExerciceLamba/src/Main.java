import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book("Alas de Sangre", 19.95));
        books.add(new Book("Hobbit", 10.50));
        books.add(new Book("Song of Aquiles", 30));
        books.add(new Book("Cancion de Hielo y Fuego", 25));

        Collections.sort(books, (b1, b2) -> b1.getTitle().compareTo(b2.getTitle()));
        books.forEach(System.out :: println);
        System.out.println();

        Collections.sort(books, (b1, b2) -> Double.compare(b1.getPrice(), b2.getPrice()));
        books.forEach(System.out :: println);
    }
}