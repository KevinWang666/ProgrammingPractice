package JavaManual;
//��������������m��n���������Լ������С��������
public class _06multipleAndDivisor {
	public static void main(String[] args){
		int m = 77;
		int n = 53;
		//��Լ��:�ӱȽ�С�����ֿ�ʼ���±�����ֻ�б��������ֶ�����ʱ����
		//������:�ӱȽϴ�����ֿ�ʼ���ϱ�����ֻ�����������ͬʱ��������������ʱ����
		int divisor = findCommonDivisor(m , n);
		
		int multiple = findCommonMultiple(m , n);
		
		System.out.println("���Լ��" + divisor + "   ��С������" + multiple);
	}

	private static int findCommonMultiple(int m, int n) {
		int max = m > n ? m : n;
		while (true) {
			if (max % m == 0 && max % n == 0) {
				return max;
			}
			max++;
		}
	}

	private static int findCommonDivisor(int m, int n) {
		int min = m < n ? m : n;
		for (int i = min; i > 0; i--) {
			if (m % i == 0 && n % i == 0) {
				return i;
			}
		}
		return 1;
	}
}
