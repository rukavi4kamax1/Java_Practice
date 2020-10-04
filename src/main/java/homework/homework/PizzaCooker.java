package homework.homework;

import java.util.Iterator;
import java.util.List;

public class PizzaCooker extends Employee<Order> {
    private static final double MAX_PRICE = 250;
    private static final double UPPER_INTERMEDIATE_PRICE = 220;
    private static final double INTERMEDIATE_PRICE = 200;
    private static final double UPPER_BEGINNER_PRICE = 180;
    private static final double BEGINNER_PRICE = 150;
    private static final double MIN_PRICE = 100;
    private static final double STANDARD_SIZE = 30;

    @Override
    public Order work(Order order) {
        List<Pizza> pizzas = order.getPizza();
        Iterator<Pizza> iterator = pizzas.iterator();
        while (iterator.hasNext()) {
            Pizza pizza = iterator.next();
            setPrice(pizza);
        }
        System.out.println("\nThe pizzas have been cooked. Info about them: ");
        return order;
    }

    private void setPrice(Pizza pizza) {
        Pizza.Filling filling = pizza.getFilling();
        if (pizza.getFilling().getMeat() != null && pizza.getFilling().getCheese() != null
                && pizza.getFilling().getVegetables() != null && pizza.getSize() > STANDARD_SIZE) {
            pizza.setPrice(MAX_PRICE);
        } else if (pizza.getFilling().getMeat() != null && pizza.getFilling().getCheese() != null
                && pizza.getFilling().getVegetables() != null && pizza.getSize() < STANDARD_SIZE) {
            pizza.setPrice(UPPER_INTERMEDIATE_PRICE);
        } else if (pizza.getFilling().getMeat() != null && pizza.getFilling().getCheese() != null
                && pizza.getSize() > STANDARD_SIZE) {
            pizza.setPrice(INTERMEDIATE_PRICE);
        } else if (pizza.getFilling().getMeat() != null && pizza.getFilling().getCheese() != null
                && pizza.getSize() < STANDARD_SIZE) {
            pizza.setPrice(UPPER_BEGINNER_PRICE);
        } else if (pizza.getSize() > STANDARD_SIZE) {
            pizza.setPrice(BEGINNER_PRICE);
        } else {
            pizza.setPrice(MIN_PRICE);
        }
    }
}
