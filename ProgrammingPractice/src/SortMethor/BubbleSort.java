package SortMethor;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 4, 56, 7, 89, 0, 3, 4, 5, 68, 9, 5, 4, 3, 4 };
		long start = System.currentTimeMillis();//��һ��ʱ��
		bubbleSort(arr);
		for (int i = 0; i < 10000000; i++) {
			long a = 0;
			a += 9999999L;
		}
		System.out.println(String.valueOf(arr));// �������õĵ�ֵַ
		System.out.println(Arrays.toString(arr));// ע����Arrays
		
		System.out.println(System.currentTimeMillis() - start);
		
	}

	public static void bubbleSort(int[] arr) {
		// ����Ԫ�ؽ��������ΰ��������������ַ������е����һ��λ�ã�
		// Ȼ����������г��ȼ�һ������
		// �Ż��㷨�����ĳ�α���û�з���Ԫ�ؽ�������ô˵���Ѿ��źã���������flag���������������ıȽ�
		for (int i = 0; i < arr.length; i++) {
			// �����Ƚ�ÿһ������Ԫ�أ����˳�򲻶Ծͽ���
			for (int j = 0; j < arr.length - 1 - i; j++) {// ѭ���Ŀ�������Ϊ���������������һ��Ԫ��֮ǰ��Ԫ��
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
