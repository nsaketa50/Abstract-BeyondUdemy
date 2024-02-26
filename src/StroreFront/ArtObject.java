package StroreFront;

public class ArtObject extends ProductForSale {

    public ArtObject(String type, double price, String description) {
        super(type, price, description);

    }

    @Override
    public void showDetails() {

        System.out.println("This " + type + " is a beautiful not fool");
        System.out.printf("The price of this item is $%6.2f %n", price);
        System.out.println(description);
    }

}
