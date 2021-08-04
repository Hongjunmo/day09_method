package day09_method;

import java.util.Scanner;

public class Ex06_method {

	public void display() {
		Scanner scan = new Scanner(System.in);
		int n1, n2;
		System.out.print("두 수 입력 : ");
		n1 = scan.nextInt();
		n2 = scan.nextInt();
		int sum = test(n1, n2);
		printSum(n1,n2,sum);
	}

	public int test(int n, int n2) {
		return n + n2;
	}

	
	public void printSum(int n1, int n2, int s) {
		System.out.println(n1 + "+" + n2 + "=" + s);
	}
}
