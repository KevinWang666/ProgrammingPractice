package AlgorithmAndProgrammingExcises;

import java.util.Scanner;

//��һ���ַ��������а��������ַ���Ӣ���ַ��������ַ�����ͳ�ƺʹ�ӡ�������ַ��ĸ�����
public class Test03_NumOfChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
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
		System.out.println("�����ַ��� " + n1 + " Ӣ���ַ��� " + n2 + " �����ַ���" + n3);
	}

}
