package day09_method;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {

		Ex06_method ex = new Ex06_method();
		
		ex.display();
			System.out.println("----main ------");
		Scanner scan = new Scanner(System.in);
		int n1, n2;
		System.out.print("�� �� �Է� : ");
		n1 = scan.nextInt();
		n2 = scan.nextInt();
		int sum = ex.test(n1, n2);
		ex.printSum(n1,n2,sum);
	
	
	
	}
}
