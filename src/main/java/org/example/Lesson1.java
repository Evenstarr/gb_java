package org.example;

import java.util.Arrays;
import java.util.Random;

public class Lesson1 {
    public static void main(String[] args) {
        int i = findRandInt(2000);
        System.out.println(i);

        int n = maxBit(i);
        System.out.println(n);


        System.out.println(Arrays.toString(iToMax(i, n)));

        System.out.println(Arrays.toString(minToI(i, n)));
    }

    private static int findRandInt(int num) {
        return new Random().nextInt(num);
    }

    private static int maxBit(int num) {
        return Integer.toBinaryString(num).length() - 1;
    }

    private static int[] iToMax(int i, int n) {
        int cnt = 0;

        for (int counter = i; counter <= Short.MAX_VALUE; counter++) {
            if (counter % n == 0) {
                cnt++;
            }
        }

        int[] m1 = new int[cnt];

        cnt = 0;
        for (int counter = i; counter <= Short.MAX_VALUE; counter++) {
            if (counter % n == 0) {
                m1[cnt++] = counter;
            }
        }

        return m1;
    }

    private static int[] minToI(int i, int n) {
        int cnt = 0;

        for (int counter = Short.MIN_VALUE; counter <= i; counter++) {
            if (counter % n != 0) {
                cnt++;
            }
        }

        int[] m2 = new int[cnt];

        cnt = 0;
        for (int counter = Short.MIN_VALUE; counter <= i; counter++) {
            if (counter % n != 0) {
                m2[cnt++] = counter;
            }
        }

        return m2;
    }
}