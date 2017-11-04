package interview;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*一种双核CPU的两个核能够同时的处理任务，现在有n个已知数据量的任务需要交给CPU处理，假设
 * 已知CPU的每个核1秒可以处理1kb，每个核同时只能处理一项任务。n个任务可以按照任意顺序放
 * 入CPU进行处理，现在需要设计一个方案让CPU处理完这批任务所需的时间最少，求这个最小的时
 * 间。 
输入描述:
输入包括两行：
第一行为整数n(1 ≤ n ≤ 50)
第二行为n个整数length[i](1024 ≤ length[i] ≤ 4194304)，表示每个任务的长度为length[i]kb，
每个数均为1024的倍数。
输出描述:
输出一个整数，表示最少需要处理的时间
输入例子1:
5
3072 3072 7168 3072 1024
输出例子1:
9216*/
public class WangYi_MinTime {
	private static LinkedList<Integer> list = new LinkedList<>();
	private static int index = -1;
	private static int sum = 0;
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入任务个数：");
		int n = Integer.parseInt(sc.nextLine());
		int[] arr = new int[n];
		System.out.println("请输入每个任务的长度：");
		double max = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt() >> 10;
			max += arr[i];
		}
		int half = (int)Math.round(max / 2) ;
		System.out.println(half);
		
		//System.out.println(Arrays.toString(arr));
		quickSort(arr, 0, n - 1);
		System.out.println(Arrays.toString(arr));
		// TODO
		int result = getSum(arr, n , half);
		System.out.println(result << 10);
		result = ((int)max - result) > result ? (int)max - result : result;
		System.out.println(result << 10);
	}
	
	public static void quickSort(int[] arr, int low, int high) {//降序快排
		if(low > high) {
			return;
		}
		int l = low;
		int h = high;
		int flag = arr[l];
		while(l < h) {
			while(l < h && arr[h] < flag ) {
				h--;
			}
			if(l < h) {
				arr[l] = arr[h];
				l++;
			}
			while(l < h && arr[l] > flag) {
				l++;
			}
			if(l < h) {
				arr[h] = arr[l];
				h--;
			}
		}
		arr[l] = flag;
		quickSort(arr, low, l - 1);
		quickSort(arr, l + 1, high);
	}
	private static int getSum(int[] arr , int n, int cap) {
		int sum = 0;
		//int flag = cap;
		LinkedList<Integer> li = new LinkedList<>();
		for (int i = 0; i < n; i++) {//遍历数组
			push(arr[i]);//放入元素
			if(getStackSum() > cap) {
				pop();
				if(isEmpty()) {
					break;
				}
				pop();//弹出两个元素
				
				push(arr[i]);
				sum = getStackSum();
			}else if(getStackSum() == cap) {
				sum = getStackSum();
				li = getList();
				System.out.println(li);
				break;
			}else {
				sum = getStackSum();
				li = getList();
			}	
			
		}
		System.out.println(li);
		return sum;
	}

	public static void push(int n) {
		list.addFirst(n);
		index++;
		sum += n;
	}
	
	public static int pop() {
		int re = list.removeFirst();
		index--;
		sum -= re;
		return re;
	}
	
	public static boolean isEmpty() {
		return index < 0;
	}
	public static int getStackSum() {
		return sum;
	}
	
	public static LinkedList<Integer> getList(){
		return list;
	}
	
}
