package day09_method;

import java.util.Scanner;

public class Quiz01 {

	// �� �� �Է� ū�� ���
	public int bigint(int n1, int n2) {
		int big = 0;
		if (n1 > n2) {
			return n1;
		} else
			return n2;
	}

	public void output(int n1, int n2, int re) {
		System.out.println(n1 + "��" + n2 + "�� ū�� " + re);
	}

	public static void main(String[] args) {
		Quiz01 ex = new Quiz01();

		Scanner scan = new Scanner(System.in);

		System.out.println("�� �Է� :");
		int num = scan.nextInt();
		System.out.println("�� �Է� :");
		int num2 = scan.nextInt();
		int result = ex.bigint(num, num2);

		ex.output(num, num2, result);

	}

}
