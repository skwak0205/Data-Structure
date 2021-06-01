package practice;

import java.util.Scanner;

// 버블 정렬 (버전 1)

public class BubbleSort {
	// a[idx1]와 a[idx2]의 값을 바꿈
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// 버블 정렬
	static void bubbleSort(int[] a, int n) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = n - 1; j > i; j--) {
				if (a[j - 1] > a[j])
					swap(a, j - 1, j);
			}
		}
	}

	private static void bubbleSortRecur(int[] arr) {
		bubbleSortRecur(arr, arr.length - 1);
	}

	private static void bubbleSortRecur(int[] arr, int last) {
		if (last > 0) {
			for (int i = 1; i <= last; i++) {
				if (arr[i - 1] > arr[i]) {
					swap(arr, i - 1, i);
				}
			}
			bubbleSortRecur(arr, last - 1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("버블 정렬(버전 1)");
		System.out.print("요솟수 : ");
		int nx = sc.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}

		bubbleSort(x, nx);

		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "]=" + x[i]);
		}
	}
}
