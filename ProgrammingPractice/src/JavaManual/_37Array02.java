package JavaManual;

import java.util.ArrayList;
import java.util.Arrays;

/*��n����Χ��һȦ��˳���źš��ӵ�һ���˿�ʼ����(��1��3����)��������3�����˳�Ȧ�ӣ�
 ��������µ���ԭ���ڼ��ŵ���λ��*/
public class _37Array02 {

	public static void main(String[] args) {
		// ��1��n�����ִ�ŵ�����(List���ã���Ϊ�漰��ɾ��)��
		int n = 10;
		int count = 1;
		ArrayList<Integer> list = new ArrayList<>();
		while (list.size() < n) {
			list.add(count++);
		}
		System.out.println(list);

		// ѭ������������3ȥ��һ��
		int index = 0;
		for (int countNum = 0; countNum < n - 1; countNum++) {// ����ѭ��n -
																// 1�Σ��������һ������ȡֵ��
			if (index == list.size() - 1) {// �������ȡ�������ֵ����ô�͹���
				index = 0;
			}
			if ((index + 1) % 3 == 0) {// ���ڵ�ǰ������������Ԫ�ص�ɾ���������仯��������������3ȡģ���˴���1����Ϊ0�����ϴ洢����˳��Ϊ1����
				list.remove(index);
			}
			index++;
		}
		int result = list.get(index);// ȡ�������н�ʣ��һ��Ԫ�ؾ��������˵�˳��
		System.out.println(result);

	}

}
