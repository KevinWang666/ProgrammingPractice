package AlgorithmAndProgrammingExcises;

import java.util.Scanner;

//有一个字符串，其中包含中文字符、英文字符和数字字符，请统计和打印出各个字符的个数。
public class Test03_NumOfChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String str = sc.nextLine();
		String[] strs = str.split("");
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		for (String string : strs) {
			if (string.matches("[0-9]")) {
				n3++;
			} else if (string.matches("[a-zA-Z]")) {
				n2++;
			} else {
				n1++;
			}
		}
		System.out.println("中文字符： " + n1 + " 英文字符： " + n2 + " 数字字符：" + n3);
	}

}
