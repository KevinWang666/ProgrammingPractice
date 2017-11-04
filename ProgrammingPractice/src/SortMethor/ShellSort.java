package SortMethor;

import java.util.Arrays;

public class ShellSort {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 1, 56, 7, 89, 0, -9, 76, 5, 68, 9, 5, 4, 3, 6 };

		// shellSortMyStyle(arr);//我的方法，内部是使用冒泡实现的= =

		ShellSortReal(arr);// 正经希尔排序法

		System.out.println(Arrays.toString(arr));

	}

	public static void ShellSortReal(int[] arr) {
		// 尤其注意边界条件，以免运行时出现异常
		for (int i = 0, increase = arr.length; i < arr.length; i++) {
			increase /= 2;
			// 被分割的序列一共有增量个，各个数列的起始位置元素下角标不同
			for (int j = 0; j < increase; j++) {
				// 对每个序列使用插入排序法
				for (int j2 = j; j2 < arr.length - increase; j2 += increase) {
					for (int k = j2 + increase; k > j; k -= increase) {
						if (arr[k] < arr[k - 1]) {
							swap(arr, k, k - 1);
						} else {
							break;
						}
					}
				}
			}
			if (increase == 1) {
				break;
			}
		}
	}

	public static void shellSortMyStyle(int[] arr) {
		// 按照不同的增量将序列分为不同段，分别使用插入排序，直到增量变为一

		int increase = arr.length;

		for (int i = 0; i < arr.length; i++) {
			// 增量每次都除以2，直到为1退出循环
			increase /= 2;
			for (int j = 0; j < increase; j++) {// 分割出来的序列个数为增量值，不同序列的起始下角标不同
				// 对每个数组进行排序
				for (int j2 = j; j2 < arr.length; j2 += increase) {
					// 注意理解每个数组的下标和循环变量之间的关系
					for (int k = j2 + increase; k < arr.length; k += increase) {// 我的诡异方法相当于每次对j2
																				// +
																				// increase
																				// 往后的序列进行冒泡排序，不是插入排序
						if (arr[k] < arr[k - increase]) {
							swap(arr, k, k - increase);
						} else {
							break;
						}
					}
				}
			}
			if (increase == 1) {
				break;
			}
		}
	}

	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

}
