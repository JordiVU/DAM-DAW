package exercice2;

public class Product {
    private String name;
    private String categori;
    private double price;

    public Product(String name, String categori, double price) {
        this.name = name;
        this.categori = categori;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategori() {
        return categori;
    }

    public void setCategori(String categori) {
        this.categori = categori;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " | " + categori + " | " + price;
    }
}
