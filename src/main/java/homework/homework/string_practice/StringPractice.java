package homework.homework.string_practice;

import homework.homework.enums.Cheese;
import homework.homework.enums.Meat;
import homework.homework.enums.Vegetables;

public class StringPractice {

    public String strBuilderUse(String[] strings) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : strings) {
            stringBuilder.append(str).append("*");
        }
        return stringBuilder.toString();
    }

    public String[] strSplitUse(String str, String delimiter) {
        return str.split(delimiter);
    }

    public String concatDiffTypes(String str, int[] array) {
        for (int i : array) {
            str += i;
        }
        return str;
    }

    @Override
    public String toString() {
        return "StringPractice{}";
    }
}
