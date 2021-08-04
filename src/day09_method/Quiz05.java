package day09_method;

import java.util.Scanner;

public class Quiz05 {

	public int abs(int n) {

		return Math.abs(n);

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Quiz05 ex = new Quiz05();
		int num1;
		System.out.print("¼ö ÀÔ·Â : ");
		num1 = input.nextInt();
		System.out.println(ex.abs(num1));
	}
}
