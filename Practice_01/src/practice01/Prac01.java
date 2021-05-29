package practice01;

import java.util.Scanner;

public class Prac01 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

//		System.out.println("세 정수의 최댓값을 구합니다.");

		
		System.out.print("a의 값 : ");
		int a = stdIn.nextInt();
		System.out.print("b의 값 : ");
		int b = stdIn.nextInt();
		System.out.print("c의 값 : ");
		int c = stdIn.nextInt();
//
//		// a, b, c의 최댓값을 구하여 max에 대입
//		int max = a;
//		if (b > max)
//			max = b;
//		if (c > max)
//			max = c;
//
//		System.out.println("최댓값은 " + max + "입니다.");

		System.out.println("중앙값은 " + med3(a,b,c));
		
		stdIn.close();

//		System.out.println("max3(3,2,1) = " + max3(3, 2, 1));
	}

	static int max3(int a, int b, int c) {
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;

		return max; // 구한 최댓값을 호출한 곳으로 반환
	}

	// 중앙값 구하기
	static int med3(int a, int b, int c) {
		if (a >= b) {
			if (b >= c) {
				return b;
			} else if (a <= c) {
				return a;
			} else {
				return c;
			}
		} else if (a > c) {
			return a;
		} else if (b > c) {
			return c;
		} else {
			return b;
		}
	}
}
