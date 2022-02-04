package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("abc@gmail.com", "Ivanova Katerina");

        for (String s : map.keySet()) {
            System.out.println(map.get(s));
        }
    }
}
