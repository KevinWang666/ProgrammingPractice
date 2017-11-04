package JavaManual;

import java.util.Arrays;

/*
 * 打印出杨辉三角形(要求打印出10行）
 * 				1

 1 1

 1 2 1

 1 3 3 1

 1 4 6 4 1

 1 5 10 10 5 1
 */
public class _33YangHuiTriangle {

	public static void main(String[] args) {
		// 每行元素个数为行数 ，除了首末位的元素，其他元素均为上一行俩个元素的和
		// 看来只能先放到数组里面了。。。
		// 定义一个num * num 的二维数组
		int num = 5;
		int[][] arrs = new int[num][num];
		// 先把每个元素放到数组中去
		for (int i = 0; i < num; i++) {// 行循环
			for (int j = 0; j <= i; j++) {// 每行的元素
				if (j == 0 || j == i) {
					arrs[i][j] = 1;
				} else {
					arrs[i][j] = arrs[i - 1][j - 1] + arrs[i - 1][j];
				}
			}
		}
		// 先看一下
		for (int[] t : arrs) {

			System.out.println(Arrays.toString(t));
		}
		// 按照对称格式输出
		for (int i = 0; i < num; i++) {
			// 先输出两个空格
			for (int j = 0; j < num - i; j++) {
				System.out.print(" ");
			}
			// 再输出数字
			for (int k = 0; k <= i; k++) {// 每行输出i + 1 个
				System.out.print(arrs[i][k] + " ");
			}
			System.out.println();
		}
	}

}
