package day09_method;

import java.util.Scanner;

public class Ex03_Method {
	
	public void sumFunc() {
		Scanner scan =new Scanner(System.in);
		int num , su,sum;
		System.out.print("첫 수 입력 : ");
		num = scan.nextInt();
		System.out.print("두 수 입력 : ");
		su=scan.nextInt();
		sum= num+su;
		System.out.println("두합 : "+ sum);
		
		
	}

}
