package timus;

import java.util.Scanner;

public class task_1293 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();

        if (N < 1 || N > 100 || A < 1 || A > 100 || B < 1 || B > 100) {
            System.out.println("Ошибка: числа должны быть в диапазоне от 1 до 100");
            in.close();
            return;
        }

        int S = N * A * B; // с одной стороны
        int S2 = S * 2; // с обеих сторон

        System.out.println(S2);
        in.close();
    }
}
