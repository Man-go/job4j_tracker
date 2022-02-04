package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        Set<String> checkText = new HashSet<>();
        for (String s : origin) {
            checkText.add(s);
        }
        String[] text = duplicateText.split(" ");

        for (String s : text) {
            if (!checkText.contains(s)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}