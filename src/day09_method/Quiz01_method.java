package day09_method;

import java.util.Scanner;

public class Quiz01_method {
	// 두 수 입력 큰수 출력
	public int bigint(int n1, int n2) {
		int big = 0;
		if (n1 > n2) {
			return n1;
		} else
			return n2;
	}

	public int op(int n) {
		if (n % 2 == 0) {
			return 0;
		} else {

			return 1;
		}
	}

	public int odd(int n) {

		if (n % 3 == 0) {
			return 0;

		} else {
			return 1;
		}
	}

	public boolean so(int n) {

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public void abs(int n) {

		Math.abs(n);

	}

	public void ff(int n) {

		int a = 0;

		a = n % 10;
		n = n / 10;
		// a + , 반복문 돌려서 찍고 n이 0 나오면 끝내셈

	}


	}

