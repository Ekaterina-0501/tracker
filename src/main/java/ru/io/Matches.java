package ru.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11. На столе 11 спичек");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            if (matches > 3 || matches < 1) {
                System.out.println("число не входит в диапазон от 1 до 3");
            } else if (matches > count) {
                System.out.println("на столе спичек меньше, чем вы хотите забрать");
            } else {
                turn = !turn;
                count = count - matches;
                System.out.println("На столе " + count + " спичек");
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
