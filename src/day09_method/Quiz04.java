package day09_method;

import java.util.Scanner;

public class Quiz04 {

	public boolean so(int n) {

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public void sn(int n, boolean re) {

		if (re == false) {
			System.out.println(n + "�� �Ҽ��� �ƴմϴ�");
		} else {
			System.out.println(n + "�� �Ҽ� �Դϴ�");

		}

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Quiz04 ex = new Quiz04();
		System.out.println("�� �Է�");
		int num = scan.nextInt();

		boolean re = ex.so(num);

		ex.sn(num, re);
	}
}
