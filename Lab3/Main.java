package Lab3;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        SimpleStorage<Integer> intStorage = new SimpleStorage<>();
        intStorage.add(100);
        intStorage.add(200);
        intStorage.add(300);
        intStorage.printStorage();

        SimpleStorage<String> strStorage = new SimpleStorage<>();
        strStorage.add("Яблоко");
        strStorage.add("Банан");
        strStorage.add("Вишня");
        strStorage.printStorage();


        List<Product> products = new ArrayList<>();

        products.add(new Product("ART001", "Телевизор Samsung", 25000));
        products.add(new Product("ART002", "Холодильник Bosch", 35000));
        products.add(new Product("ART001", "Телевизор LG", 23000));        // дубликат article!
        products.add(new Product("ART003", "Стиральная машина Indesit", 18000));
        products.add(new Product("ART001", "Телевизор Xiaomi", 21000));     // ещё один дубликат
        products.add(new Product("ART004", "Пылесос Dyson", 16000));

        System.out.println("Исходный список (6 товаров):");
        for (Product p : products) {
            System.out.println(p);
        }

        Collections.sort(products);

        System.out.println("После сортировки по имени:");
        for (Product p : products) {
            System.out.println(p);
        }


        HashSet<Product> unique = new HashSet<>(products);

        System.out.println("HashSet (только уникальные по article):");
        for (Product p : unique) {
            System.out.println(p);
        }

        System.out.println("\nРазмер ArrayList = " + products.size());
        System.out.println("Размер HashSet   = " + unique.size());
    }
}
