package homework.homework.enums;

public enum Vegetables {
    TOMATOES(88), CORNS(102), OLIVES(188), MUSHROOMS(98);

    private double calories;

    Vegetables(double calories) {
        this.calories = calories;
    }

    Vegetables() {
    }

    @Override
    public String toString() {
        return name().toLowerCase() + ", ";
    }

    public static String showVegetablesEnum() {
        System.out.print("Vegetables enum: ");
        StringBuilder stringBuilder = new StringBuilder();
        for (Vegetables vegetable : Vegetables.values()) {
            if (vegetable.calories != 0) {
                stringBuilder.append(vegetable)
                        .append("calories: ")
                        .append(vegetable.calories)
                        .append("; ");
            } else {
                stringBuilder.append(vegetable);
            }
        }
        return stringBuilder.substring(0, stringBuilder.length() - 2);
    }
}
