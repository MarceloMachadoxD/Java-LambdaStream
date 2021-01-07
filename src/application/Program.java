package application;

import entities.Product;

import java.util.*;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("iPhone", 5000.00));
        list.add(new Product("Xiaomi", 2200.00));
        list.add(new Product("Samsung", 2000.00));

        list.sort((p1, p2) -> p2.getPrice().compareTo(p1.getPrice()));

        list.forEach(p -> System.out.println(p));

    }
}
