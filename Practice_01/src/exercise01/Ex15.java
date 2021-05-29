package exercise01;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("단수 값 : ");
		int n = sc.nextInt();
		triangleLB(n);
		
		System.out.println("--------------------------------");
		
		triangleLU(n);
		
		System.out.println("--------------------------------");
		
		triangleRU(n);
		
		System.out.println("--------------------------------");
		
		triangleRB(n);
		
		System.out.println("--------------------------------");
		
		spira(n);
		
		System.out.println("--------------------------------");
		
		npira(n);
	}
	
	static void triangleLB(int n) {
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력");
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleLU(int n) {
		System.out.println("왼쪽 위가 직각인 이등변 삼각형을 출력");
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n-i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleRU(int n) {
		System.out.println("오른쪽 위가 직각인 이등변 삼각형을 출력");
		
		for (int i = 1; i <= n; i++) { 				// i행 (i = 1, 2, … ,n)
			for (int j = 1; j <= i - 1; j++) 		// i-1개의 ' '를 나타냄
				System.out.print(' ');
			for (int j = 1; j <= n - i + 1; j++) 	// n-i+1개의 '*'를 나타냄
				System.out.print('*');
			System.out.println();					// 개행(줄변환)
		}
	}
	
	static void triangleRB(int n) {
		System.out.println("오른쪽 아래가 직각인 이등변 삼각형을 출력");
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void spira(int n) {
		System.out.println("피라미드 모양으로 나타냅니다.");
		
		for (int i = 1; i <= n; i++) { 					// i행 (i = 1, 2, … ,n)
			for (int j = 1; j <= n - i + 1; j++) 		// n-i+1개의 ' '를 나타냄
				System.out.print(' ');
			
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) 	// (i-1)*2+1개의 '*'를 나타냄
				System.out.print('*');
			System.out.println(); 						// 개행(줄변환)
		}
	}
	
	static void npira(int n) {
		for (int i = 1; i <= n; i++) { 					// i행 (i = 1, 2, … ,n)
			for (int j = 1; j <= n - i + 1; j++) 		// n-i+1개의 ' '를 나타냄
				System.out.print(' ');
			
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) 	// (i-1)*2+1개의 '*'를 나타냄
				System.out.print(i % 10);
			System.out.println(); 						// 개행(줄변환)
		}
	}
}
