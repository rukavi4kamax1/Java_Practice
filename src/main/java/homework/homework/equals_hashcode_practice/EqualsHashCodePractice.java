package homework.homework.equals_hashcode_practice;

import java.util.List;
import homework.homework.Filling;
import homework.homework.Order;
import homework.homework.Pizza;
import homework.homework.Waiter;
import homework.homework.enums.Cheese;
import homework.homework.enums.Meat;
import homework.homework.enums.Vegetables;

public class EqualsHashCodePractice {

    /*Викликаємо неперевизначений метод hashcode() класу
        Pizza. В результаті функція повертає false,
    оскільки методи неперевизначені і щоразу генерується
    новий унікальний хешкод*/
    public boolean nonOverriddenHashcode() {
        Pizza pizza1 = new Pizza(new Pizza.Dough("yeast"),
                new Filling(Vegetables.OLIVES, Cheese.MOZZARELLA, Meat.CHICKEN));
        Pizza pizza2 = new Pizza(new Pizza.Dough("yeast"),
                new Filling(Vegetables.OLIVES, Cheese.MOZZARELLA, Meat.CHICKEN));
        int num1 = pizza1.hashCode();
        int num2 = pizza2.hashCode();
        return num1 == num2;
    }

    /*Викликаємо перевизначений метод hashcode() класу
        Filling. В результаті функція повертає true,
    оскільки методи перевизначені і об'єкти і рівними*/
    public boolean overriddenHashcode() {
        Filling filling1 = new Filling(Vegetables.OLIVES, Cheese.MOZZARELLA, Meat.CHICKEN);
        Filling filling2 = new Filling(Vegetables.OLIVES, Cheese.MOZZARELLA, Meat.CHICKEN);
        int num1 = filling1.hashCode();
        int num2 = filling2.hashCode();
        return num1 == num2;
    }

    /*Викликаємо перевизначений метод equals() класу
        Order. В результаті функція повертає true,
    оскільки методи перевизначені і об'єкти і рівними*/
    public boolean overriddenEquals() {
        Pizza pizza = new Pizza(new Pizza.Dough("yeast"),
                new Filling(Vegetables.OLIVES, Cheese.MOZZARELLA, Meat.CHICKEN));
        Order order1 = new Order(List.of(pizza));
        Order order2 = new Order(List.of(pizza));
        return order1.equals(order2);
    }

    /*Викликаємо неперевизначений метод equals() класу
       Order. В результаті функція повертає false,
    оскільки методи неперевизначені. Неперевизначений метод поверне
    true лише в тому випадку, якщо один об'єкт буде мати те ж посилання,
    що й інший(саме так порівнює об'єкти неперевизначений метод equals())*/
    public boolean nonOverriddenEquals() {
        Waiter waiter1 = new Waiter("Vitalik", 5, 32);
        Waiter waiter2 = new Waiter("Vitalik", 5, 32);
        return waiter1.equals(waiter2);
    }
}
