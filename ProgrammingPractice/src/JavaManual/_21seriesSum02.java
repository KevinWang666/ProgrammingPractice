package JavaManual;

//��1+2!+3!+...+20!�ĺ�
public class _21seriesSum02 {

	public static void main(String[] args) {
		// �����ÿһ���ֵ��Ȼ�������
		int num = 20;
		long sum = 0;
		long exp = 1;
		for (int i = 1; i <= num; i++) {
			exp *= i;
			System.out.println(exp);
			sum += exp;
		}
		System.out.println(sum);
	}
}
