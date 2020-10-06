package homework.homework;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Waiter waiter = new Waiter("Oleh", 2, 21);
        PizzaCooker cooker = new PizzaCooker("Volodymyr", 10, 45);
        Pizza pizza1 = new Pizza(new Pizza.Dough("yeast"),
                new Pizza.Filling(Vegetables.OLIVES,
                       Cheese.MOZZARELLA, Meat.CHICKEN));
        Pizza pizza2 = new Pizza(new Pizza.Dough("puff"),
                new Pizza.Filling(Vegetables.MUSHROOMS,
                        Cheese.BRYNZA, Meat.CHICKEN));
        Pizza pizza3 = new Pizza(new Pizza.Dough("non-yeast"),
                new Pizza.Filling(Vegetables.TOMATOES,
                        Cheese.BRYNZA, Meat.SAUSAGES));
        Order order1 = new Order(List.of(pizza1));
        Order order2 = new Order(List.of(pizza2, pizza1));
        Order order3 = new Order(List.of(pizza3));
        List<Order> orders = Arrays.asList(order1, order2, order3);
        Iterator<Order> iterator = orders.iterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            System.out.println(waiter.work(order));
            System.out.println(cooker.work(order));
        }
    }
}
