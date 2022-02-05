package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] o1Array = o1.split("/");
        String[] o2Array = o2.split("/");

        int firstElemCompare = o2Array[0].compareTo(o1Array[0]);

        if (firstElemCompare != 0) {
            return firstElemCompare;
        }

        for (int i = 0; i < Math.min(o1Array.length, o2Array.length); i++) {
            int compareElement = o1Array[i].compareTo(o2Array[i]);
            if (compareElement != 0) {
                return compareElement;
            }
        }
        int o1Length = o1Array.length;
        int o2Length = o2Array.length;
        return o1Length > o2Length ? 1 : -1;
    }
}