public class Mushroom extends PizzaTopping{
    public Mushroom() {
        super();
        this.description = "Mushroom";
        this.price = 1.00;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
