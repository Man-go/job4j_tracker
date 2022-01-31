package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] results = new Item[size];
        int counter = 0;
        for (int i = 0; i < size; i++) {
            if (items[i] != null) {
                results[counter++] = items[i];
            }
        }
        return Arrays.copyOf(results, counter);
    }

    public Item[] findByName(String key) {
        Item[] results = new Item[size];
        //Item[] results = findAll();
        int counter = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(key)) {
                results[counter++] = items[i];
            }
        }
        return Arrays.copyOf(results, counter);
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = items[index];
                break;
            }
        }
        return rsl;
    }
}