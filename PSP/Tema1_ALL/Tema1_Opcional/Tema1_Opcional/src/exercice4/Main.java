package exercice4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        books.add(new Book("Harry Potter y la piedra filosofal", "J.K. Rowling", 1997));
        books.add(new Book("Harry Potter y el cáliz de fuego", "J.K. Rowling", 2000));
        books.add(new Book("El código Da Vinci", "Dan Brown", 2003));
        books.add(new Book("Ángeles y demonios", "Dan Brown", 2000));
        books.add(new Book("Cien años de soledad", "Gabriel García Márquez", 1967));
        books.add(new Book("La sombra del viento", "Carlos Ruiz Zafón", 2001));
        books.add(new Book("El juego de Ender", "Orson Scott Card", 1985));
        
        //1. Sort the books by year of publication in ascending order and display their titles.
        books.stream().sorted(Comparator.comparingInt(Book::getYear))
                .map(Book::getTitle)
                .forEach(System.out::println);
        System.out.println();

        //2. Filter the books to get those published after the year 2000 and print their titles and authors.
        books.stream().filter(a -> a.getYear() > 2000)
                .forEach(a -> System.out.println(a.getTitle() + " - " + a.getAuthor()));
        System.out.println();

        //3. Find the most recently published book and display its title and year.
        books.stream().max(Comparator.comparingInt(Book::getYear))
                .ifPresent(a -> System.out.println(a.getTitle() + " - " + a.getYear()));
        System.out.println();

        //4. Print the titles of all books written by a specific author (e.g., "J.K. Rowling").
        books.stream().filter(a -> a.getAuthor().equals("J.K. Rowling"))
                .map(Book::getTitle)
                .forEach(System.out::println);
        System.out.println();

        //5. Group the books by author and print the number of books each author has written.
        Map<String, Long> authorBooks = books.stream()
                .collect(Collectors.groupingBy(Book::getAuthor, Collectors.counting()));

        authorBooks.forEach((author, count) ->
                System.out.println(author + " - " + count));

    }
}
