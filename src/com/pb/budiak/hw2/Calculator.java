package com.pb.budiak.hw2;

import javax.swing.*;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int operand1;
        int operand2;
        String sign;

        System.out.print("Введите первое число: ");
        operand1 = in.nextInt();
        System.out.print("Введите второе число: ");
        operand2 = in.nextInt();
        System.out.print("Выберите знак арифметической операции (+,-,*,/): ");
        sign = in.next();


        switch (sign){
            case "+":
                System.out.println("Результат: " + (operand1 + operand2));
                break;

            case "-":
                System.out.println("Результат: " + (operand1 - operand2));
                break;

            case "*":
                System.out.println("Результат: " + (operand1 * operand2));
                break;

            case "/":
                if(operand2 != 0 ){
                    System.out.println("Результат: " + (operand1 / operand2));
                } else {
                    System.out.println("Ошибка, деление на \"0\".\nПопробуйте заново!");
                }
        }


    }
}
