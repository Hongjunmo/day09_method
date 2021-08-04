package day09_method;

import java.util.Scanner;

public class Quiz03 {
	public int odd(int n) {

		if (n % 3 == 0) {
			return 0;

		} else {
			return 1;
		}

	}
	
	public void out(int n1, int re) {
		if(re ==0) {
			System.out.println(n1+"은 3의 배수임");
		}else {
			System.out.println(n1+"은 3의 배수가 아님");
			
		}
		
	}

	public static void main(String[] args) {
		Quiz03 ex = new Quiz03();
		Scanner scan = new Scanner(System.in);

		System.out.println("수 입력");
		int num = scan.nextInt();
		
		int re = ex.odd(num);
		
		ex.out(num, re);
		
		
		
		
		

	}
}
