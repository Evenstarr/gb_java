package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class lesson3 {
    public static void main(String[] args) {
        List<String> colours = new ArrayList<>();
        // 1
        colours.add("Green");
        colours.add("Blue");
        colours.add("Yellow");
        colours.add("Purple");
        colours.add("Pink");
        colours.add("Aqua");

        System.out.println(colours);

        // 2
        for (String str: colours) {
            str += "!";
            System.out.println(str);
        }

        // 3
        colours.add(1, "Orange");
        System.out.println(colours);

        // 4
        int idx1 = 2;
        System.out.println(colours.get(idx1));

        // 5
        int idx2 = 3;
        colours.set(idx2, "Violet");

        System.out.println(colours);

        // 6
        colours.remove(4);

        System.out.println(colours);

        // 7
        for (String str : colours){
            if (str.contains("r")){
                System.out.println(str);
            }
        }

        // 8
        List<String> newColours = new ArrayList<>();
        for (String str: colours) {
            if (str.contains("e")){
                newColours.add(str);
            }
        }

        System.out.println(newColours);

        // 9
        colours.retainAll(newColours);

        System.out.println(colours);

        // 10
        Collections.sort(newColours);
        System.out.println(newColours);

        // 11
        long begin = System.currentTimeMillis();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            numbers.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - begin);

        List<Integer> linkedNumbers = new LinkedList<>();
        begin = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedNumbers.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println(end - begin);

        // На 1000 разницы не видно, а на 100000 - ArrayList в 2 раза быстрее, чем LinkedList.
    }
}