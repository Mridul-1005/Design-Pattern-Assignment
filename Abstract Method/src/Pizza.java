import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private List<PizzaTopping> toppings;

    public Pizza() {
        this.toppings = new ArrayList<>();
    }

    public void addTopping(PizzaTopping topping) {
        if (topping != null) {
            toppings.add(topping);
        } else {
            System.out.println("Invalid topping. Please add a PizzaTopping object.");
        }
    }

    public String getDescription() {
        StringBuilder description = new StringBuilder("Pizza with:");
        for (PizzaTopping topping : toppings) {
            description.append("\n  - ").append(topping.getDescription());
        }
        return description.toString();
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (PizzaTopping topping : toppings) {
            totalPrice += topping.getPrice();
        }
        return totalPrice;
    }
}
