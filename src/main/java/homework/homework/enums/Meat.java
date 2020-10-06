package homework.homework.enums;

public enum Meat {
    CHICKEN(150), SAUSAGES;
    private double calories;

    Meat(double calories) {
        this.calories = calories;
    }

    Meat() {
    }

    @Override
    public String toString() {
        return name().toLowerCase() + ", ";
    }

    public static String showMeatEnum() {
        System.out.print("Meat enum: ");
        StringBuilder stringBuilder = new StringBuilder();
        for (Meat meat : Meat.values()) {
            if (meat.calories != 0) {
                stringBuilder.append(meat)
                        .append("calories: ")
                        .append(meat.calories)
                        .append("; ");
            } else {
                stringBuilder.append(meat);
            }
        }
        return stringBuilder.substring(0, stringBuilder.length() - 2);
    }
}
