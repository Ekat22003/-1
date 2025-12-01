package laba1;

import java.util.Scanner;

public class Example13 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите 1-е число: ");
        int num1 = in.nextInt();

        System.out.println("Введите 2-е число: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;

        System.out.printf("Сумма чисел: %d \n", sum);
    }
}
