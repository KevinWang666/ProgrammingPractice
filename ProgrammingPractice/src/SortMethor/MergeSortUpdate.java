package SortMethor;

import java.util.Arrays;

public class MergeSortUpdate {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 56, 7, 89, 0, -9, 76, 5, 68, 9, 5, 4, 3};
		int[] brr = new int[arr.length];
		mergeSort(arr , 0 , arr.length - 1 , brr);
		System.out.println("\n\n");
		System.out.println(Arrays.toString(brr));
	}

	private static void mergeSort(int[] arr, int st, int end, int[] brr) {
		//brr作为中间数组存放临时结果
		if(st == end){
			return;
		}
		mergeSort(arr , st , (st + end) / 2 , brr);
		mergeSort(arr , ( st + end ) / 2 + 1 , end ,brr);
		mergeArray(arr , st , (st + end) / 2 , (st + end) / 2 + 1 , end ,brr);
	}

	private static void mergeArray(int[] arr, int st1, int end1, int st2, int end2,
			int[] brr) {
		
		int index1 = st1;
		int index2 = st2;
		int indexBrr = 0;
		int len = end2 - st1 + 1;
		while(index1 <= end1 && index2 <= end2){
			if(arr[index1] < arr[index2]){
				brr[indexBrr++] = arr[index1++];
			}else{
				brr[indexBrr++] = arr[index2++];
			}
		}
		while(index1 <= end1 ){
			brr[indexBrr++] = arr[index1++];
		}
		while(index2 <= end2){
			brr[indexBrr++] = arr[index2++];
		}
		System.out.println(Arrays.toString(brr));//看一下每次的排序过程
		for(int a = st1,b = 0;b < len;a++,b++){
			arr[b + st1] = brr[b];
		}
	}

}
