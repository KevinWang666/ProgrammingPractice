package JavaManual;

import java.util.Scanner;

//һ��ż�����ܱ�ʾΪ��������֮�͡�
public class _44even {

	public static void main(String[] args) {
		// �ж��Ƿ��������ķ���
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��ż����");
		int num = sc.nextInt();
		int fator1 = 3;
		int fator2 = 3;
		long t1 = System.currentTimeMillis();
		for (int i = 3; i < num; i++) {
			if (isPrime(i) && isPrime(num - i)) {
					fator1 = i;
					fator2 = num - i;
			}
		}
		long t2 = System.currentTimeMillis();

		System.out.println(num + "=" + fator1 + "+" + fator2);
		System.out.println(t2 - t1);
	}

	private static boolean isPrime(int num) {
		if(num == 1 || num == 2){
			return false;
		}
		int flag = 1;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = 0;
			}
		}
		return flag == 1 ? true : false;
	}

}
