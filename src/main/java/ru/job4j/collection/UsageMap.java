package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("abc@gmail.com", "Ivanova Katerina");
        map.put("xyz@gmail.com", "Petr Petrov");
        map.put("abc@gmail.com", "Ivanova Katerina");
        map.put("aaa@gmail.com", "Ivanova Katerina");

        for (String s : map.keySet()) {
            System.out.println(map.get(s));
        }
    }
}
