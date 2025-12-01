package laba1;

import java.util.Scanner;

public class Example8 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Какой сегодня день недели?");
        String day = in.nextLine();

        System.out.println("Какой сейчас месяц? ");
        String month = in.nextLine();

        System.out.println("Какое сегодня число?");
        int number = in.nextInt();

        System.out.printf("День недели: %s Дата: %d  Месяц: %s \n", day, number, month);
        in.close();
    }
}
