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
			System.out.println(n1+"�� 3�� �����");
		}else {
			System.out.println(n1+"�� 3�� ����� �ƴ�");
			
		}
		
	}

	public static void main(String[] args) {
		Quiz03 ex = new Quiz03();
		Scanner scan = new Scanner(System.in);

		System.out.println("�� �Է�");
		int num = scan.nextInt();
		
		int re = ex.odd(num);
		
		ex.out(num, re);
		
		
		
		
		

	}
}
