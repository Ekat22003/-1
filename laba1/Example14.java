package laba1;

import java.util.Scanner;

public class Example14 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int num2 = in.nextInt();

        int num1 = num2 - 1;
        int num3 = num2 + 1;
        int sum = num2 + num1 + num3;
        int num4 = sum * sum;

        System.out.printf("%d%d%d%d \n", num1, num2, num3, num4);
    }
}
