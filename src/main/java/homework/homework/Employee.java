package homework.homework;

public abstract class Employee<T> {
    private String name;
    private double experience;
    private int age;

    public Employee(String name, double experience, int age) {
        this.name = name;
        this.experience = experience;
        this.age = age;
    }

    public T work(T commitment){
        return null;
    }
}
