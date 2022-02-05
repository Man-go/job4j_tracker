package ru.job4j.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class OrderConvertTest {
    @Test
    public void whenSingleOrder() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("3sfe", "Dress"));
        HashMap<String, Order> map = OrderConvert.process(orders);
        assertThat(map.get("3sfe"), is(new Order("3sfe", "Dress")));
    }

    @Test
    public void whenDuplicatesOrder() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("3sfe", "Dress"));
        orders.add(new Order("4k29", "Jeans"));
        orders.add(new Order("7j55", "Skirt"));
        orders.add(new Order("3sfe", "Dress"));
        orders.add(new Order("7j55", "Skirt"));
        HashMap<String, Order> map = OrderConvert.process(orders);
        assertThat(map.size(), is(3));
    }
}