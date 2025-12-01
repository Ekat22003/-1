package laba1;

import java.util.Scanner;

public class Example10 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Укажите ваш год рождения: ");
        int year = in.nextInt();
        year = 2025 - year;


        System.out.printf("Возраст пользователя: %d \n", year);
        in.close();
    }
}
