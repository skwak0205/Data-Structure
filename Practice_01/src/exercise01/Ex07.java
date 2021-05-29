package exercise01;

import java.util.Scanner;

public class Ex07 {
	
	// 1 + 2 + 3 + .... + n = sum으로 출력
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n의 값 : ");
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			if (i < n) {
				System.out.print(i + " + ");
			} else {
				System.out.print(i);
			}
			
			sum += i;
		}
		
		System.out.print(" = " + sum);
	}
}
