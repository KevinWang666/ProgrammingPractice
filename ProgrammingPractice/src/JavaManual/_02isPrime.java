package JavaManual;
//判断101-200之间有多101-200之间有少个素数，并输出所有素数。
public class _02isPrime {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 101; i < 201; i++) {
			if (isPrime(i)) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("101-200之间有" + count + "个素数");
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
