package AlgorithmAndProgrammingExcises;

import java.util.ArrayList;
import java.util.Scanner;

/*��дһ����ȡ�ַ����ĺ���������Ϊһ���ַ������ֽ�������
��Ϊ���ֽڽ�ȡ���ַ�������Ҫ��֤���ֲ�����ȡ�������
����ABC����4��Ӧ�ý�ȡ����AB�������롰��ABC��DEF����6��
Ӧ���������ABC���������ǡ���ABC+���İ������*/
public class Test05_SubString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ַ�����");
		String str = sc.nextLine();
		String[] strs = str.split("");
		System.out.println("�������ֽ���");
		int n = sc.nextInt();
		ArrayList<String> list = new ArrayList<>();
		for (String string : strs) {
			list.add(string);
		}
		//System.out.println(list);
		int len = 0;
		String re = "";
		while(len < n  ){
			String s = list.remove(0);
			if((len += s.getBytes().length) > n){
				break;
			}
			re += s;
		}
		System.out.println(re);
	}

}
