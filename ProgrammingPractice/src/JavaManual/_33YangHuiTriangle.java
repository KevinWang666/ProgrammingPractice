package JavaManual;

import java.util.Arrays;

/*
 * ��ӡ�����������(Ҫ���ӡ��10�У�
 * 				1

 1 1

 1 2 1

 1 3 3 1

 1 4 6 4 1

 1 5 10 10 5 1
 */
public class _33YangHuiTriangle {

	public static void main(String[] args) {
		// ÿ��Ԫ�ظ���Ϊ���� ��������ĩλ��Ԫ�أ�����Ԫ�ؾ�Ϊ��һ������Ԫ�صĺ�
		// ����ֻ���ȷŵ����������ˡ�����
		// ����һ��num * num �Ķ�ά����
		int num = 5;
		int[][] arrs = new int[num][num];
		// �Ȱ�ÿ��Ԫ�طŵ�������ȥ
		for (int i = 0; i < num; i++) {// ��ѭ��
			for (int j = 0; j <= i; j++) {// ÿ�е�Ԫ��
				if (j == 0 || j == i) {
					arrs[i][j] = 1;
				} else {
					arrs[i][j] = arrs[i - 1][j - 1] + arrs[i - 1][j];
				}
			}
		}
		// �ȿ�һ��
		for (int[] t : arrs) {

			System.out.println(Arrays.toString(t));
		}
		// ���նԳƸ�ʽ���
		for (int i = 0; i < num; i++) {
			// ����������ո�
			for (int j = 0; j < num - i; j++) {
				System.out.print(" ");
			}
			// ���������
			for (int k = 0; k <= i; k++) {// ÿ�����i + 1 ��
				System.out.print(arrs[i][k] + " ");
			}
			System.out.println();
		}
	}

}
