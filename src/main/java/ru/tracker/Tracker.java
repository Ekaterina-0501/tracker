package ru.tracker;

import java.util.Arrays;
import java.util.Objects;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        Item rsl = null;
        if (indexOf(id) != -1) {
            rsl = items[indexOf(id)];
        }
        return rsl;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[size];
        int i = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (Objects.equals(key, item.getName())) {
                rsl[i++] = item;
            }
        }
        rsl = Arrays.copyOf(rsl, i);
        return rsl;
    }

    public boolean replace(int id, Item item) {
        boolean rsl = false;
        if ((indexOf(id) != -1)) {
            items[indexOf(id)].setName(item.getName());
            rsl = true;
        }
        return rsl;
    }
}