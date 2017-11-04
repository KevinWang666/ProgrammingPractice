package JavaManual;
//输入两个正整数m和n，求其最大公约数和最小公倍数。
public class _06multipleAndDivisor {
	public static void main(String[] args){
		int m = 77;
		int n = 53;
		//公约数:从比较小的数字开始往下遍历，只有被两个数字都整数时才是
		//公倍数:从比较大的数字开始往上遍历，只有这个数字能同时被两个数字整除时才是
		int divisor = findCommonDivisor(m , n);
		
		int multiple = findCommonMultiple(m , n);
		
		System.out.println("最大公约数" + divisor + "   最小公倍数" + multiple);
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
