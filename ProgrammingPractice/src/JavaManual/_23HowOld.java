package JavaManual;

import java.util.Scanner;

/*给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。*/

public class _23HowOld {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("请输入一个正整数：");
		String str = sc.nextLine();
		System.out.println("它是" + str.length() + "位数");
		System.out.print("逆序输出为：");
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}

}
