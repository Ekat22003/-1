package laba1;

import java.util.Scanner;

public class Example12 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Укажите ваш возраст: ");
        int age = in.nextInt();
        age = 2025 - age;


        System.out.printf("Год рождения пользователя: %d \n", age);
        in.close();
    }
}
