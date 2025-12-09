package project1;

import java.util.Scanner;

public class задача4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Введите число:");
		int N = in.nextInt();
	    if (N >= 5 && N <= 10) {
	    	System.out.printf("Число %s удовлетворяет заданным условиям \n", N);
		} else {
			System.out.printf("Число %s не удовлетворяет заданным условиям \n", N);	 
		     in.close();
	}

}

}