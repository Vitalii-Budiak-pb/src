package com.pb.budiak.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int attempt = 1;
        String statement;
        int answer = 0;


        int x = random.nextInt(101);
        System.out.println("Игра началась! \nЯ загадал целое число, давай ты попробуешь его отгадать? \nЯ лишь буду немного подсказывать!");
        System.out.print("Если ты готов, отправь мне подтверждение в виде \"Да\",\"Нет\": ");
                statement = in.next();
        while (statement.equals("Да")) {
                System.out.println("x = " + x );
                System.out.print("Ваш ответ: ");
                answer = in.nextInt();
                    if(answer == x){
                        System.out.println("Поздравляю, Вы угадали число с " + attempt + "-й попытки!");
                        break;
                    }
                    else {
                        if(answer > x){
                            System.out.println("Вы не угадали, но Ваше число больше загаданного мной!");
                            System.out.print("Продолжаем? (\"Да\",\"Нет\") :");
                            statement = in.next();
                        }
                        else {
                            System.out.println("Вы не угадали, но Ваше число меньше загаданного мной!");
                            System.out.print("Продолжаем? (\"Да\",\"Нет\") :");
                            statement = in.next();
                        }
                        attempt++;
                    }

        }
        if(statement.equals("Нет")){
            System.out.println("Попробуй в следующий раз!");
        }
        else {
            if(statement.equals("Да")){
                System.out.println("\nИгра закончена!");
            }
            else {
                System.out.println("Я не понимаю других команд, попробуй заново!\nИгра закончена!");
            }

        }
    }
}
