package interview;

import java.util.LinkedList;
import java.util.Scanner;

/*���֮�£����ܷɡ������й�����ţ�У����ν����������ꡱ�� ����һ���ع���ʷ�Ļ��ᣬ��֪
 * һ֧��Ʊ����n��ļ۸����ƣ��Գ���Ϊn�����������ʾ�������е�i��Ԫ�أ�prices[i]������ù�
 * Ʊ��i��Ĺɼۡ�������һ��ʼû�й�Ʊ������������������1�ɶ�������1�ɵĻ��ᣬ��������ǰһ��
 * Ҫ�ȱ�֤����û�й�Ʊ�������ν��׻��ᶼ����������Ϊ0�� �跨�������ܻ�õ�������档 ������
 * ֵ��Χ��2<=n<=100��0<=prices[i]<=100
 *��������:
 *3,8,5,1,7,8
 *�������:
 *12
 **/
public class XiaoMiFlyingPig {

	public static void main(String[] args) {
		// �����������е������Сֵ����ֵ����һ�����ϣ��󼯺�����Ԫ����ӵõ������ֵ
		LinkedList<Integer> list = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] ins = input.split(" +");
		for (String str : ins) {
			list.add(Integer.parseInt(str));
		}
		System.out.println(list);// ���ڸ㶨������= =��Ҫ��Ҫ��ô�鷳����
		//����һ�����ֵ�ļ���
		LinkedList<Integer> res = new LinkedList<>();
 		
		for (int i = 0; i < ins.length; i++) {
			int len = 1;// ��¼�����г���
			int min = list.get(i);
			int max = list.get(i);
			int earn = 0;// ��������������Ǯ
			for (int j = i + 1; j < ins.length; j++) {
				if (list.get(j) > max) {//��һ��Ԫ�رȵ�ǰԪ�ش������г��ȼ�һ
					max = list.get(i);
						len++;
				}
				if (len == 1) {
					break;
				}
			}
			earn = max - min;
			//���뼯��
			res.add(earn);		
		}
		System.out.println(res);
		int maxEarn = getMaxEarn(res);
		System.out.println(maxEarn);
	}

	private static int getMaxEarn(LinkedList<Integer> list) {
		//���ؽ����Ԫ��������ӵ����ֵ
		int max = 0;
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				if(i == j){
					continue;
				}
				if(list.get(i) + list.get(j) > max){
					max = list.get(i) + list.get(j);
				}
			}
		}
		return max;
	}
}
