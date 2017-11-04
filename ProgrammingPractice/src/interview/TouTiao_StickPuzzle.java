package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*��Ŀ��
��һ���ɺܶ�ľ�����ɵļ��ϣ�ÿ��ľ���ж�Ӧ�ĳ��ȣ������ܷ��ü����е���Щľ����ĳ��˳����β��������һ��������� 0  �ļ�
�����������ľ����Ҫ���ϣ��򵥶���μ������Խ��Ķ���Ρ�
��ʼ�����ǿյģ������ֲ�����Ҫô���������һ������Ϊ L  ��ľ����Ҫôɾȥ�������Ѿ��е�ĳ��ľ����ÿ�β����������㶼��Ҫ��
֪�Ƿ����ü����е���Щľ������һ���򵥶���Ρ�

��������:
ÿ���������������һ�����ݣ�ÿ�����ݵ�һ��Ϊһ�������� n ��ʾ����������(1 �� n �� 50000) �� ��������n�У�ÿ�е�һ������Ϊ
�������� i (i �� {1,2})���ڶ�������Ϊһ������ L(1 �� L �� 1,000,000,000)����� i=1 �����ڼ����ڲ���һ������Ϊ L ��ľ������� i=2 
����ɾȥ�ڼ����ڵ�һ������Ϊ L ��ľ�����������ݱ�֤ɾ��ʱ�����бض����ڳ���Ϊ L ��ľ��������������󼯺϶��Ƿǿյġ�
�������:
����ÿһ�β���������һ���������������ڵ�ľ�����Թ��ɼ򵥶���Σ���� "Yes" ��������� "No"��
ʾ��1
����
5
1 1
1 1
1 1
2 1
1 2
���
No
No
Yes
No
No*/
public class TouTiao_StickPuzzle {
	private static ArrayList<Integer> list = new ArrayList<>();
	private static int sum = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���������������");
		// ��ȡ�������
		int n = Integer.parseInt(sc.nextLine());
		// ��ȡÿ�εĲ������Ԫ��
		int flag = 1;
		int element = 0;

		for (int i = 0; i < n; i++) {
			flag = sc.nextInt();
			element = sc.nextInt();
			sc.nextLine();
			String re = handleElement(flag, element);
			System.out.println(re);
		}
		sc.close();
	}

	private static String handleElement(int flag, int element) {
		String re = null;
		if (flag == 1) {
			list.add(element);
			sum += element;
		} else {
			list.remove(element);
			sum -= element;
		}
		if (list.size() < 3) {
			return "No";
		}
		int max = Collections.max(list);
		int temp = sum - max;
		
		System.out.println("��ߣ�" + max + "...����ߵĺ�" +  temp);
		if (temp > max) {
			re = "Yes";
		} else {
			re = "No";
		}
		return re;
	}

}
