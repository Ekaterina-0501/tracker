package ru.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        System.out.println("Я великий Оракул. Что ты хочешь узнать? ");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        int answer = new Random().nextInt(3);
        String result = "Может быть";
        switch (answer) {
            case 0:
                result = "Да";
                break;
            case 1:
                result = "Нет";
                break;
        }
        System.out.println(result);
    }
}
