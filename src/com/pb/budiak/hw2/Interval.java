package com.pb.budiak.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;

        System.out.print("Введите целое число в диапазоне от [0 - 100]: ");
        x = in.nextInt();

        if (x < 0){
            System.out.println("Ошибка!\nВаше число меньше \"0\"");
        }

        if (x > 100){
            System.out.println("Ваше число больше допустимого диапазона.\nПопробуйте заново!");
        }

        if (x >= 0 && x <= 14){
            System.out.println("Ваше число попадает в диапазон [0 - 14]");
        }

        if (x >= 15 && x <= 35){
            System.out.println("Ваше число попадает в диапазон [15 - 35]");
        }

        if (x >= 36 && x <= 50){
            System.out.println("Ваше число попадает в диапазон [36 - 50]");
        }

        if (x >= 51 && x <= 100){
            System.out.println("Ваше число попадает в диапазон [51 - 100]");
        }
    }
}
