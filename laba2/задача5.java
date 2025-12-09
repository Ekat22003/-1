package laba2;

import java.util.Scanner;

public class задача5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Введите число:");
		int N = in.nextInt();
		if (N < 1000) {
            System.out.println("В числе нет тысячной разрядной цифры.");
        } else {
            int digit = (N / 1000) % 10;
            System.out.println("Число тысяч: " + digit);
        }
    }

}

