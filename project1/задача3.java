package project1;

import java.util.Scanner;

public class задача3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner in = new Scanner(System.in);
				
				System.out.println("Введите число:");
				int num = in.nextInt();
				if (num % 4 == 0 && num >= 10) {
					System.out.printf("Число %s удовлетворяет заданным условиям \n", num);
				} else {
					System.out.printf("Число %s не удовлетворяет заданным условиям \n", num);	 
				     in.close();
			}

	}

}
