package arithmetic;

//�����ȫ�����㷨
public class Permutation {

	public static void main(String[] args) {
		String str = "abcdef";
		// ����˼·������ĸ+������ĸ��ȫ���У�Ȼ�������ĸ������ĸ�ֻ�λ�ã��ظ���������
		String[] strs = str.split("");
		permutation(strs, 0, strs.length);
	}

	private static void permutation(String[] strs, int begin, int end) {
		// ���ֻ��һ��Ԫ���ˣ����������ǰ���дε�����Ԫ��
		if (begin == end) {
			for (int i = 0; i < strs.length; i++) {
				System.out.print(strs[i]);
			}
			System.out.println();// ����
		} else {// ���򣬽�ÿһ��Ԫ�ض���Ϊ��Ԫ�أ�begin�����ټ��Ϻ���len - 1��Ԫ�ص�ȫ����
			for (int i = begin; i < strs.length; i++) {
				swap(strs, begin, i);// ��������λ
				permutation(strs, begin + 1, end);
				swap(strs, begin, i);// �ٻ������������ú�һ��Ԫ����Ϊ��λ
			}
		}
	}

	private static void swap(String[] strs, int i, int j) {
		String temp = strs[i];
		strs[i] = strs[j];
		strs[j] = temp;
	}

}
