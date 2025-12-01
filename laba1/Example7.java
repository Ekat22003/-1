package laba1;

import java.util.Scanner;

public class Example7 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите ваше имя: ");
        String name = in.nextLine();

        System.out.println("Введите ваш возраст");
        int age = in.nextInt();

        System.out.printf("Имя: %s Возраст: %d \n", name, age);
        in.close();
    }
}
