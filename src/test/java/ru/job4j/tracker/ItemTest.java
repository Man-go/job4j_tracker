package ru.job4j.tracker;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void itemSortAsc() {
        Item itemA = new Item("aaa");
        Item itemZ = new Item("zzz");
        Item itemC = new Item("ccc");
        List<Item> items = Arrays.asList(itemA, itemZ, itemC);
        List<Item> itemsSorted = List.of(itemA, itemC, itemZ);
        Collections.sort(items, new ItemAscByName());
        assertThat(items, is(itemsSorted));
    }

    @Test
    public void itemSortDesc() {
        Item itemA = new Item("aaa");
        Item itemZ = new Item("zzz");
        Item itemB = new Item("bbb");
        Item itemX = new Item("xxx");
        List<Item> items = Arrays.asList(itemA, itemZ, itemB, itemX);
        List<Item> expected = Arrays.asList(itemZ, itemX, itemB, itemA);
        Collections.sort(items, new ItemDescByName());
        assertThat(items, is(expected));
    }
}