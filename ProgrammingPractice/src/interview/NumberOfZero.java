package interview;

import java.math.BigInteger;
import java.util.Scanner;

public class NumberOfZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������");
		int n = sc.nextInt();
		//����n�Ľ׳ˣ���Ϊn��0��1000�ģ�������Ҫʹ��BigInterger���ͣ����������
		BigInteger bi = new BigInteger("1");
		for (int i = 1; i <= n; i++) {
			bi = bi.multiply(new BigInteger("" + i));
		}
		System.out.println("�׳�Ϊ��" + bi);
		String result = "" + bi;
		int count = 0;
		for (int i = result.length() - 1; i > 0 ; i--) {
			if(result.charAt(i) == '0'){
				count++;
			}else{
				break;
			}
		}
		System.out.println("0�ĸ���Ϊ��" + count);
	}

}
