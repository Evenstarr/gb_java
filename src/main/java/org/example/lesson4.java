package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class lesson4 {
    public static void main(String[] args) {
        LinkedList<Integer> index = new LinkedList<>();
        ArrayList<String> firstName = new ArrayList<>();
        ArrayList<String> patronymic = new ArrayList<>();
        ArrayList<String> lastName = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<String> gender = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ф.И.О., Возраст, Пол через пробел");

        boolean run = true;

        int idxTmp = 0;

        while (run) {
            String in = scanner.nextLine();

            if (in.equals("x")) {
                run = false;
            } else {
                String[] data = in.split(" ");
                index.add(idxTmp);
                lastName.add(data[0]);
                firstName.add(data[1]);
                patronymic.add(data[2]);
                age.add(Integer.valueOf(data[3]));
                gender.add(data[4]);
                idxTmp++;
            }
        }

        for (int i = 0; i < lastName.size(); i++) {
            StringBuilder str = new StringBuilder();

            str.append(lastName.get(i))
                    .append(" ")
                    .append(firstName.get(i).charAt(0))
                    .append(". ")
                    .append(patronymic.get(i).charAt(0)).append(". ")
                    .append(age.get(i))
                    .append(gender.get(i).charAt(0));
            System.out.println(str);
        }

        bubbleSort(age, index);

        System.out.println("Сортировка по возрасту:");

        for (int i: index) {
            StringBuilder str = new StringBuilder();

            str.append(lastName.get(i))
                    .append(" ")
                    .append(firstName.get(i).charAt(0))
                    .append(". ")
                    .append(patronymic.get(i).charAt(0)).append(". ")
                    .append(age.get(i))
                    .append(gender.get(i).charAt(0));
            System.out.println(str);
        }
    }

    private static void bubbleSort(ArrayList<Integer> age, LinkedList<Integer> idxArr) {
        ArrayList<Integer> ageTmp = new ArrayList<>(age);

        boolean sort = true;
        int k = ageTmp.size();

        while (sort) {
            sort = false;

            for (int i = 0; i < k - 1; i++) {
                if (ageTmp.get(i) > ageTmp.get(i + 1)) {
                    int temp = ageTmp.get(i);
                    ageTmp.set(i, ageTmp.get(i + 1));
                    ageTmp.set(i + 1, temp);

                    int tempIdx = idxArr.get(i);
                    idxArr.set(i, idxArr.get(i + 1));
                    idxArr.set(i + 1, tempIdx);

                    sort = true;
                }
            }
            k--;
        }
    }
}
