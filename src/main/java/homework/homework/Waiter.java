package homework.homework;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Waiter extends Employee<Order> {

    @Override
    public Order work(Order order) {
        Scanner scanner = new Scanner(System.in);
        List<Pizza> pizzas = order.getPizza();
        Iterator<Pizza> iterator = pizzas.iterator();
        while (iterator.hasNext()) {
            Pizza pizza = iterator.next();
            System.out.println("\nAnswer the waiter: ");
            System.out.println("What is the size of pizza you'd like? ");
            double size = scanner.nextDouble();
            pizza.setSize(size);
        }
        System.out.println("The order was done");
        return order;
    }
}
