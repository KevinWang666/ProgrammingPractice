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
		 * �Ȱѵ�һ��λ�õ�Ԫ����Ϊ�м��ᣬ��ǰ��ֱ��������Ԫ�أ������ǰ����С��
		 * �ó����ŵ�����λ�ã�ǰ�������������ó����ŵ��ղ��ڳ�����λ����ȥ��ֱ��
		 * ǰ��ǰ������һ����Ȼ���ٶ���������������в���ͬ���ķ�����ֱ��ÿ�� ����ֻ��һ��Ԫ�ء�
		 * 
		 * flagֵ��ѡȡ�����ж�����ʽ�������м���������������ֱ��� �㷨�ĸ��ӶȲ�����ͬ��Ӱ�졣
		 * 
		 * ���������ĺ�����= =����û�к����İ취ѽ�r(�s���t)�q
		 */

		if (a >= b) {// ��ͷ�ˣ�ֱ�ӷ���
			return;
		}
		int indexLow = a;
		int indexHigh = b;
		int flag = arr[indexLow];
		while (indexLow < indexHigh) {
			while (indexLow < indexHigh && arr[indexHigh] > flag) {// �Ӻ���ǰ�ҵ�һ��С��flag��Ԫ�أ�ָ��ָ������ƶ�
				indexHigh--;
			}
			if (indexLow < indexHigh) {// ����ѭ���������������ָ�벻���˵���Ӻ�������С��flag��Ԫ�أ�����Ԫ������flag�Ŀ��У����ƶ���ָ��
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
