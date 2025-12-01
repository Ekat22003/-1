package laba1;

import java.util.Scanner;

public class Example11 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите ваше имя: ");
        String name = in.nextLine();

        System.out.println("Укажите ваш год рождения: ");
        int year = in.nextInt();
        year = 2025 - year;


        System.out.printf("%s, %d \n", name, year);
        in.close();
    }
}
