package JavaManual;
/*
 * ��̲����һ�����ӣ���ֻ�������֡���һֻ���Ӱ��������ƽ����Ϊ��ݣ�����һ����
 * ��ֻ���ӰѶ��һ�����뺣�У�������һ�ݡ��ڶ�ֻ���Ӱ�ʣ�µ�������ƽ���ֳ���
 * �ݣ��ֶ���һ������ͬ���Ѷ��һ�����뺣�У�������һ�ݣ����������ġ�����ֻ��
 * �Ӷ����������ģ��ʺ�̲��ԭ�������ж��ٸ�����?
 * */
public class _41MonkeyPeach {

	public static void main(String[] args) {

		for (int i = 10;; i++) {
			if (find(i, 5)) {
				System.out.println(i);
				break;
			}
		}
	}

	private static boolean find(int i, int j) {
		if ((i - 1) % 5 != 0) {
			return false;
		} else if (j == 1) {
			return true;
		} else {
			int sum = (i - 1) * 4 / 5;
			return find(sum, --j);
		}
	}
}
