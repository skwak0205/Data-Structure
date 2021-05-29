package exercise01;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("양의 정수값의 자릿수를 구합니다.");
		int num;
		
		do {
			System.out.print("값 : ");
			num = sc.nextInt();
		}while(num < 0);
		
		int count = 0;
		
		while(num > 0) {
			num /= 10;
			count++;
		}
		
		System.out.println("그 수는 " + count + "자리입니다.");
		
		
	}
	
}
