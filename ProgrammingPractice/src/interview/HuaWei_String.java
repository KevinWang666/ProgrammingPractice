package interview;
import java.util.Arrays;

public class HuaWei_String {

	public static void main(String[] args) {
		// ����ַ�������ɾ���ظ��ַ���

		String str = "asdfghjkasdfghjkasdfghasdasdasal";
		// ���ַ���ת��Ϊ�ַ����飬�ӵڶ����ַ���ʼ�����ж�����֮ǰ�Ƿ��и���
		// �������û�����䵽���ַ���
		char[] ch = str.toCharArray();
		char[] result = new char[1];// ���ڴ�Ž��
		result[0] = ch[0];
		for (int i = 1; i < ch.length; i++) {
			int count = 0;// ���ڲ鿴�жϱ�������ʱ������ֵ
			for (int j = 0; j < i; j++) {
				if (ch[j] == ch[i]) {
					break;
				}
				count++;
			}
			if (count == i) {// ˵������ַ�֮ǰû�г��ֹ�
				result = Arrays.copyOf(result, result.length + 1);
				result[result.length - 1] = ch[i];
			}
		}
		System.out.println(Arrays.toString(result));
	}
}
