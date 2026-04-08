import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProductProcessor {
    private final List<Product> products;

    public ProductProcessor(List<Product> products) {
        this.products = products;
    }

    public List<Product> filterProductsAboveAveragePrice() {
        double avgPrice = products.stream()
                .mapToDouble(Product::getPrice)
                .average()
                .orElse(0.0);

        return products.stream()
                .filter(p -> p.getPrice() > avgPrice)
                .collect(Collectors.toList());
    }

    public Map<String, List<Product>> groupByCategory() {
        return products.stream()
                .collect(Collectors.groupingBy(Product::getCategory));
    }

    public List<Product> sortByPriceDescending() {
        return products.stream()
                .sorted(Comparator.comparingDouble(Product::getPrice).reversed())
                .collect(Collectors.toList());
    }

    public Map<String, Double> calculateAveragePriceByCategory() {
        return products.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.averagingDouble(Product::getPrice)
                ));
    }

    public Map<String, Product> findMostExpensiveByCategory() {
        return products.stream()
                .collect(Collectors.toMap(Product::getCategory, Function.identity(), BinaryOperator.maxBy(Comparator.comparingDouble(Product::getPrice))));
    }

    public void printProductStats() {
        products.forEach(p -> System.out.println(p.getName()));

        DoubleSummaryStatistics stats = products.stream()
                .collect(Collectors.summarizingDouble(Product::getPrice));

        System.out.println("\nStatystyki produktów:");
        System.out.println("Liczba produktów: " + stats.getCount());
        System.out.println("Cena minimalna: " + stats.getMin());
        System.out.println("Cena maksymalna: " + stats.getMax());
        System.out.println("Średnia cena: " + stats.getAverage());
        System.out.println("Suma cen: " + stats.getSum());

        System.out.println("\nLiczba produktów w kategoriach:");
        products.stream()
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.counting()))
                .forEach((cat, count) -> System.out.println(cat + ": " + count));
    }
}
