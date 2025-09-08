package codegito.firstproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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
        if (total == (int) total){
            System.out.println("\nIncome: " + "$" + (int) total);
        }
        else {
            System.out.println("\nIncome: " + "$" + total);
        }
        System.out.println("Staff expenses:");
        double totalExp = input.nextDouble();
        total -= totalExp;
        System.out.println("Other expenses: ");
        double totalOtherExp = input.nextDouble();
        total -= totalOtherExp;
        if (total == (int) total){
            System.out.println("Net income: $" + (int) total);
        }
        else {
            System.out.println("Net income: $" + total);
        }
        input.close();
    }
}