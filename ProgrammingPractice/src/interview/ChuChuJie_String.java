package interview;

import java.util.Arrays;
/*
	每组输入数据只有一行，是一个由不同的大写字母组成的字符串，长度在1到9之间
	输出这个字符串的所有排列方式，每行一个排列，要求字母序列比较小的排在前面
	例如：
	输入： WHL
	输出： HLW  HWL LHW LWH WHL WLH
*/
import java.util.Scanner;

public class ChuChuJie_String {

	public static void main(String[] args) {//需要先会全排列算法
	/*	Integer i = new Integer(10);
		Scanner sc = new Scanner(System.in);*/
		//长度问题length，字符串转字符数组，排序，输出
		
		Scanner sc = new Scanner(System.in); 
		
		String str = sc.nextLine();
		
		char[] crr = str.toCharArray();
	    Arrays.sort(crr);
	    System.out.println(crr);
		
		int length = crr.length;
		
		for (int count1 = 0; count1 < crr.length; count1++) {//n个起始位置
			for (int count2 = 0 ; count2 < crr.length; count2++) {//每次输出n个字符
 
			 }
			System.out.println();
		}
	
		
	}

	private static void show(char[] crr,int a, int length) {
		if (length == 0) {
			return;
		}
		if (a == crr.length) {//如果到最后一个元素了，则重置其索引值
			a = 0;
		}
		System.out.print(crr[a]);
		a++;
		length--;
		for (int i = 0; i < length ; i++) {		
			show(crr,  a ,length);
		}
		
	}

}

