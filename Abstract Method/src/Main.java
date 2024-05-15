public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();

        pizza.addTopping(new Pepperoni());
        pizza.addTopping(new Mushroom());
        pizza.addTopping(null); // This will print an error message

        System.out.println(pizza.getDescription());
        System.out.println("Total price: $" + String.format("%.2f", pizza.getTotalPrice()));
    }
}