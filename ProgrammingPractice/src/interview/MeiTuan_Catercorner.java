package interview;

import java.util.Arrays;

/*
  ÿ�ζԽ������Ԫ�صĸ���1,2,3������n������3,2,1
  ÿ������ĺ����꣨Ԫ�ظ�����1�ǵ�n֮�䣩1���öԽ���Ԫ�صĸ�����
  ������Ϊ��n-Ԫ�ظ�������n��
 ��Ԫ�ظ�����n��1֮�䣩������Ϊ��n - Ԫ�ظ�������n��������Ϊ1��n
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
		
		//��һ��ѭ����������ĶԽ��߸��� ûë��
		for (int i = 1 - n ; i <=  n - 1 ;i++ ) {
			//�ڲ�ѭ������ÿ���Խǵ������Ԫ��   
			if (i <= 0) {
					//���ÿ��Ԫ�أ�Ԫ�ظ���  (n + i)
					for (int heng = 0,zong = n - (n + i )  ; heng < (n + i)  ; heng++,zong++) {
						System.out.print(arr[heng][zong] + "\t");
					}		
			}else {     //Ԫ�ظ��� (n - i)
					for (int heng = n - (n - i) ,zong = 0; zong < (n - i)  ; heng++,zong++) {
						System.out.print(arr[heng][zong]+ "\t");
					}		
			}
			System.out.println();
		}
	}

}
