package JavaManual;

import java.util.Scanner;

//�ж�һ�������ܱ�����9����
public class _45Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������");
		String str = sc.nextLine();
		int len = str.length();
		int num = Integer.parseInt(str);
		int res = 0;
		int con = num;
		
		while(con % 9 == 0){
			con = con / 9;
			res++;
		}
		System.out.println("���Ա�" + res + "��9����");
	}


}
