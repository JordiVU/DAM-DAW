
import java.util.*;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class Main 
{
    public static void main(String[] args) 
    {
        List<Product> products = new ArrayList<>();
        
        products.add(new Product("Assassin's Creed", "Videogames", 19.95f));
        products.add(new Product("MacBook Air 13\"", "Laptops", 1195));
        products.add(new Product("Lenovo Yoga 14\"", "Laptops", 549.95f));
        products.add(new Product("BQ Curie 8\"", "Tablets", 69.45f));
        products.add(new Product("Samsung Galaxy Tab 3 9.7\"", "Tablets", 210.25f));
        products.add(new Product("iPad Mini 3", "Tablets", 399.95f));
        products.add(new Product("Microsoft Surface 3", "Tablets", 419.75f));
        products.add(new Product("The Lasf of Us", "Videogames", 49.95f));
        products.add(new Product("Fifa 17", "Videogames", 69.95f));

        Collections.sort(products,
                Comparator.comparing(Product::getCategory)
                .thenComparing(Product::getName));

        products.forEach(System.out::println);

        System.out.println();

        products.stream().filter(p -> p.getCategory().equals("Tablets"))
                .forEach(System.out::println);

        OptionalDouble average =
                products.stream()
                .filter(p -> p.getCategory().equals("Videogames"))
                .mapToDouble(Product::getPrice)
                .average();

        System.out.println(average.isPresent()?
                average.getAsDouble():"No average price");

        BiFunction<List<Product>, Double, String> myBiFunc =
                (myProducts, myPrice) ->
                        myProducts.stream().filter(p -> p.getPrice() > myPrice)
                                .map(p -> p.getName())
                                .collect(Collectors.joining(","));

        System.out.println();
        System.out.println(myBiFunc.apply(products, 100.0));

        Map<String, Long> myMap =
                products.stream().collect(
                        Collectors.groupingBy(
                                Product::getCategory, Collectors.counting()));
        System.out.println();
        myMap.forEach((cat, cuantos) -> System.out.println(cat+":"+cuantos));
    }
}
