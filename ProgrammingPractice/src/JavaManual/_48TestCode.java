package JavaManual;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*ĳ����˾���ù��õ绰�������ݣ���������λ���������ڴ��ݹ�����
 * �Ǽ��ܵģ����ܹ������£�ÿλ���ֶ�����5,Ȼ���úͳ���10������
 * ��������֣��ٽ���һλ�͵���λ�������ڶ�λ�͵���λ������
 * */
public class _48TestCode {

	public static void main(String[] args) {
		// ��λ�п�����0�����Բ���ʹ��int��������
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫ���ܵ�����");
		String code = sc.nextLine();
		String[] crr = code.split("");
		for (int i = 0; i < crr.length; i++) {
			System.out.println(crr[i]);
			crr[i] = "" + (Integer.parseInt(crr[i]) + 5) % 10;
			System.out.println(crr[i]);
			System.out.println();
		}
		List<String> list = Arrays.asList(crr);
		Collections.reverse(list);
		String result = "";
		for (String string : list) {
			result += string;
		}
		System.out.println("���Ϊ��" + result);
	}
}
