package org.example;

public class lesson2 {
    public static void main(String[] args) {
        String str1 = "Blablasdfblablasdfblablasdf";
        String str2 = "blabla123";
        String str21 = "blabla";

        findSubstrings(str1, str2);
        findSubstrings(str1, str21);

        String str3 = "blabla";
        String str4 = "albalb";
        compareReverseStrings(str1, str2);
        compareReverseStrings(str3, str4);

        reverseString(str1, str1.length() - 1);

        int a = 3;
        int b = 56;

        String expression = expressionFromNumbers(a, b);

        System.out.println(expression);

        System.out.println(replaceReplace(expression));

        System.out.println(replaceCharAt(expression));
    }

    private static void findSubstrings(String str1, String str2) {
        int index = str1.indexOf(str2, 0);

        if (index != -1) {
            System.out.println("Подстрока содержится в строке");
        } else {
            System.out.println("Подстрока не содержится в строке");
        }

        // Или так
        /*if (str1.contains(str2)) {
            System.out.println("Подстрока содержится в строке");
        } else {
            System.out.println("Подстрока не содержится в строке");
        }*/
    }

    private static void compareReverseStrings(String str1, String str2) {
        String reverse = new StringBuilder(str1).reverse().toString();

        if (reverse.equals(str2)) {
            System.out.println("Строки являются вращением друг друга");
        } else {
            System.out.println("Строки не являются вращением друг друга");
        }
    }

    private static void reverseString(String str, int index) {
        if (index == 0) {
            System.out.println(str.charAt(index));
            return;
        }

        System.out.print(str.charAt(index));
        reverseString(str, index - 1);
    }

    private static String expressionFromNumbers(int a, int b) {
        StringBuilder str = new StringBuilder();

        str.append(a);
        str.append(" + ");
        str.append(b);
        str.append(" = ");
        str.append(a + b);

        str.append("\n");
        str.append(a);
        str.append(" - ");
        str.append(b);
        str.append(" = ");
        str.append(a - b);

        str.append("\n");
        str.append(a);
        str.append(" * ");
        str.append(b);
        str.append(" = ");
        str.append(a * b);
        str.append("\n");

        return str.toString();
    }

    private static String replaceCharAt(String str) {
        long begin = System.currentTimeMillis();

        StringBuilder stringBuilder = new StringBuilder(str);
        int startIndex = 0;
        while (stringBuilder.indexOf("=") != -1) {
            int indexOfEqual = stringBuilder.indexOf("=", startIndex);
            stringBuilder.deleteCharAt(indexOfEqual);
            stringBuilder.insert(indexOfEqual, "равно");
            startIndex += indexOfEqual + 4;
        }

        return stringBuilder.toString();
    }

    private static String replaceReplace(String str) {
        return str.replace("=", "равно");
    }
}
