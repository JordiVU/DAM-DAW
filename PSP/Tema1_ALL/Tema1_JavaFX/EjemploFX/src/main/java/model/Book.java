package model;

public class Book {
    private int id;
    private String title;
    private String author;
    private String genre;
    private String series;

    public Book(int id, String title, String author, String genre, String series) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.series = series;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return  title + " "+ author;
    }

    public String write()
    {
        return id+";"+title+";"+author+";"+genre+";"+series;
    }
}
