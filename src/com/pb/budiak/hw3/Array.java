package com.pb.budiak.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x ;
        int countter = 1;
        int index = 0;
        int summ = 0;
        int cnt = 0;
        String Array = "";
        String ArrayPositive = "";
        boolean isSorted = false;
        int[] array = new int[10];

        System.out.println("Введите 10 целых чисел что бы заполнить одномерный массив.");

        while(countter != 11){
            System.out.print( countter +"-й элемент массива: ");
            x = in.nextInt();
            array[index] = x;
            Array = Array + array[index] + "," ;
            summ = summ + x;
            if(x > 0 ){
                ArrayPositive = ArrayPositive + x + ",";
                cnt++;
            }
            countter++;
            index++;
        }

        while(!isSorted){
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if(array[i] < array[i -1]){
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i -1] = temp;
                    isSorted = false;
                }
            }
        }


        System.out.println("\n\nВаш массив: [" + Array.substring(0,Array.length()-1) + "]");
        System.out.println("Сумма всех эелементов Вашего массива: " + summ);
        System.out.println("Положительные элементы Вашего массива: " + ArrayPositive.substring(0,ArrayPositive.length()-1));
        System.out.println("Количество положительных элементов Вашего массива: "+ cnt);
        System.out.println("Отсортированный Ваш массив с помощью метода \"Пузырьков\": " + Arrays.toString(array));

    }
}
