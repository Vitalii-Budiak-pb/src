package com.pb.budiak.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        String line_one;
        String line_two;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        line_one = in.nextLine();
        System.out.print("Введите вторую строку: ");
        line_two = in.nextLine();
        getResult(line_one, line_two);
    }

    public static void getResult(String param, String param2) {
        String firstEnteredValue = param.replaceAll("[^A-Za-zА-Яа-я-0-9]", "");
        String secondEnteredValue = param2.replaceAll("[^A-Za-zА-Яа-я-0-9]", "");
        boolean isAnagram = isAnagram(firstEnteredValue, secondEnteredValue);
        System.out.println(isAnagram);
    }


    private static boolean isAnagram(String param1, String param2) {
        StringBuilder sb = new StringBuilder();
        String strResult = "";
        char[] c = param1.toCharArray();
        char[] b = param2.toCharArray();
        if (c.length == b.length) {
            for (char c1 : c) {
                for (char b1 : b) {
                    if (c1 == b1) {
                        strResult = sb.append(b1).toString();
                    }
                }
            }
            System.out.println(strResult);
            return param1.equalsIgnoreCase(strResult);
        } else {
            System.out.println("Длинна введенных строк не совпадает");
            return false;
        }
    }

    /*public static boolean permutation(String line_one, String line_two) {
        if (line_one.length() != line_two.length()) {
            return false;
        }

        int[] letters = new int[256];

        char[] s_array = line_one.toCharArray();
        for (char c : s_array) {
            letters[c]++;
        }

        for (int i = 0; i < line_two.length(); i++) {
            int c = (int) line_two.charAt(i);
            if (--letters[c] < 0) {
                return false;
            }
        }

        return true;
    }*/
}
