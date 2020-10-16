package homework.homework;

import homework.homework.enums.Cheese;
import homework.homework.enums.Meat;
import homework.homework.enums.Vegetables;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Створення об'єкту офіціант
        Waiter waiter = new Waiter("Oleh", 1, 21);

        //Створення об'єкту піцайола
        PizzaCooker cooker = new PizzaCooker("Volodymyr", 10, 45);

        //Створення об'єктів піц
        Pizza pizza1 = new Pizza(new Pizza.Dough("yeast"),
                new Pizza.Filling(Vegetables.OLIVES,
                       Cheese.MOZZARELLA, Meat.CHICKEN));
        Pizza pizza2 = new Pizza(new Pizza.Dough("puff"),
                new Pizza.Filling(Vegetables.MUSHROOMS,
                        Cheese.BRYNZA, Meat.CHICKEN));
        Pizza pizza3 = new Pizza(new Pizza.Dough("non-yeast"),
                new Pizza.Filling(Vegetables.TOMATOES,
                        Cheese.BRYNZA, Meat.SAUSAGES));

        //Створення об'єктів замовлень
        Order order1 = new Order(List.of(pizza1));
        Order order2 = new Order(List.of(pizza2, pizza1));
        Order order3 = new Order(List.of(pizza3));

        List<Order> orders = Arrays.asList(order1, order2, order3);

        //Використання ітератора
        Iterator<Order> iterator = orders.iterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            System.out.println(waiter.work(order));
            List<Pizza> pizzas = order.getPizza();
            Iterator<Pizza> iterator_pizzas = pizzas.iterator();
            while(iterator.hasNext())  {
                Pizza pizza = iterator_pizzas.next();
                System.out.println(cooker.work(pizza));
            }
        }

        //Виклики власних методів для відображення enums
        Vegetables.showVegetablesEnum();
        Meat.showMeatEnum();
        Cheese.showCheeseEnum();

    }
}
