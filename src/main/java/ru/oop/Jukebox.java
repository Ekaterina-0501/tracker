package ru.oop;

public class Jukebox {

    public void music(int position) {
        String song = "Песня не найдена";
        switch (position) {
            case 1:
                song = "Пусть бегут неуклюже";
                break;
            case 2:
                song = "Спокойной ночи";
                break;
        }
        System.out.println(song);
    }

    public static void main(String[] args) {
        Jukebox melody = new Jukebox();
        melody.music(1);
        melody.music(2);
        melody.music(5);
    }
}
