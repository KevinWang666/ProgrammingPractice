package SortMethor;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 4, 56, 7, 89, 0, 3, 4, 5, 68, 9, 5, 4, 3, 4 };

		insertionSort(arr);

		System.out.println(Arrays.toString(arr));
	}

	public static void insertionSort(int[] arr) {
		// ��һ���µ�Ԫ�ز����Ѿ��ź����е�
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					swap(arr, j, j - 1);
				} else {// ��Ϊ֮ǰ�����ж��ǰ�˳���ĺõģ����������Ԫ�ر�ǰһ��Ԫ�ش���˵����ǰһ�ֵ����������
					break;
				}
			}
		}
	}

	public static void swap(int[] arr, int a, int b) {// ����
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
