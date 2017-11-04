package JavaManual;

import java.util.Scanner;

//判断一个整数能被几个9整除
public class _45Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数");
		String str = sc.nextLine();
		int len = str.length();
		int num = Integer.parseInt(str);
		int res = 0;
		int con = num;
		
		while(con % 9 == 0){
			con = con / 9;
			res++;
		}
		System.out.println("可以被" + res + "个9整除");
	}


}
