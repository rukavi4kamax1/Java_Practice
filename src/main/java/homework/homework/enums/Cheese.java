package homework.homework.enums;

public enum Cheese {
    MOZZARELLA(220), PARMESAN(230), BRYNZA(250);
    private double calories;

    Cheese(double calories) {
        this.calories = calories;
    }// конструктор із  додатковим параметром - калорійність

    Cheese() {
    }

    @Override
    public String toString() {
        return name().toLowerCase() + ", ";
    }// перевизначений метод toString()

    public static String showCheeseEnum() {// власний метод для того, щоб не використовувати конкатенацію строк
        System.out.print("Cheese enum: ");
        StringBuilder stringBuilder = new StringBuilder();
        for (Cheese cheese : Cheese.values()) {
            if (cheese.calories != 0) {
                stringBuilder.append(cheese)
                        .append("calories: ")
                        .append(cheese.calories)
                        .append("; ");
            } else {
                stringBuilder.append(cheese);
            }
        }
        return stringBuilder.substring(0, stringBuilder.length() - 2);
    }
}
