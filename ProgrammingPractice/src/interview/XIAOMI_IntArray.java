package interview;

import java.util.Arrays;

//��һ��N�������������棬�ж��������ż�������һ�������㷨�������е�����������ߡ������ sort �Ĵ���ʵ�֣�C++��Java��
public class XIAOMI_IntArray {

	public static void main(String[] args) {
		int[] a = {8,4,1,6,7,4,9,6,4};
		sort(a);
		System.out.println(Arrays.toString(a));
	}

	private static void sort(int[] a) {
		int flag = a[0];
		int end = a.length - 1;
		int st = 0;
		while (st < end) {
			while (st < end && a[end] % 2 == 0) {
				end--;
			}
			if (st < end) {
				a[st] = a[end];
				st++;
			}
			while (st < end && a[st] % 2 != 0) {
				st++;
			}
			if (st < end) {
				a[end] = a[st];
				end--;
			}
		}
		a[st] = flag;
	}
}
