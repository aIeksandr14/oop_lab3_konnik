package Lab3;

public class Product implements Comparable<Product> {
    private String article;
    private String name;
    private double price;

    public Product(String article, String name, double price) {
        this.article = article;
        this.name = name;
        this.price = price;
    }

    public String getArticle() {
        return article;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return article.equals(product.article);
    }

    public int hashCode() {
        return article.hashCode();
    }

    public int compareTo(Product o) {
        return this.name.compareTo(o.name);
    }

    public String toString() {
        return "Product{article='" + article + "', name='" + name + "', price=" + price + '}';
    }
}
