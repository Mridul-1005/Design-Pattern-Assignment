public class Pepperoni extends PizzaTopping{
    public Pepperoni() {
        super();
        this.description = "Pepperoni";
        this.price = 1.50;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
