package interview;

import java.util.Arrays;

/*
  每次对角线输出元素的个数1,2,3。。。n。。。3,2,1
  每次输出的横坐标（元素个数从1涨到n之间）1到该对角线元素的个数，
  纵坐标为（n-元素个数）到n；
 （元素个数从n到1之间）横坐标为（n - 元素个数）到n，纵坐标为1到n
 */public class MeiTuan_Catercorner {

	public static void main(String[] args) {
		int n = 5;
		int a = 1;
		int[][] arr = new int[n][n];
		for (int i = 0; i < n;i++ ) {
			for (int j = 0;j < n ; j++) {
				arr[i][j] = a;
				a++;
			}
		}
		for (int i = 0;i < n ; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		//第一层循环控制输出的对角线个数 没毛病
		for (int i = 1 - n ; i <=  n - 1 ;i++ ) {
			//内层循环控制每个对角的输出的元素   
			if (i <= 0) {
					//输出每个元素，元素个数  (n + i)
					for (int heng = 0,zong = n - (n + i )  ; heng < (n + i)  ; heng++,zong++) {
						System.out.print(arr[heng][zong] + "\t");
					}		
			}else {     //元素个数 (n - i)
					for (int heng = n - (n - i) ,zong = 0; zong < (n - i)  ; heng++,zong++) {
						System.out.print(arr[heng][zong]+ "\t");
					}		
			}
			System.out.println();
		}
	}

}
