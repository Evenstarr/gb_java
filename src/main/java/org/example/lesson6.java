package org.example;

import java.util.HashMap;

public class lesson6 {
    public static void main(String[] args) {
        MyHashSet set = new MyHashSet();
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(null);
        set.add(null);
        set.add(8);
        set.add(9);
        System.out.println(set.toNewString());
        System.out.println(set.get(1));
    }
}

class MyHashSet {
    private final HashMap<Integer, Object> values = new HashMap<>();

    private static final Object X = new Object();

    void add(Integer data) {
        values.put(data, X);
    }

    public String toNewString() {
        return values.keySet().toString();
    }

    int get(int index) {
        return (int) values.keySet().toArray()[index];
    }
}
