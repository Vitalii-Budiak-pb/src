package com.pb.budiak.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class CapitalLetter {




    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        String line_in;
        System.out.print("Введите любую стоку: ");
        line_in = in.nextLine();
        String toUpperCase = toUpperCase(line_in);
        System.out.println("Измененная строка: " + toUpperCase);
        //System.out.println(my_text);

    }



    static String toUpperCase (String line_in){
        String line_out = "";
        //String line_in = my_text;//"asdas  as aseq w      e sda aswe azs das daweq12e we";
        String[] text_split2 = line_in.split(" ");
        for (int i = 0; i < text_split2.length; i++) {
            if (text_split2[i].length() >= 1){
                String word = text_split2[i];
                word = word.substring(0, 1).toUpperCase() + word.substring(1, word.length());
                line_out = line_out + word + " ";
            }
            else {
                line_out = line_out + " ";
            }
        }
        return line_out;

    }
}
