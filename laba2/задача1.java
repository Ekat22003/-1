package laba2;

import java.util.Scanner;

public class задача1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите число:");
		int num = in.nextInt();
		if (num % 3 == 0) {
			 System.out.printf("Число %s делится на 3 \n", num);
		} else {
			System.out.printf("Число %s не делится на 3 \n", num);	 
		     in.close();
		}

	}

}
