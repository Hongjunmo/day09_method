package day09_method;

import java.util.Scanner;

public class Quiz02 {

	public int op(int n) {
		if (n % 2 == 0) {
			return 0;
		} else {

			return 1;
		}
	}

	public static void main(String[] args) {

		Quiz02 ex = new Quiz02();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("수 입력");
		int num=scan.nextInt();
		
		int re=ex.op(num);
		
		if(re==0) {
			System.out.println("짝수 입니다");
		}else {
			System.out.println("홀수 입니다");
		}
		
		
		
	}
}
