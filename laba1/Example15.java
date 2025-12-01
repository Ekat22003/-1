package laba1;

import java.util.Scanner;

public class Example15 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите 1-е число: ");
        int num1 = in.nextInt();

        System.out.println("Введите 2-е число: ");
        int num2 = in.nextInt();
        int sum1 = num1 + num2;
        int dif;

        if (num1 < num2) {
            dif = num2 - num1;
        } else if (num1 > num2) {
            dif = num1 - num2;
        } else {
            dif = 0;
        }
        System.out.printf("Сумма чисел: %d Разность чисел: %d \n", sum1, dif);
        in.close();
    }
}
