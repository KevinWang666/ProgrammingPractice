package interview;

import java.util.Arrays;
/*
	ÿ����������ֻ��һ�У���һ���ɲ�ͬ�Ĵ�д��ĸ��ɵ��ַ�����������1��9֮��
	�������ַ������������з�ʽ��ÿ��һ�����У�Ҫ����ĸ���бȽ�С������ǰ��
	���磺
	���룺 WHL
	����� HLW  HWL LHW LWH WHL WLH
*/
import java.util.Scanner;

public class ChuChuJie_String {

	public static void main(String[] args) {//��Ҫ�Ȼ�ȫ�����㷨
	/*	Integer i = new Integer(10);
		Scanner sc = new Scanner(System.in);*/
		//��������length���ַ���ת�ַ����飬�������
		
		Scanner sc = new Scanner(System.in); 
		
		String str = sc.nextLine();
		
		char[] crr = str.toCharArray();
	    Arrays.sort(crr);
	    System.out.println(crr);
		
		int length = crr.length;
		
		for (int count1 = 0; count1 < crr.length; count1++) {//n����ʼλ��
			for (int count2 = 0 ; count2 < crr.length; count2++) {//ÿ�����n���ַ�
 
			 }
			System.out.println();
		}
	
		
	}

	private static void show(char[] crr,int a, int length) {
		if (length == 0) {
			return;
		}
		if (a == crr.length) {//��������һ��Ԫ���ˣ�������������ֵ
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

