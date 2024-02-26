package StroreFront;

public abstract class ProductForSale {

    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getPrice(int quantity) {
        return price * quantity;
    }

    public void printItems(int quantity) {
        System.out.printf("%d quantity at $%f each, %s %n", quantity, price, type, description);
    }

    protected abstract void showDetails();

}
