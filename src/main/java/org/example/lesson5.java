package org.example;

import java.util.HashMap;

public class lesson5 {
    public static void main(String[] args) {
        HashMap<Integer, String> colours = new HashMap<>();

        colours.put(1, "Green");
        colours.put(2, "Red");
        colours.put(3, "Yellow");
        colours.put(4, "Violet");
        colours.put(5, "Blue");
        colours.put(6, "Aqua");

        colours.forEach((k, v) -> System.out.println(v));

        colours.forEach((key, val) -> colours.compute(key, (k, v) -> v + "!"));

        colours.forEach((k, v) -> System.out.println(v));

        HashMap<Integer, String> colours2 = new HashMap<>();

        colours2.put(1, "Green");
        colours2.put(3, "Yellow");
        colours2.put(5, "Blue");
        colours2.put(7, "Orange");
        colours2.put(8, "Pink");
        colours2.put(9, "Brown");
        colours2.put(10, "White");

        colours2.forEach((k, v) -> System.out.println(v));

        HashMap<Integer, String> colours3 = new HashMap<>();

        for (Integer s: colours.keySet()) {
            if (colours2.containsKey(s)) {
                colours.merge(s, colours2.get(s), (a, b) -> a + b);
                colours3.put(s, colours.get(s));
            }
        }

        System.out.println("------------");
        colours3.forEach((k, v) -> System.out.println(v));
    }
}
