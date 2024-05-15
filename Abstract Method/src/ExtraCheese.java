public class ExtraCheese extends PizzaTopping{
    public ExtraCheese() {
        super();
        this.description = "Extra Cheese";
        this.price = 2.00;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
