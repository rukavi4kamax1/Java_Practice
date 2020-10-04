package homework.homework;

import java.util.List;

public class Order {
    private double price;
    private int amount;
    private List<Pizza> pizza;

    public Order(List<Pizza> pizza) {
        this.pizza = pizza;
        this.amount = pizza.size();
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public List<Pizza> getPizza() {
        return pizza;
    }

    @Override
    public String toString() {
        return "Order{" +
                "price=" + price +
                ", amount=" + amount +
                ", pizza=" + pizza +
                '}';
    }
}
