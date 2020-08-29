package class2.boj2751;

import java.util.Scanner;

public class Boj2751_tk {

	static int partition(int[] array, int start, int end) {
		int pivot = array[(start + end) / 2];
		while (start <= end) {
			while (array[start] < pivot)
				start++;
			while (array[end] > pivot)
				end--;
			if (start <= end) {
				int tmp = array[start];
				array[start] = array[end];
				array[end] = tmp;
				start++;
				end--;
			}
		}
		return start;
	}

	static int[] quickSort(int[] array, int start, int end) {
		int p = partition(array, start, end);
		if (start < p - 1)
			quickSort(array, start, p - 1);
		if (p < end)
			quickSort(array, p, end);
		return array;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		for(int a : quickSort(arr, 0, n - 1))
			System.out.println(a);
	}
}