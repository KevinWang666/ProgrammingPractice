package SortMethor;

import java.util.Arrays;

public class MergeOrderlySequence {

	public static void main(String[] args) {
		
		int[] arr1 = { 2, 3, 6, 56, 78, 80, 100, 109, 123, 135, 168, 567, 789, 1000 };
		int[] arr2 = { 2, 3, 4, 56, 64, 89, 103, 110, 114, 134, 169, 200};

		int[] arr = mergeSquence(arr1, arr2);//我的方法比较繁琐，下面还有更简单的方法
		
		int[] arrNewBee = mergeSquenceNewBee(arr1, arr2);//简化版，很有想法，值得反复揣摩
		
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
		//合并两个有序数列，返回一个新的数列
		int[] arr = new int[0];
		int a1 = 0;
		int a2 = 0;
		
		for (int i = 0; i < arr1.length + arr2.length ; i++) {
			int temp = 0;
			
			if (a1 == arr1.length) {//如果arr1数列已经输出完，则直接输出arr2数列，结束本次循环，开始下一次
				temp = arr2[a2];
				a2++;
				arr = Arrays.copyOf(arr, arr.length + 1);//数组的扩展
				arr[i] = temp;
				continue;
			}
			if (a2 == arr2.length) {//如果arr2数列已经输出完，则直接输出arr1数列，结束本次循环，开始下一次
				temp = arr1[a1];
				a1++;
				arr = Arrays.copyOf(arr, arr.length + 1);
				arr[i] = temp;
				continue;
			}
			if (arr1[a1] > arr2[a2] ) {//否则输出两者中的较小的一个，并把输出序列的下标加一
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
