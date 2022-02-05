package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int leftLength = left.length();
        int rightLength = right.length();
        for (int i = 0; i < Math.min(leftLength, rightLength); i++) {
            int delta = Character.compare(left.charAt(i), right.charAt(i));
            if (delta != 0) {
                return delta;
            }
        }
        return Integer.compare(leftLength, rightLength);
    }
}
