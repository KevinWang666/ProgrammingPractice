package JavaManual;

import java.util.Scanner;

/*��һ��������5λ����������Ҫ��һ�������Ǽ�λ�������������ӡ����λ���֡�*/

public class _23HowOld {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("������һ����������");
		String str = sc.nextLine();
		System.out.println("����" + str.length() + "λ��");
		System.out.print("�������Ϊ��");
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}

}
