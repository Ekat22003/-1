package laba1;

import java.util.Scanner;

public class Example9 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Какой сейчас месяц? ");
        String month = in.nextLine();

        System.out.println("Сколько дней в этом месяце?");
        int number = in.nextInt();

        System.out.printf("%s содержит %d дней \n", month, number);
        in.close();
    }
}
