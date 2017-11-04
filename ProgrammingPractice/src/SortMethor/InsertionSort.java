package SortMethor;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 4, 56, 7, 89, 0, 3, 4, 5, 68, 9, 5, 4, 3, 4 };

		insertionSort(arr);

		System.out.println(Arrays.toString(arr));
	}

	public static void insertionSort(int[] arr) {
		// 将一个新的元素插入已经排好序列的
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					swap(arr, j, j - 1);
				} else {// 因为之前的序列都是按顺序拍好的，所以如果该元素比前一个元素大，则说明当前一轮的排序已完成
					break;
				}
			}
		}
	}

	public static void swap(int[] arr, int a, int b) {// 交换
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
