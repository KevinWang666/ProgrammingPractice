package interview;

import java.math.BigInteger;
import java.util.Scanner;

public class NumberOfZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int n = sc.nextInt();
		//先求n的阶乘，因为n是0到1000的，所以需要使用BigInterger类型，避免结果溢出
		BigInteger bi = new BigInteger("1");
		for (int i = 1; i <= n; i++) {
			bi = bi.multiply(new BigInteger("" + i));
		}
		System.out.println("阶乘为：" + bi);
		String result = "" + bi;
		int count = 0;
		for (int i = result.length() - 1; i > 0 ; i--) {
			if(result.charAt(i) == '0'){
				count++;
			}else{
				break;
			}
		}
		System.out.println("0的个数为：" + count);
	}

}
