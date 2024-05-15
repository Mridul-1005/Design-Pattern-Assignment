public abstract class PizzaTopping {
    protected String description;
    protected double price;

    public PizzaTopping() {
        this.description = "Base Topping";
        this.price = 0.0;
    }

    public abstract String getDescription();

    public double getPrice() {
        return price;
    }
}
