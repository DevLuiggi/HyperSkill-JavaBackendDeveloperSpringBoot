package codegito;

public class Product {
    String name;
    double price;
    double earnings;

    Product() {
    }

    public Product(String name, double price, double earnings) {
        this.name = name;
        this.price = price;
        this.earnings = earnings;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getEarnings() {
        return earnings;
    }

    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }

}
