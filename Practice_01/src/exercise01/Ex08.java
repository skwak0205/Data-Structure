package exercise01;

import java.util.Scanner;

public class Ex08 {
	
	// 가우스의 덧셈이라는 방법을 이용, 1부터 n까지의 정수 합을 구함
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("n의 값 : ");
		int n = sc.nextInt();
		
		int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0); // 합

		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	}
}
