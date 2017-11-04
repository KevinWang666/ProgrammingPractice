package SortMethor;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 4, 56, 7, 89, 0, 3, 4, 5, 68, 9, 5, 4, 3, 4 };
		long start = System.currentTimeMillis();//测一下时间
		bubbleSort(arr);
		for (int i = 0; i < 10000000; i++) {
			long a = 0;
			a += 9999999L;
		}
		System.out.println(String.valueOf(arr));// 还是引用的地址值
		System.out.println(Arrays.toString(arr));// 注意是Arrays
		
		System.out.println(System.currentTimeMillis() - start);
		
	}

	public static void bubbleSort(int[] arr) {
		// 相邻元素交换，依次把序列中最大的数字放在序列的最后一个位置，
		// 然后检索的序列长度减一，继续
		// 优化算法，如果某次遍历没有发生元素交换，那么说明已经排好，可以立个flag来避免后续无意义的比较
		for (int i = 0; i < arr.length; i++) {
			// 遍历比较每一对相邻元素，如果顺序不对就交换
			for (int j = 0; j < arr.length - 1 - i; j++) {// 循环的控制条件为：遍历到本次最后一个元素之前的元素
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
				}
			}
		}
	}

	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

}
