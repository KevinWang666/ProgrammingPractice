package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SouGou_ArrayElementMul {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����������������������");
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		int[][] arr = new int[n][m];
		System.out.println("������Ԫ��:");
		ArrayList<Long> list = new ArrayList<>();
		//�洢����
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
			sc.nextLine();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				long num = 1;
				for (int km = 0; km < m; km++) {
					if (km == j) {
						continue;
					}
					num *= arr[i][km];
				}
				for (int kn = 0; kn < n; kn++) {
					if (kn == i) {
						continue;
					}
					num *= arr[kn][j];
				}
				list.add(num);//��ӵ�����
			}
		}
		System.out.println("���ֵΪ��" + Collections.max(list));
	}
}
