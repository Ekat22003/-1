package laba1;

import java.util.Scanner;

public class Example6 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите вашу фамилию: ");
        String firstname = in.nextLine();

        System.out.println("Введите ваше имя: ");
        String name = in.nextLine();

        System.out.println("Введите ваше отчество: ");
        String patronymic = in.nextLine();

        System.out.printf("Hello, %s %s %s \n", firstname, name, patronymic);
        in.close();
    }
}
