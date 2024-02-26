package StroreFront;

import java.util.ArrayList;

record OrderItem(int quantity, ProductForSale product) {
}

public class Store {

    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    public static void main(String[] args) {
        storeProducts.add(new ArtObject("Oil Painting", 34, "This is done by ABF painted in 2020"));
        storeProducts.add(new ArtObject("Sculpture", 600, "This is from 1929"));

        listProducts();

        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemOrder(order1, 1, 3);
        addItemOrder(order1, 0, 2);
        printOrder(order1);
    }

    public static void listProducts() {
        for (var item : storeProducts) {
            System.out.println("-".repeat(20));
            item.showDetails();
        }
    }

    public static void addItemOrder(ArrayList<OrderItem> order, int orderIndex, int quantity) {
        order.add(new OrderItem(quantity, storeProducts.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order) {
        double salesTotal = 0;
        for (var item : order) {
            item.product().printItems(item.quantity());
            salesTotal += item.product().getPrice(item.quantity());
        }
        System.out.printf("Sales Total = $%6.2f %n", salesTotal);

    }
}
