package SortMethor;

import java.util.Arrays;

public class ShellSort {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 1, 56, 7, 89, 0, -9, 76, 5, 68, 9, 5, 4, 3, 6 };

		// shellSortMyStyle(arr);//�ҵķ������ڲ���ʹ��ð��ʵ�ֵ�= =

		ShellSortReal(arr);// ����ϣ������

		System.out.println(Arrays.toString(arr));

	}

	public static void ShellSortReal(int[] arr) {
		// ����ע��߽���������������ʱ�����쳣
		for (int i = 0, increase = arr.length; i < arr.length; i++) {
			increase /= 2;
			// ���ָ������һ�������������������е���ʼλ��Ԫ���½Ǳ겻ͬ
			for (int j = 0; j < increase; j++) {
				// ��ÿ������ʹ�ò�������
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
		// ���ղ�ͬ�����������з�Ϊ��ͬ�Σ��ֱ�ʹ�ò�������ֱ��������Ϊһ

		int increase = arr.length;

		for (int i = 0; i < arr.length; i++) {
			// ����ÿ�ζ�����2��ֱ��Ϊ1�˳�ѭ��
			increase /= 2;
			for (int j = 0; j < increase; j++) {// �ָ���������и���Ϊ����ֵ����ͬ���е���ʼ�½Ǳ겻ͬ
				// ��ÿ�������������
				for (int j2 = j; j2 < arr.length; j2 += increase) {
					// ע�����ÿ��������±��ѭ������֮��Ĺ�ϵ
					for (int k = j2 + increase; k < arr.length; k += increase) {// �ҵĹ��췽���൱��ÿ�ζ�j2
																				// +
																				// increase
																				// ��������н���ð�����򣬲��ǲ�������
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
