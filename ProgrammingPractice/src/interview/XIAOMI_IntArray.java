package interview;

import java.util.Arrays;

//在一个N个整数数组里面，有多个奇数和偶数，设计一个排序算法，令所有的奇数都在左边。请完成 sort 的代码实现（C++或Java）
public class XIAOMI_IntArray {

	public static void main(String[] args) {
		int[] a = {8,4,1,6,7,4,9,6,4};
		sort(a);
		System.out.println(Arrays.toString(a));
	}

	private static void sort(int[] a) {
		int flag = a[0];
		int end = a.length - 1;
		int st = 0;
		while (st < end) {
			while (st < end && a[end] % 2 == 0) {
				end--;
			}
			if (st < end) {
				a[st] = a[end];
				st++;
			}
			while (st < end && a[st] % 2 != 0) {
				st++;
			}
			if (st < end) {
				a[end] = a[st];
				end--;
			}
		}
		a[st] = flag;
	}
}
