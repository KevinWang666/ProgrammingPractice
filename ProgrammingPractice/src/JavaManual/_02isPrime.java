package JavaManual;
//�ж�101-200֮���ж�101-200֮�����ٸ����������������������
public class _02isPrime {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 101; i < 201; i++) {
			if (isPrime(i)) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("101-200֮����" + count + "������");
	}

	private static boolean isPrime(int a) {
		for (int i = 2; i <= a / 2; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

}
