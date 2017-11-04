package interview;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*һ��˫��CPU���������ܹ�ͬʱ�Ĵ�������������n����֪��������������Ҫ����CPU��������
 * ��֪CPU��ÿ����1����Դ���1kb��ÿ����ͬʱֻ�ܴ���һ������n��������԰�������˳���
 * ��CPU���д���������Ҫ���һ��������CPU�������������������ʱ�����٣��������С��ʱ
 * �䡣 
��������:
����������У�
��һ��Ϊ����n(1 �� n �� 50)
�ڶ���Ϊn������length[i](1024 �� length[i] �� 4194304)����ʾÿ������ĳ���Ϊlength[i]kb��
ÿ������Ϊ1024�ı�����
�������:
���һ����������ʾ������Ҫ�����ʱ��
��������1:
5
3072 3072 7168 3072 1024
�������1:
9216*/
public class WangYi_MinTime {
	private static LinkedList<Integer> list = new LinkedList<>();
	private static int index = -1;
	private static int sum = 0;
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���������������");
		int n = Integer.parseInt(sc.nextLine());
		int[] arr = new int[n];
		System.out.println("������ÿ������ĳ��ȣ�");
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
	
	public static void quickSort(int[] arr, int low, int high) {//�������
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
		for (int i = 0; i < n; i++) {//��������
			push(arr[i]);//����Ԫ��
			if(getStackSum() > cap) {
				pop();
				if(isEmpty()) {
					break;
				}
				pop();//��������Ԫ��
				
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
