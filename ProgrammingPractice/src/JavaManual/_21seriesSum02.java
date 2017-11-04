package JavaManual;

//求1+2!+3!+...+20!的和
public class _21seriesSum02 {

	public static void main(String[] args) {
		// 先求出每一项的值，然后在求和
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
