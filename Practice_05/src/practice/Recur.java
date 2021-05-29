package practice;

import java.util.Scanner;

public class Recur {
	// 재귀 함수
	static void recur(int n) {
		if (n > 0) {
			recur(n - 1);
			System.out.println(n);
			recur(n - 2);
		}
	}

	// 꼬리 재귀를 제거
	static void recurTail(int n) {
		while (n > 0) {
			recur(n - 1);
			System.out.println(n);
			n = n - 2;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요. :");
		int x = sc.nextInt();

		recur(x);
	}
}
