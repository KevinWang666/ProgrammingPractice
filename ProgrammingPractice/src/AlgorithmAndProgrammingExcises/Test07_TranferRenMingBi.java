package AlgorithmAndProgrammingExcises;

import java.util.Scanner;

//���ת�������������ֵĽ��ת�����й���ͳ����ʽ�磺����1011����>��һǧ��һʰһԪ���������
public class Test07_TranferRenMingBi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������:");
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder(str);
		str = sb.reverse().toString();
		char[] crr = str.toCharArray();
		System.out.println(crr);
		StringBuilder re = new StringBuilder("");
		for (int i = 0; i < crr.length; i++) {
			String temp = transfer(crr[i] , i);
			if(i % 4 == 3){//ǧλ
				re.append("Ǫ" + temp);
			}else if(i % 4 == 2){//��λ
				re.append("��" + temp);
			}else if(i % 4 == 1){//ʮλ
				re.append("ʰ" + temp);
			}else if(i == 0){//��λ
				re.append(temp);
			}else {//��λ
				re.append("��" + temp);
			}
		}
		re.reverse();
		
		re.append("Ԫ��");
		String result = re.toString().replaceAll("��[Ǫ,��,ʰ]", "��").replaceAll("����", "��").replaceAll("��+", "��");
		System.out.println(result);
	}

	private static String transfer(char c, int i) {
		String s = null;
		switch (c) {
		case '1':
			s = "Ҽ";
			break;
		case '2':
			s = "��";
			break;
		case '3':
			s = "��";
			break;
		case '4':
			s = "��";
			break;
		case '5':
			s = "��";
			break;
		case '6':
			s = "½";
			break;
		case '7':
			s = "��";
			break;
		case '8':
			s = "��";
			break;
		case '9':
			s = "��";
			break;
		case '0':
			s = "��";
			break;

		default:
			break;
		}
		return s;
	}

}
