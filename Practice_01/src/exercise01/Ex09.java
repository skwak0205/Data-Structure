package exercise01;

import java.util.Scanner;

public class Ex09 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a 값 : ");
		int a = sc.nextInt();
		
		System.out.print("b 값 : ");
		int b = sc.nextInt();
		
		System.out.println(a + "와 " + b + " 를 포함하여 그 사이의 모든 정수의 합 : " + sumof(a, b));
		
	}
	
	static int sumof(int a, int b) {
		int min, max = 0;
		int sum = 0;
		
		if (a > b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		
		for (int i = min; i <= max; i++) {
			sum += i;
		}
		
		
		return sum;
	}
}
