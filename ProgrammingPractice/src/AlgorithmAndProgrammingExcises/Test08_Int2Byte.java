package AlgorithmAndProgrammingExcises;

import java.util.Scanner;

/*21.	写一个方法，传入一个int 型的数字，把它的四个字节码
取出来，并且把它按大小顺序通过控制台输出*/
public class Test08_Int2Byte {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int num = sc.nextInt();
		String str = Integer.toBinaryString(num);
		if(num >= 0){
			int count = 32 - str.length();
			String t = "";
			for (int i = 0; i < count; i++) {
				t += "0";
			}
			str = t + str;
		}
		System.out.println(str);
		
	   /* byte b1 = Byte.parseByte(str.substring(0,8), 2);
	    System.out.println(Integer.parseInt(str.substring(0,8), 2));
		System.out.println(b1);
		byte b2 = Byte.parseByte(str.substring(8,16), 2);
		System.out.println(Integer.parseInt(str.substring(8,16), 2));
		System.out.println(b2);
		System.out.println(Integer.parseInt(str.substring(16,24), 2));
		byte b3;
		try {
			b3 = Byte.parseByte(str.substring(16,24), 2);
		} catch (NumberFormatException e) {
		}
		byte b4 = Byte.parseByte(str.substring(24), 2);
		System.out.println(Integer.parseInt(str.substring(24), 2));
		System.out.println(b4);*/
		
	}

	public static void method01(int num) {
		byte b1 = (byte)((num & 0xFF000000) >> 24) ;
		byte b2 = (byte)((num & 0xFF0000) >> 16) ;
		byte b3 = (byte)((num & 0xFF00) >> 8) ;
		byte b4 = (byte)(num & 0xFF) ;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
	}

}
