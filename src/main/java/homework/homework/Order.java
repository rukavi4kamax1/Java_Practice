package homework.homework;

import java.util.List;
import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Order order = (Order) o;
        return Double.compare(order.price, price) == 0 &&
                amount == order.amount &&
                Objects.equals(pizza, order.pizza);
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
