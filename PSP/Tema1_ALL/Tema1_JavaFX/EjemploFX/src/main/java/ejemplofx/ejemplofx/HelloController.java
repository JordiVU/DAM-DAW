package ejemplofx.ejemplofx;

import javafx.beans.property.Property;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import model.Book;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HelloController implements Initializable {
    @FXML
    private TableColumn<Book, String> colGenre;
    @FXML
    private TableColumn<Book, String> colSeries;
    @FXML
    private TableColumn<Book, String> colAutor;
    @FXML
    private TextField txGenre;
    @FXML
    private TextField txSeries;
    @FXML
    private ChoiceBox<String> cbOrder;
    @FXML
    private TextField txAuthor;
    @FXML
    private ListView<Book> lvBooks;
    @FXML
    private TextField txID;
    @FXML
    private TextField txTitle;

    //TODO add a static list with the information

    public static List<Book> books;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadBooks();

        lvBooks.getSelectionModel().selectedItemProperty().addListener((observable,oldValue,newValue) -> {
            txID.setText(newValue.getId() + "");
            txTitle.setText(newValue.getTitle());
            txSeries.setText(newValue.getSeries());
            txGenre.setText(newValue.getGenre());
            txAuthor.setText(newValue.getAuthor());
        });

        // initialize the choiceBox
        cbOrder.getItems().addAll("Author","Title","Series","Genre");
        cbOrder.setValue(cbOrder.getItems().getFirst());
        //TODO listener to the choiceBox
        cbOrder.getSelectionModel().selectedItemProperty().addListener((observable,oldValue,newValue) -> {
            showOrderedBy(newValue);
        });


    }
    public void showOrderedBy(String order) {
        switch (order) {
            case "Author":
                lvBooks.setItems(FXCollections.observableList(
                        books.stream().sorted(Comparator.comparing(Book::getAuthor)).toList()
                ));
                break;
            case "Genre":
                lvBooks.setItems(FXCollections.observableList(
                        books.stream().sorted(Comparator.comparing(Book::getGenre)).toList()
                ));
                break;
            case "Series":
                lvBooks.setItems(FXCollections.observableList(
                        books.stream().sorted(Comparator.comparing(Book::getSeries)).toList()
                ));
                break;
            case "Title":
                lvBooks.setItems(FXCollections.observableList(
                        books.stream().sorted(Comparator.comparing(Book::getTitle)).toList()
                ));
                break;

        }
        //TODO show the list sorted

    }

    public void loadBooks() {
        books = new ArrayList<>();
        try(Stream<String> reader = Files.lines(Paths.get("books.txt"))) {
            books.addAll(reader.map(s ->
                    new Book(Integer.parseInt(s.split(";")[0]),
                            s.split(";")[1],
                            s.split(";")[2],
                            s.split(";")[3],s.length()>4?s.split(";")[4] : "")).toList()
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        lvBooks.setItems(FXCollections.observableList(books));
    }

    public boolean anyEmptyField()
    {
        //TODO return if any of the textbox is empty
        return true;

    }
    public void addBook(ActionEvent actionEvent) {
        Book newBook = new Book(Integer.parseInt(txID.getText()), txAuthor.getText(),
                        txTitle.getText(), txGenre.getText(), txSeries.getText());

        books.add(newBook);

        //TODO first you have to check the textFields. Any of them can't be empty.

        // Mostramos la lista actualizada.
        lvBooks.setItems(FXCollections.observableArrayList(books));
    }


    public void writeMessage(String title, String message) {
        //TODO a function to show a new Alert with the title and  message provided

    }
    public void updateBook(ActionEvent actionEvent) {
        // Actualizamos los elementos.
        lvBooks.getSelectionModel().getSelectedItem().setTitle(txTitle.getText());
        lvBooks.getSelectionModel().getSelectedItem().setSeries(txSeries.getText());
        lvBooks.getSelectionModel().getSelectedItem().setGenre(txGenre.getText());
        lvBooks.getSelectionModel().getSelectedItem().setAuthor(txAuthor.getText());

        // Mostramos la lista actualizada.
        lvBooks.setItems(FXCollections.observableArrayList(books));
    }

    public void deleteBook(ActionEvent actionEvent) {
        // Eliminamos el elemtno seleccionado.
        books.remove(lvBooks.getSelectionModel().getSelectedItem());

        // Mostramos la lista actualizada.
        lvBooks.setItems(FXCollections.observableArrayList(books));
    }
    public static void WriteFile() {

        Path file = Paths.get("books.txt");

        // Convertir cada Book en una línea separada por ;
        List<String> lines = books.stream()
                .map(b -> b.getId() + ";" +
                        b.getTitle() + ";" +
                        b.getAuthor() + ";" +
                        b.getGenre() + ";" +
                        b.getSeries())
                .collect(Collectors.toList());

        try {
            // Sobrescribe el archivo
            Files.write(file, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
