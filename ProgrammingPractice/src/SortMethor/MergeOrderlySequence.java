package SortMethor;

import java.util.Arrays;

public class MergeOrderlySequence {

	public static void main(String[] args) {
		
		int[] arr1 = { 2, 3, 6, 56, 78, 80, 100, 109, 123, 135, 168, 567, 789, 1000 };
		int[] arr2 = { 2, 3, 4, 56, 64, 89, 103, 110, 114, 134, 169, 200};

		int[] arr = mergeSquence(arr1, arr2);//�ҵķ����ȽϷ��������滹�и��򵥵ķ���
		
		int[] arrNewBee = mergeSquenceNewBee(arr1, arr2);//�򻯰棬�����뷨��ֵ�÷�����Ħ
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.toString(arrNewBee));
	}

	public static int[] mergeSquenceNewBee(int[] arr1, int[] arr2) {
		int i = 0;
		int j = 0;
		int k = 0;
		int len1 = arr1.length;
		int len2 = arr2.length;
		int[] arrNewBee = new int[len1 + len2];
		while (k < len1 + len2) {
			while (i < len1 && j < len2) {
				if (arr1[i] < arr2[j]) {
					arrNewBee[k++] = arr1[i++];  
				}else{
					arrNewBee[k++] = arr2[j++];
				}
			}
			while ( i < len1) {
				arrNewBee[k++] = arr1[i++]; 
			}
			while ( j < len2) {
				arrNewBee[k++] = arr2[j++]; 
			}
		}
		return arrNewBee;
	}

	public static int[] mergeSquence(int[] arr1, int[] arr2) {
		//�ϲ������������У�����һ���µ�����
		int[] arr = new int[0];
		int a1 = 0;
		int a2 = 0;
		
		for (int i = 0; i < arr1.length + arr2.length ; i++) {
			int temp = 0;
			
			if (a1 == arr1.length) {//���arr1�����Ѿ�����꣬��ֱ�����arr2���У���������ѭ������ʼ��һ��
				temp = arr2[a2];
				a2++;
				arr = Arrays.copyOf(arr, arr.length + 1);//�������չ
				arr[i] = temp;
				continue;
			}
			if (a2 == arr2.length) {//���arr2�����Ѿ�����꣬��ֱ�����arr1���У���������ѭ������ʼ��һ��
				temp = arr1[a1];
				a1++;
				arr = Arrays.copyOf(arr, arr.length + 1);
				arr[i] = temp;
				continue;
			}
			if (arr1[a1] > arr2[a2] ) {//������������еĽ�С��һ��������������е��±��һ
				temp = arr2[a2];
				a2++;
				arr = Arrays.copyOf(arr, arr.length + 1);
				arr[i] = temp;
			}else{
				temp = arr1[a1];
				a1++;
				arr = Arrays.copyOf(arr, arr.length + 1);
				arr[i] = temp;
			}
			
		}
		return arr;
	}

}
