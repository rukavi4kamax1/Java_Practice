package homework.homework;

import homework.homework.exception.WrongOrderException;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Waiter extends Employee<Order> {

    public Waiter(String name, double experience, int age) {
        super(name, experience, age);
    }

    @Override
    public Order work(Order order) {
        Scanner scanner = new Scanner(System.in);
        List<Pizza> pizzas = order.getPizza();
        Iterator<Pizza> iterator = pizzas.iterator();
        while (iterator.hasNext()) {
            Pizza pizza = iterator.next();
            System.out.println("\nAnswer the waiter: ");
            System.out.println("What is the size of pizza you'd like? ");
            if (scanner.nextDouble() < 10) {
                try {
                    throw new WrongOrderException("The size of pizza is too small...");
                } catch (WrongOrderException e) {
                    e.printStackTrace();
                } finally {
                    System.out.println("Enter the size more than 10 the next time...");
                }
            }
            double size = scanner.nextDouble();
            pizza.setSize(size);
        }
        System.out.println("The order was done");
        return order;
    }
}
