package exercise01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a : ");
		int a = sc.nextInt();
		
		System.out.println("b : ");
		int b = sc.nextInt();
		
		System.out.println("c : ");
		int c = sc.nextInt();
		
		System.out.println("d : ");
		int d = sc.nextInt();
		
		//System.out.println("최댓값 : " + max4(a, b, c, d));
		
		//System.out.println("최솟값 : " + min3(a, b, c));
		
		System.out.println("최솟값 : " + min4(a, b, c, d));
		
		sc.close();
	}
	
	// 4개 값의 최댓값 구하기
	static int max4(int a, int b, int c, int d) {
		int max = a;
		
		if(b > max) max = b;
		if(c > max) max = c;
		if(d > max) max = d;

		return max;
	}
	
	// 3개 값의 최솟값 구하기
	static int min3(int a, int b, int c) {
		int min = a;
		
		if(b < min) min = b;
		if(c < min) min = c;
		
		return min;
	}
	
	// 4개 값의 최솟값 구하기
	static int min4(int a, int b, int c, int d) {
		int min = a;
		
		if(b < min) min = b;
		if(c < min) min = c;
		if(d < min) min = d;
		
		return min;
	}
}
