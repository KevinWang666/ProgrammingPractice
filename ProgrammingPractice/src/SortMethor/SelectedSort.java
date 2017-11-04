package SortMethor;

import java.util.Arrays;

public class SelectedSort {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 4, 56, 7, 89, 0, 3, 4, 5, 68, 9, 5, 4, 3, 4 };

		selectedSort(arr);

		System.out.println(Arrays.toString(arr));
	}

	public static void selectedSort(int[] arr) {
		// 从第0个元素开始，遍历到倒数第二个元素，寻找最小值，和当前索引的元素交换
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = getMinIndex(arr, i);
			if (minIndex != i) {
				swap(arr, i, minIndex);
			}
		}
	}

	public static int getMinIndex(int[] arr, int a) {// 获取当前序列中最小值的索引
		int index = a;
		for (int i = a; i < arr.length; i++) {
			if (arr[i] < arr[index]) {
				index = i;
			}
		}
		return index;
	}

	public static void swap(int[] arr, int a, int b) {// 交换
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

}
