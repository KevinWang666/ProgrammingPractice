package JavaManual;

import java.util.Scanner;

//读取7个数(1—50)的整数值，每读取一个值，程序打印出该值个数的*。
public class _47PrintStars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 7; i++) {
			System.out.println("请输入一个（1-50）的整数:");
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
