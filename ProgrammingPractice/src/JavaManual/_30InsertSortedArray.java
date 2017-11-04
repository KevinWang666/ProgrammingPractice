package JavaManual;

import java.util.Arrays;

//有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。
public class _30InsertSortedArray {

	public static void main(String[] args) {
	//二分查找，定位要插入元素在数组中的索引位置，然后扩容，插入元素
		int[] arr = {1, 2, 3, 6, 9, 10, 15, 20, 25, 30};
		int num = 13;
		//二分查找，先定位要查找的元素索引
		//插入位置为和该数相等，或者数组中小于该数的最大值后面的位置
		int min = 0;
		int max = arr.length - 1;
		int index = 0;
		while (max > min) {
			int mid = (max + min) / 2 ;
			if (arr[mid] > num) {
				max = mid - 1;
			}else if (arr[mid] < num) {
				min = mid + 1;
				if (min == max) {//当该数字位于两个数字中间时，此时系统
								//判断该数比中间数大，所以要把min加一
							//一共有三种情况：1.num位于中间 2.num等于前一个数 3.num等于后一个数
					index = min ;
					break;
				}
			}else {
				index = mid + 1;
				break;
			}
		}
		System.out.println(index);
		//插入元素的方法：先定义一个原数组长度加一的新数组，然后遍历放入元素，返回新数组
		int[] results = insert(arr, index, num);
		System.out.println(Arrays.toString(results));
	}

	private static int[] insert(int[] arr, int index, int num) {
		int[] temp = new int[arr.length + 1];
		for (int i = 0; i < temp.length; i++) {
			if (i == index) {
				temp[i] = num;
			}else if( i < index){
				temp[i] = arr[i];
			}else{
				temp[i] = arr[i - 1];
			}
		}
		return temp;
	}
}
