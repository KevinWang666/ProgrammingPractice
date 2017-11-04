package SortMethor;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 1, 56, 7, 89, 0, -9, 76, 5, 68, 9, 5, 4, 3, 6 };

		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));

	}

	public static void quickSort(int[] arr, int a, int b) {
		/*
		 * 先把第一个位置的元素作为中间轴，从前后分别遍历其他元素，后边往前比他小的
		 * 拿出来放到他的位置，前面往后比他大的拿出来放到刚才挖出来的位置上去，直到
		 * 前后前后索引一样。然后再对中轴数两侧的序列采用同样的方法，直到每个 区间只有一个元素。
		 * 
		 * flag值的选取可以有多种形式，例如中间数或者随机数，分别会对 算法的复杂度产生不同的影响。
		 * 
		 * 理解起来真的很困难= =，有没有好理解的办法呀╮(╯▽╰)╭
		 */

		if (a >= b) {// 到头了，直接返回
			return;
		}
		int indexLow = a;
		int indexHigh = b;
		int flag = arr[indexLow];
		while (indexLow < indexHigh) {
			while (indexLow < indexHigh && arr[indexHigh] > flag) {// 从后往前找第一个小于flag的元素，指针指针跟着移动
				indexHigh--;
			}
			if (indexLow < indexHigh) {// 上述循环结束，如果左右指针不相等说明从后面数有小于flag得元素，将该元素填入flag的坑中，并移动左指针
				arr[indexLow] = arr[indexHigh];
				indexLow++;
			}

			while (indexLow < indexHigh && arr[indexLow] < flag) {
				indexLow++;
			}
			if (indexLow < indexHigh) {
				arr[indexHigh] = arr[indexLow];
				indexHigh--;
			}
		}
		arr[indexLow] = flag;

		quickSort(arr, a, indexLow - 1);
		quickSort(arr, indexLow + 1, b);
	}

}
