package JavaManual;
/*��дһ������������nΪż��ʱ��
 * ���ú�����1/2+1/4+...+1/n,
 * ������nΪ����ʱ�����ú���
 * 1/1+1/3+...+1/n(����ָ�뺯��)*/
public class _39Test {

	public static void main(String[] args) {
		int n = 99;
		double num = getSum(n);
		System.out.println(num);
	}

	private static double getSum(int n) {
		if(n == 0){
			return 0.0;
		}
		if (n == 1) {
			return 1.0;
		}
		return 1.0 / n + getSum(n - 2); 
	}

}
