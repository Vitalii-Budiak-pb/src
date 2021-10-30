package com.pb.budiak.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class CapitalLetter {




    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        String lineIn;
        System.out.print("Введите любую стоку: ");
        lineIn = in.nextLine();
        String toUpperCase = toUpperCase(lineIn);
        System.out.println("Измененная строка: " + toUpperCase);
        //System.out.println(my_text);

    }



    static String toUpperCase (String lineIn){
        String lineOut = "";
        String[] textSplit2 = lineIn.split(" ");
        for (int i = 0; i < textSplit2.length; i++) {
            if (textSplit2[i].length() >= 1){
                String word = textSplit2[i];
                word = word.substring(0, 1).toUpperCase() + word.substring(1, word.length());
                lineOut = lineOut + word + " ";
            }
            else {
                lineOut = lineOut + " ";
            }
        }
        return lineOut;

    }
}
