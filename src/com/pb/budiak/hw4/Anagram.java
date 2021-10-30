package com.pb.budiak.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    private static String line1;
    private static String line2;

    public static void main(String[] args) {
        System.out.println("Hi i am a Anagram program");
        System.out.println("Enter the first line:");
        line1 = new Scanner(System.in).nextLine().replaceAll("[^A-Za-zА-Яа-я0-9]", "");
        System.out.println("Enter the second line:");
        line2 = new Scanner(System.in).nextLine().replaceAll("[^A-Za-zА-Яа-я0-9]", "");
        System.out.println(isAnagram(line1, line2));
    }

    public static boolean isAnagram(String s1, String s2) {
        char[] a = s1.toLowerCase().toCharArray();
        Arrays.sort(a);
        char[] b = s2.toLowerCase().toCharArray();
        Arrays.sort(b);
        if (a.length != b.length) {
            return false;
        } else return Arrays.equals(a, b);
    }
}