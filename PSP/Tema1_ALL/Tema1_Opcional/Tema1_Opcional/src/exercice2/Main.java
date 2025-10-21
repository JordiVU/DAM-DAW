package exercice2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Milk Brick", "Lacteo", 1.50));
        products.add(new Product("Laptop X200", "Electronics", 1200.00));
        products.add(new Product("Sofa Classic", "Furniture", 850.00));
        products.add(new Product("Jeans Slim Fit", "Clothing", 45.00));
        products.add(new Product("Smartphone Z10", "Electronics", 800.00));
        products.add(new Product("Dining Table", "Furniture", 450.00));
        products.add(new Product("Cheddar Cheese", "Lacteo", 3.00));
        products.add(new Product("T-Shirt Basic", "Clothing", 20.00));

        //1. Filter the products to get those that belong to the "Electronics" category and print their names.
        products.stream().filter(a -> a.getCategori().equals("Electronics"))
                .forEach(System.out::println);

        System.out.println();
        //2. Calculate the total price of all products in the "Furniture" category.
        double sumFurniture = products.stream().filter(a -> a.getCategori().equals("Furniture"))
                .mapToDouble(Product::getPrice).sum();
        System.out.println(sumFurniture);

        System.out.println();
        //3. Get a list of all unique categories from the product list.
        products.stream().map(Product::getCategori).distinct()
                        .forEach(System.out::println);

        System.out.println();
        //4. Find the cheapest product in the "Clothing" category and display its name and price.
        products.stream().filter(a -> a.getCategori().equals("Clothing"))
                .min(Comparator.comparingDouble(Product::getPrice))
                .ifPresent(a -> System.out.println(a.getName() + " | " + a.getPrice() + "€"));

        System.out.println();
        //5. Group the products by category and print the number of products in each category.
        Map<String, Long> productsCategory = products.stream()
                .collect(Collectors.groupingBy(Product::getCategori, Collectors.counting()));

        System.out.println(productsCategory);
    }
}
