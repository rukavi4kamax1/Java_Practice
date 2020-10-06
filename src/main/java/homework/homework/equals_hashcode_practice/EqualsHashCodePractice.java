package homework.homework.equals_hashcode_practice;

import homework.homework.Order;
import homework.homework.Pizza;
import homework.homework.Waiter;
import homework.homework.enums.Cheese;
import homework.homework.enums.Meat;
import homework.homework.enums.Vegetables;

import java.util.List;

public class EqualsHashCodePractice {

    public boolean nonOverriddenHashcode() {
        Pizza pizza1 = new Pizza(new Pizza.Dough("yeast"),
                new Pizza.Filling(Vegetables.OLIVES, Cheese.MOZZARELLA, Meat.CHICKEN));
        Pizza pizza2 = new Pizza(new Pizza.Dough("yeast"),
                new Pizza.Filling(Vegetables.OLIVES, Cheese.MOZZARELLA, Meat.CHICKEN));
        int num1 = pizza1.hashCode();
        int num2 = pizza2.hashCode();
        return num1 == num2;
    }

    public boolean overriddenHashcode() {
        Pizza.Filling filling1 = new Pizza.Filling(Vegetables.OLIVES, Cheese.MOZZARELLA, Meat.CHICKEN);
        Pizza.Filling filling2 = new Pizza.Filling(Vegetables.OLIVES, Cheese.MOZZARELLA, Meat.CHICKEN);
        int num1 = filling1.hashCode();
        int num2 = filling2.hashCode();
        return num1 == num2;
    }

    public boolean overriddenEquals() {
        Pizza pizza = new Pizza(new Pizza.Dough("yeast"),
                new Pizza.Filling(Vegetables.OLIVES, Cheese.MOZZARELLA, Meat.CHICKEN));
        Order order1 = new Order(List.of(pizza));
        Order order2 = new Order(List.of(pizza));
        return order1.equals(order2);
    }

    public boolean nonOverriddenEquals() {
        Waiter waiter1 = new Waiter("Vitalik", 5, 32);
        Waiter waiter2 = new Waiter("Vitalik", 5, 32);
        return waiter1.equals(waiter2);
    }
}
