package JavaManual;

//��һ���������ֽ������������磺����90,��ӡ��90=2*3*3*5��
public class _04factorDecomposition {

	public static void main(String[] args) {
		// ѭ��������������Ϊ����
		int num = 16;
		int divisor = 2;// ������2��ʼ
		String result = "";
		int quotient = num;// �̴������������ʼ
		while (divisor < num) {// ��ѭ��ʱ�������Ĵ������е��ƣ����ܸ�����ı��������й�ϵ��= =

			if (isPrime(quotient)) {// ������Ϊ������˵�������һ����ʽ
				result += quotient;
				break;
			}
			if (quotient % divisor == 0) {
				result += divisor + "*";
				quotient = quotient / divisor;
				divisor = 2;
			} else {
				divisor++;
			}
		}
		System.out.println(result);
	}

	private static boolean isPrime(int quotient) {
		if (quotient == 2) {
			return true;
		}
		for (int i = 2; i <= quotient / 2; i++) {
			if (quotient % i == 0) {
				return false;
			}
		}
		return true;
	}
}
