package JavaManual;

import java.util.Scanner;

//��ȡ7����(1��50)������ֵ��ÿ��ȡһ��ֵ�������ӡ����ֵ������*��
public class _47PrintStars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 7; i++) {
			System.out.println("������һ����1-50��������:");
			int num = sc.nextInt();
			print(num);
		}
	}
	public static void print(int n){
		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
