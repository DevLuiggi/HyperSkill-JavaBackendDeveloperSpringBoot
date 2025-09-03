package codegito;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Bubblegum", 2, 202));
        products.add(new Product("Toffee", 0.2, 118));
        products.add(new Product("Ice cream", 5, 2250));
        products.add(new Product("Milk chocolate", 4, 1680));
        products.add(new Product("Doughnut", 2.5, 1075));
        products.add(new Product("Pancake", 3.2, 80));
        System.out.println("Earned amount:");
        double total = 0;
        for (Product p : products) {
            double price = p.getPrice();
            double earnings = p.getEarnings();
            if (earnings == (int) earnings){
                System.out.println(p.getName() + ": " + "$" + (int) earnings);
            } else {
                System.out.println(p.getName() + ": " + "$" + earnings);
            }
            total += earnings;
        }
        System.out.println("\nIncome: " + "$" + total);
    }
}